package com.petsvalley.config;

import javax.sql.DataSource;

import com.alibaba.druid.filter.config.ConfigTools;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Primary;

/**
 * 配置druid需要的配置类，引入application.properties文件中以spring.datasource开头的信息
 * 因此需要在application.properties文件中配置相关信息。
 * @author Administrator
 *
 */
@Configuration
public class DruidConfig {

    String username="lJSa3h1M5Qcg0nPUmq8bdteTBynD7KRFmrVMj6/R2dH0ItXxp7KGCLg8IDnhTK6YJLjGH/bqHtPuMkoDEwxo/w==";
    String publicKey1="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKjnR8FbUH0ibvKjSe5lh91w0s6qH4N5IBFRPa1F1OwTrxeo+mf+F54I1Qq0WiXvjnoMcgCbE6bsQT70y53IRQkCAwEAAQ==";
    String publicKey="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKauMPjLGDBonsn9kSEWNlJwP0jRLKFW+HJRZ0orZQ2lT7y7ILjlDU4V963uWIdyQWvhLei9Gh7kYdgXsH34S5kCAwEAAQ==";
    String password="ia0PFmIBCW++ilZ3tSVznGuK18bz0dyb4YEaUC7EkAOKcUZP1UrcH261I7jkM0MxTiakgZ3n95t2iY4PD34N1A==";
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DataSource druidDataSource() throws Exception {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUsername(ConfigTools.decrypt(publicKey1,username));
        datasource.setPassword( ConfigTools.decrypt(publicKey,password));
        return datasource;
    }
}