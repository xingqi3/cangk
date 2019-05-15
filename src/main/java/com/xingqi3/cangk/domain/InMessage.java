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

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getCreateType() {
		return createType;
	}

	public void setCreateType(String createType) {
		this.createType = createType;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

}
