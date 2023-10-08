package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {

        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {

        System.out.println(propertyInjectionController.sayHello());
    }
}