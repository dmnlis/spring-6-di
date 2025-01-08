package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void contextLoads() {
         var myCtrl = applicationContext.getBean(MyController.class);

         myCtrl.run();

    }

    @Test
    void contextLoads2() {
        myController.run();
    }

}
