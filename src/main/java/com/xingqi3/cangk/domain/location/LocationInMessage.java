package com.xingqi3.cangk.domain.location;

import javax.xml.bind.annotation.XmlElement;

import com.xingqi3.cangk.domain.InMessage;

public class LocationInMessage extends InMessage {

	private static final long seriaVersionUID = 1L;
	@XmlElement(name = "location_x")
	private String Location_X;
	@XmlElement(name = "location_y")
	private String Location_Y;
	@XmlElement(name = "scale")
	private String Scale;
	@XmlElement(name = "label")
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
		return seriaVersionUID;
	}

}