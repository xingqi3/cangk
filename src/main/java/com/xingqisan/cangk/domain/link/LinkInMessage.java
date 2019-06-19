package com.xingqisan.cangk.domain.link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingqisan.cangk.domain.InMessage;

@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class LinkInMessage extends InMessage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected LinkInMessage(String type) {
		super(type);
		// TODO 自动生成的构造函数存根
	}
	@XmlElement(name = "Title")
	@JsonProperty("Title")
	private String title;
	@XmlElement(name = "Description")
	@JsonProperty("Description")
	private String description;
	@XmlElement(name = "Url")
	@JsonProperty("Url")
	private String url;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		url = url;
	}
	@Override
	public String toString() {
		return "LinkInMessage [title=" + title + ", description=" + description + ", url=" + url + ", getToUserName()="
				+ getToUserName() + ", getFromUserName()=" + getFromUserName() + ", getCreateType()=" + getCreateType()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	

}
