package com.xingqi3.cangk.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.xingqi3.cangk.domain.InMessage;
import com.xingqi3.cangk.domain.OUtMessage;
@EnableConfigurationProperties({MessageService.class})
public interface MessageService {
	OUtMessage onMessage(InMessage msg);
}
