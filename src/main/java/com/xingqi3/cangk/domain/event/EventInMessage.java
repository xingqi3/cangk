package com.xingqi3.cangk.domain.event;

import javax.xml.bind.annotation.XmlElement;

import com.xingqi3.cangk.domain.InMessage;

public class EventInMessage extends InMessage{

	private static final long seriaVersionUID=1L;
	@XmlElement(name="event")
	private String event;
	public EventInMessage() {
		super("event");
	}
	
}
