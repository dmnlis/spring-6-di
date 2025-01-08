package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Spring6DiApplication.class, args);

        var bean = applicationContext.getBean(MyController.class);

        bean.run();
    }

}
