package simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringCore {
    public static void main(String[] args) {

//      Configure Spring with main application
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Message message1 = (Message) applicationContext.getBean("message1");
        System.out.println(message1);
        System.out.println(message1.hashCode());

        Message message2 = (Message) applicationContext.getBean("message1");
        System.out.println(message2);
        System.out.println(message2.hashCode());
//
//        Message message2 = (Message) applicationContext.getBean("message2");
//        System.out.println(message2);

    }
}
