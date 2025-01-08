package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImplTwo implements MyService {

    @Override
    public void doSth() {
        System.out.println("something two");
    }
}
