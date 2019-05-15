package com.xingqi3.cangk.controller;

import java.io.Serializable;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlElement;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xingqi3.cangk.domain.InMessage;
import com.xingqi3.cangk.service.MessageService;
import com.xingqi3.cangk.service.MessageTypeRegister;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/sc/weixin/receiver")
public class MesseageReceiverController{
	
	@Autowired
	private MessageService messageService;
	
	private static final Logger LOG=(Logger) LoggerFactory.getLogger(MesseageReceiverController.class);

	@GetMapping 
	public String echo( 
		@RequestParam("signature") String signature,
		@RequestParam("timestamp") String timestamp,
		@RequestParam("nonce")String nonce,
    	@RequestParam("echostr")String echostr
		){
		return echostr; 
	}
	@PostMapping
	public String receice(
			@RequestParam(value="signature",required=false)String signature,
			@RequestParam(value="timestamp",required=false)String timestamp,
			@RequestParam(value="nonce",required=false)String nonce,
			@RequestBody String xml
			)	{
		LOG.trace("\n收到请求参数\n"
				+"   signature:{}\n"
				+"   timestamp:{}\n"
				+"   nonce:{}\n"
				+"收到的请求内容\n{}\n"
				,signature,timestamp,nonce,xml);
		
		String type=xml.substring(xml.indexOf("<MsgType><![CDATA[")+18);
		type=type.substring(0,type.indexOf("</MsgType>"));
		Class<? extends InMessage>cla=MessageTypeRegister.getClass(type);
		
 		
		
		InMessage inMessage=JAXB.unmarshal(xml,cla);
		this.messageService.onMessage(inMessage);
		return"success";		
	};
	
	}
