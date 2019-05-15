package com.xingqi3.cangk.domain.text;

import javax.xml.bind.annotation.XmlElement;

import com.xingqi3.cangk.domain.InMessage;

public class TextInMessage extends InMessage{

	private static final long seriaVersionUID=1L;
	@XmlElement(name="Content")
	private String content;
	public TextInMessage() {
		super("text");
	}
	
}
