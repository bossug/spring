package ru.spring.lessons1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ru.spring.lessons1"})
public class AppConfig {
    @Bean
    public TestService2 testService2(){
        TestService2 testService2 = new TestService2();
        testService2.setValue("set value 1");
        return  testService2;
    }
}
