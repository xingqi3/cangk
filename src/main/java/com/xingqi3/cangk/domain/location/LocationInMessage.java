package com.xingqi3.cangk.domain.location;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingqi3.cangk.domain.InMessage;
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocationInMessage extends InMessage {

	@XmlElement(name = "location_x")
	@JsonProperty("location_x")
	private String Location_X;
	@XmlElement(name = "location_Y")
	@JsonProperty("location_Y")
	private String Location_Y;
	@XmlElement(name = "scale")
	@JsonProperty("scale")
	private String Scale;
	@XmlElement(name = "label")
	@JsonProperty("label")
	private String Label;

	protected LocationInMessage(String type) {
		super(type);
	}

	public String getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public static long getSeriaversionuid() {
		return getSeriaversionuid();
	}

	@Override
	public String toString() {
		return "LocationInMessage [Location_X=" + Location_X + ", Location_Y=" + Location_Y + ", Scale=" + Scale
				+ ", Label=" + Label + ", getToUserName()=" + getToUserName() + ", getFromUserName()="
				+ getFromUserName() + ", getCreateType()=" + getCreateType() + ", getMsgType()=" + getMsgType()
				+ ", getMsgId()=" + getMsgId() + "]";
	}
	
}