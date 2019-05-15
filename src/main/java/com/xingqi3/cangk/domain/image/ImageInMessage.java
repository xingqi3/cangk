package com.xingqi3.cangk.domain.image;

import javax.xml.bind.annotation.XmlElement;

import com.xingqi3.cangk.domain.InMessage;

public class ImageInMessage extends InMessage {
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "PicUrl")
	private String picUrl;
	@XmlElement(name = "MediaId")
	private String mediaId;

	protected ImageInMessage(String type) {
		super(type);

	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}