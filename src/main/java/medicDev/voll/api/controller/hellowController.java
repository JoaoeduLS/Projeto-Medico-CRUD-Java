package medicDev.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")

public class hellowController {
    @GetMapping
    public String olaMundo(){
        return "Hello World!";

    }
}
