package com.xingqi3.cangk.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.xingqi3.cangk.domain.InMessage;
import com.xingqi3.cangk.domain.event.EventInMessage;
import com.xingqi3.cangk.domain.image.ImageInMessage;
import com.xingqi3.cangk.domain.link.LinkInMessage;
import com.xingqi3.cangk.domain.location.LocationInMessage;
import com.xingqi3.cangk.domain.shortvido.ShortvidoInMessage;
import com.xingqi3.cangk.domain.text.TextInMessage;
import com.xingqi3.cangk.domain.video.VideoInMessage;
import com.xingqi3.cangk.domain.voice.VoiceInMessage;



public class MessageTypeMapper {
	
	private static Map<String,Class<? extends InMessage>> typeMap=new ConcurrentHashMap<>();
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);
		typeMap.put("vioce", VoiceInMessage.class);
		typeMap.put("video", VideoInMessage.class);
		typeMap.put("event", EventInMessage.class);
		typeMap.put("location", LocationInMessage.class);
		typeMap.put("shortvido",ShortvidoInMessage.class);
		typeMap.put("link",LinkInMessage.class);
	}
	@SuppressWarnings("unchecked")
	public static <T extends InMessage> Class<T>getClass(String type){
		return (Class<T>) typeMap.get(type);
	}

}
