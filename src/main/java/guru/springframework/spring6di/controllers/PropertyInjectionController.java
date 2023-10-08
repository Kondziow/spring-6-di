package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class PropertyInjectionController {

    GreetingService greetingService;

    public  String sayHello(){
        return greetingService.sayGreeting();
    }
}
