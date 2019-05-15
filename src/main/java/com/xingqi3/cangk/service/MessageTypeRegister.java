package com.xingqi3.cangk.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.xingqi3.cangk.domain.InMessage;
import com.xingqi3.cangk.domain.event.EventInMessage;
import com.xingqi3.cangk.domain.text.TextInMessage;

public class MessageTypeRegister {
	
	private static Map<String,Class<?extends InMessage>> typeMap=new ConcurrentHashMap<>();
	
	static {
		register("text",TextInMessage.class);
		register("event",EventInMessage.class);
		register("location",TextInMessage.class);
		register("image",TextInMessage.class);
		register("video",TextInMessage.class);
		register("shortvido",TextInMessage.class);
		register("voice",TextInMessage.class);
		
	}
	
	public static void register(String type,Class<?extends InMessage> cla){
		typeMap.put(type, cla);
		
	}
	public static Class<? extends InMessage> getClass(String type){
		return typeMap.get(type);
		
	}

}
