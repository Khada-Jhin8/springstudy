package vip.zhguo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Man_ {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Rent_ landlady = context.getBean("landlady", Rent_.class);
        landlady.rent();

    }
}
