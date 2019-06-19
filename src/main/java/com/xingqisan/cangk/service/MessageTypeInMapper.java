package com.xingqisan.cangk.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.xingqisan.cangk.domain.InMessage;
import com.xingqisan.cangk.domain.Image.ImageInMessage;
import com.xingqisan.cangk.domain.event.EventInMessage;
import com.xingqisan.cangk.domain.link.LinkInMessage;
import com.xingqisan.cangk.domain.location.LocationInMessage;
import com.xingqisan.cangk.domain.shortvido.ShortvidoInMessage;
import com.xingqisan.cangk.domain.text.TextInMessage;
import com.xingqisan.cangk.domain.video.VideoInMessage;
import com.xingqisan.cangk.domain.voice.VoiceInMessage;



public class MessageTypeInMapper {
	
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
	public static <T extends InMessage> Class<T>getClass(String type){
		return (Class<T>) typeMap.get(type);
	}

}
