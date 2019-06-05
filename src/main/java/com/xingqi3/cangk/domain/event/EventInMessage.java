package com.xingqi3.cangk.domain.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingqi3.cangk.domain.InMessage;
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventInMessage extends InMessage{

	@XmlElement(name="Event")
	@JsonProperty("Event")
	private String event;
	@XmlElement(name="EventKey")
	@JsonProperty("EventKey")
	private String eventKey;
	public EventInMessage() {
		super("event");
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	public static long getSeriaversionuid() {
		return getSeriaversionuid();
	}
	
}
