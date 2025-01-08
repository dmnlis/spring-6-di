package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllerSetterInjection {

    private MyService myService;

    @Autowired
    @Qualifier("myServiceImplTwo")
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public void run() {
        myService.doSth();
    }

}
