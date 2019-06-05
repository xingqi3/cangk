package com.xingqi3.cangk.domain.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingqi3.cangk.domain.InMessage;
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class TextInMessage extends InMessage{

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name="Content")
	@JsonProperty("Content")
	private String content;
	public TextInMessage() {
		super("text");
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	//如果要打印一些有含义的信息出来必须要重写此方法
	@Override
	public String toString() {
		return "TextInMessage [content=" + content + ", getToUserName()=" + getToUserName() + ", getFromUserName()="
				+ getFromUserName() + ", getCreateType()=" + getCreateType() + ", getMsgType()=" + getMsgType()
				+ ", getMsgId()=" + getMsgId() + "]";
	}
	
}
