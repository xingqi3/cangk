package com.xingqisan.cangk.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public abstract class InMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "ToUserName")
	@JsonProperty("ToUserName")
	private String toUserName;

	@XmlElement(name = "FromUserName")
	@JsonProperty("FromUserName")
	private String fromUserName;

	@XmlElement(name = "CreateType")
	@JsonProperty("CreateType")
	private String createType;

	@XmlElement(name = "MsgType")
	@JsonProperty("MsgType")
	private String msgType;

	@XmlElement(name = "MsgId")
	@JsonProperty("MsgId")
	private Long msgId;

	public InMessage() {
	}

	protected InMessage(String type) {
		this.msgType = type;

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
