package com.xingqi3.cangk.domain.event;

import javax.xml.bind.annotation.XmlElement;

import com.xingqi3.cangk.domain.InMessage;

public class EventInMessage extends InMessage{

	private static final long seriaVersionUID=1L;
	@XmlElement(name="Event")
	private String event;
	@XmlElement(name="EventKey")
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
		return seriaVersionUID;
	}
	
}
