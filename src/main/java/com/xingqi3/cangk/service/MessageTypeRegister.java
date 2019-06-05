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

public class MessageTypeRegister {
	
	private static Map<String,Class<?extends InMessage>> typeMap=new ConcurrentHashMap<>();
	
	static {
		register("text",TextInMessage.class);
		register("event",EventInMessage.class);
		register("location",LocationInMessage.class);
		register("image",ImageInMessage.class);
		register("video",VideoInMessage.class);
		register("shortvido",ShortvidoInMessage.class);
		register("voice",VoiceInMessage.class);
		register("link",LinkInMessage.class);

		
	}
	
	public static void register(String type,Class<?extends InMessage> cla){
		typeMap.put(type, cla);
		
	}
	public static Class<? extends InMessage> getClass(String type){
		return typeMap.get(type);
		
	}

}
