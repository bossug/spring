package ru.spring.lessons1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("testService")
public class TestService {
    @Value("123")
   public String value;


    public String getName(){
        return "Test1";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
