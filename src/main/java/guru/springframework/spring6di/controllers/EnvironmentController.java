package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnviromentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnviromentService enviromentService;

    public EnvironmentController(EnviromentService enviromentService) {
        this.enviromentService = enviromentService;
    }
    public String getEnvironment() {
        return "You are in " + enviromentService.getEnv() + " Environment";
    }
}
