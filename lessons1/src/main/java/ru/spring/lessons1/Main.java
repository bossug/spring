package ru.spring.lessons1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        //TestService testService = context.getBean("testService", TestService.class);
        //System.out.println(testService.getValue());
        //System.out.println(testService.getName());
        //TestXmlService testXmlService = context.getBean("testXmlService", TestXmlService.class);
        //System.out.println(testXmlService.getName());
        //TestService2 testService2 = context.getBean("testService2", TestService2.class);
        //System.out.println(testService2.getValue());
        ProductService productService = context.getBean("productService", ProductService.class);
        System.out.println(productService.getProductList());
    }
}
