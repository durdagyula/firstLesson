package firstLesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.System;

@Component
public class HelloPrinter {

    final private HelloService service;

    @Autowired
    public HelloPrinter(HelloService service) {
        this.service = service;
    }

    public void printHello() {
        System.out.println(this.service.getHello());
    }
}