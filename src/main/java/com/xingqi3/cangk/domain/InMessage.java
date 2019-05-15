package com.xingqi3.cangk.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public abstract class InMessage implements Serializable{
	
	@XmlElement(name="ToUserName")
	private String toUserName;

	@XmlElement(name="FromUserName")
	private String fromUserName;
	
	@XmlElement(name="CreateType")
	private String createType;
	
	@XmlElement(name="MsgType")
	private String msgType;
	
	@XmlElement(name="MsgId")
	private Long msgId;
	
	protected InMessage(String type) {
		this.msgType=type;
		
	}

}
