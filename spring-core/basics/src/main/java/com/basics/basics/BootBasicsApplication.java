package com.basics.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BootBasicsApplication implements CommandLineRunner {

//	@Autowired
//	@Qualifier("first")
//	Message message;
//
//	@Autowired
//	@Qualifier("first")
//	Message message3;
//
//	@Autowired
//	@Qualifier("second")
//	Message message2;

	@Autowired
	Credentials credentials1;

	@Autowired
	Credentials credentials2;

	public static void main(String[] args) {
		SpringApplication.run(BootBasicsApplication.class, args);

//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Beans.class);
//		Message message1 = applicationContext.getBean(Message.class);
//		System.out.println(message1);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(message.hashCode());
//		System.out.println(message3.hashCode());
//
//		System.out.println(message2);

		System.out.println(credentials1.hashCode());
		System.out.println(credentials2.hashCode());

	}
}
