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


	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}

}
