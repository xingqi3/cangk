package com.xingqisan.cangk.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xingqisan.cangk.domain.InMessage;


public class JsonRedisSerializer extends Jackson2JsonRedisSerializer<InMessage> {
	
	private ObjectMapper objectMapper = new ObjectMapper();

	public JsonRedisSerializer() {
		super(InMessage.class);
	}
	//序列化用
	@Override
	public byte[] serialize(InMessage t) throws SerializationException {
		// TODO 自动生成的方法存根
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream out=new DataOutputStream(baos);
try {		
		String className=t.getClass().getName();
		byte[] classNameBytes=className.getBytes("UTF-8");
		out.writeInt(classNameBytes.length);
		out.write(classNameBytes);
		
		byte[] data=super.serialize(t);
		out.write(data);
		
		byte[] result=baos.toByteArray();
		return result;
	}catch(Exception e){
	throw new SerializationException("序列化对象出现问题"+e.getLocalizedMessage());
}	
	//	return super.serialize(t);
	}
	//放序列化使用
	@Override
	public InMessage deserialize(byte[] bytes) throws SerializationException {
		ByteArrayInputStream bais=new ByteArrayInputStream(bytes);
		DataInputStream in =new DataInputStream(bais);
	try {	
		int length=in.readInt();
		byte[] classNameBytes=new byte[length];
		in.readFully(classNameBytes);
		String className=new String(classNameBytes,"UTF-8");
		Class<?>cla=Class.forName(className);
		// TODO 自动生成的方法存根
	}catch(Exception e) {
		throw new SerializationException("反序列化出现问题:"+e.getLocalizedMessage(),e);
	}
		return super.deserialize(bytes);
	}

}
