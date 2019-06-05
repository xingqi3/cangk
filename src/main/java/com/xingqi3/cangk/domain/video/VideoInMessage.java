package com.xingqi3.cangk.domain.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingqi3.cangk.domain.InMessage;
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class VideoInMessage extends InMessage {

	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String mediaId;
	@XmlElement(name = "ThumbMediaId")
	@JsonProperty("ThumbMediaId")
	private String thumbMediaId;

	protected VideoInMessage(String type) {
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

	public static long getSeriaversionuid() {
		return getSeriaversionuid();
	}

}
