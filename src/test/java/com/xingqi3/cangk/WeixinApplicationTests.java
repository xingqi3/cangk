package com.xingqi3.cangk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WeixinApplicationTests {

	@Test
	public void contextLoads() {
	}

}
