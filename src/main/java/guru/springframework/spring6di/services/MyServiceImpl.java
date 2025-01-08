package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MyServiceImpl implements MyService {

    @Override
    public void doSth() {
        System.out.println("something");
    }
}
