package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;


import static guru.springframework.spring6di.Qualifiers.CustomQualifier;

@Service(CustomQualifier)
public class MyServiceImplThree implements MyService {

    @Override
    public void doSth() {
        System.out.println("something three");
    }
}
