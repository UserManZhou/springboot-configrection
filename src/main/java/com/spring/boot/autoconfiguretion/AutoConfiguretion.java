package com.spring.boot.autoconfiguretion;

import com.spring.boot.porperties.HelloPorperties;
import com.spring.boot.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties
@ConditionalOnMissingBean(HelloService.class)
@EnableConfigurationProperties({HelloPorperties.class})
public class AutoConfiguretion {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
