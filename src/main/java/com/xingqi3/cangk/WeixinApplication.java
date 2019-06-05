package com.xingqi3.cangk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.xingqi3.cangk.domain.InMessage;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WeixinApplication {

	@Bean
	public RedisTemplate<String, InMessage> inMessageTemplate(
			@Autowired RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<String, InMessage> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}

}
