package com.xingqi3.cangk.controller;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/sc/weixin/receiver")
public class MesseageReceiverController{
	
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
		return"success";		
	};
	
	}
