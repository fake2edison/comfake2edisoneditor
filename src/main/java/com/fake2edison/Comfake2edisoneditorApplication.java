package com.fake2edison;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fake2edison.mapper")
public class Comfake2edisoneditorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Comfake2edisoneditorApplication.class, args);
	}

}
