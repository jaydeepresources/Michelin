package com.basics.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

//    @Scope("prototype")
//    @Bean(name="first")
//    public Message getMessage(){
//        Message message = new Message("First Annotation Bean");
//        return message;
//    }
//
//    @Bean(name="second")
//    public Message getAnotherMessage(){
//        Message message = new Message("Second Annotation Bean");
//        return message;
//    }

    @Bean
    @Scope("prototype")
    public Credentials getCredentials(){
        return Credentials.getCredentials();
    }

}
