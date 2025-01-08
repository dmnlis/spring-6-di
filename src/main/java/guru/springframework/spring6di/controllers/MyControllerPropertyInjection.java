package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.Qualifiers;
import guru.springframework.spring6di.services.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


import static guru.springframework.spring6di.Qualifiers.CustomQualifier;

@Controller
public class MyControllerPropertyInjection {

    @Autowired
    @Qualifier(CustomQualifier)
    private MyService myService;

    public void run() {
        myService.doSth();
    }

}
