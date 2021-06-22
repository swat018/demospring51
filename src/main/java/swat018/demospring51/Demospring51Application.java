package swat018.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;
import swat018.out.MyService;

import java.util.function.Supplier;

@SpringBootApplication
public class Demospring51Application {

    @Autowired
    MyService myService;

    @Bean
    public MyService myService() {
        return new MyService();
    }

    public static void main(String[] args) {
//        SpringApplication.run(Demospring51Application.class, args);
        var app = new SpringApplication(Demospring51Application.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            ctx.registerBean(MyService.class);
            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Funaional Bean Definition!!"));
        });
        app.run(args);
    }

}
