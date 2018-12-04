package com.petsvalley;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import javax.servlet.MultipartConfigElement;

@ServletComponentScan
@SpringBootApplication
@MapperScan("com.petsvalley.mapper")
public class PetsvalleyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetsvalleyApplication.class, args);
	}
/*	@Override
	protected SpringApplicationBuilder configure( SpringApplicationBuilder builder) {
		// 注意这里要指向原先用main方法执行的Application启动类
		return builder.sources(PetsvalleyApplication.class);extends SpringBootServletInitializer
	}*/
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		//文件最大
		factory.setMaxFileSize("50MB"); //KB,MB
		/// 设置总上传数据总大小
		//factory.setMaxRequestSize("102400KB");
		return factory.createMultipartConfig();
	}
}
