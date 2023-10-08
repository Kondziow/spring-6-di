package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    void setUp() {
        constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectionController.sayHello());
    }
}