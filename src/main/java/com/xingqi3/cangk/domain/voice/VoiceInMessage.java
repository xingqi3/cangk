package com.xingqi3.cangk.domain.voice;

import javax.xml.bind.annotation.XmlElement;

import com.xingqi3.cangk.domain.InMessage;

public class VoiceInMessage extends InMessage {
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "MediaId")
	private String mediaId;
	@XmlElement(name = "Format")
	private String format;

	protected VoiceInMessage(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
