package com.xingqi3.cangk.service.impl;

import org.apache.commons.logging.Log;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.xingqi3.cangk.controller.MesseageReceiverController;
import com.xingqi3.cangk.domain.InMessage;
import com.xingqi3.cangk.domain.OUtMessage;
import com.xingqi3.cangk.service.MessageService;

import ch.qos.logback.classic.Logger;
@Service
public class MessageServiceimpl implements MessageService{
	
	private static final Logger LOG=(Logger) LoggerFactory.getLogger(MesseageReceiverController.class);
	@Override
	public OUtMessage onMessage(InMessage msg) {
		LOG.trace("转换后的消息对象:\n{}\n",msg);
		return null;
	}


}
