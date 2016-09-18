package firstLesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.String;

@Configuration
@ComponentScan
public class HelloApplication {

    @Bean
    HelloService mockHelloService() {
        return new  HelloService() {
            public String getHello() {
                return "Hello Kryzsu! This would be the first lesson!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloApplication.class);
        HelloPrinter printer = context.getBean(HelloPrinter.class);
        printer.printHello();
    }
}