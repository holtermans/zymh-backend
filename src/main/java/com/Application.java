package com;

import com.util.ApiInfoHelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动入口
 */
@SpringBootApplication
@MapperScan("com.mapper")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
