package objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringObjectInjection {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_objects.xml");

        Message message1 = (Message) applicationContext.getBean("message1");
        System.out.println(message1);

        Message message2 = (Message) applicationContext.getBean("message2");
        System.out.println(message2);


    }
}