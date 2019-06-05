package com.xingqi3.cangk.controller;

import java.io.StringReader;

import javax.xml.bind.JAXB;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xingqi3.cangk.domain.InMessage;
import com.xingqi3.cangk.service.MessageService;
import com.xingqi3.cangk.service.MessageTypeMapper;
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
	public String onMessage(@RequestParam("signature") String signature, //
			@RequestParam("timestamp") String timestamp, //
			@RequestParam("nonce") String nonce, //
			@RequestBody String xml) {
		LOG.debug("收到用户发送给公众号的信息: \n-----------------------------------------\n"
				+ "{}\n-----------------------------------------\n", xml);

		String type=xml.substring(xml.indexOf("<MsgType><![CDATA["));
		type=type.substring(0,type.indexOf("]]></MsgType>"));
		Class<InMessage> cla=MessageTypeMapper.getClass(type);
		
		InMessage inMessage=JAXB.unmarshal(new StringReader(xml), cla);
		
		LOG.debug("转换得到的消息对象\n{}\n",inMessage.toString());
		
		return "success";
	}
	
}
