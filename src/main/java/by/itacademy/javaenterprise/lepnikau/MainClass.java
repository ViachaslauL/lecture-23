package by.itacademy.javaenterprise.lepnikau;

import by.itacademy.javaenterprise.lepnikau.pojo.SomePojo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/context.xml");

        SomePojo somePojo = context.getBean(SomePojo.class);
        somePojo.firstMethod();
        somePojo.secondMethod("Some String", 10, 20.0);
    }
}
