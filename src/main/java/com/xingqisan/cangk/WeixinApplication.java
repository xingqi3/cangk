package com.xingqisan.cangk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.xingqisan.cangk.domain.InMessage;
import com.xingqisan.cangk.service.JsonRedisSerializer;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WeixinApplication {

	@Bean
	public RedisTemplate<String, InMessage> inMessageTemplate(
			@Autowired RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<String, InMessage> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		//设置一个序列化程序
		template.setValueSerializer(new JsonRedisSerializer());
		
		return template;
	
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}

}
