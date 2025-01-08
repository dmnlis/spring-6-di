package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.MyService;

import org.springframework.stereotype.Controller;

@Controller
public class MyControllerConstructorInjection {

    private final MyService myService;

    public MyControllerConstructorInjection(MyService myService) {
        this.myService = myService;
    }

    public void run() {
        myService.doSth();
    }

}
