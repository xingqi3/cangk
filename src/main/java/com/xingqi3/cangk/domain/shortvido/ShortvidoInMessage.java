package com.xingqi3.cangk.domain.shortvido;

import javax.xml.bind.annotation.XmlElement;

import com.xingqi3.cangk.domain.InMessage;

public class ShortvidoInMessage extends InMessage {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "MediaId")
	private String mediaId;
	@XmlElement(name = "ThumbMediaId")
	private String thumbMediaId;

	protected ShortvidoInMessage(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
