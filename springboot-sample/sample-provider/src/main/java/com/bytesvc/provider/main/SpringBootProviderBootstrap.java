package com.bytesvc.provider.main;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(scanBasePackages = { "com.bytesvc.provider" })
@EnableAutoConfiguration(exclude = { MongoAutoConfiguration.class }) // 使用文件存储时, 不需要配置mongodb
public class SpringBootProviderBootstrap {
	static Logger logger = LoggerFactory.getLogger(SpringBootProviderBootstrap.class);

	public static void main(String[] args) throws IOException {
		SpringApplication application = new SpringApplication(SpringBootProviderBootstrap.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		logger.info("springboot provider start success");
	}

}
