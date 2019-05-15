package com.xingqi3.cangk.service;

import com.xingqi3.cangk.domain.InMessage;
import com.xingqi3.cangk.domain.OUtMessage;

public interface MessageService {
	OUtMessage onMessage(InMessage msg);
}
