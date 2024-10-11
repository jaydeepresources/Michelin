package hello;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SayHelloApplication {

//	mvn spring-boot:run
//    8090, 9092, 9999

    @Autowired
    private Environment environment;

    private static Logger log = LoggerFactory.getLogger(SayHelloApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SayHelloApplication.class, args);
    }

    @GetMapping("/greeting")
    public String greet() {
        log.info("Access /greeting");
        return "Hello from Port=" + environment.getProperty("local.server.port");
    }

}