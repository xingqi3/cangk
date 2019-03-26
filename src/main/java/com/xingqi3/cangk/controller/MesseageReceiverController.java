package com.xingqi3.cangk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sc/weixin/receiver")
public class MesseageReceiverController{
	@GetMapping
	public String echo(
		String signature,
		String timestamp,
		String nonce,
		String echostr
		){
		return echostr; 
	}
}
