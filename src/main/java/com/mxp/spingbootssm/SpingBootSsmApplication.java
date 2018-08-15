package com.mxp.spingbootssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 //开始swagger测试 swagger-ui.html
@SpringBootApplication
public class SpingBootSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingBootSsmApplication.class, args);
	}
}
