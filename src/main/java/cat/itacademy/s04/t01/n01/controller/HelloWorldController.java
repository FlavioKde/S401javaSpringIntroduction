package cat.itacademy.s04.t01.n01.controller;

import cat.itacademy.s04.t01.n01.controller.interfaces.Greet;
import cat.itacademy.s04.t01.n01.controller.interfaces.Greet2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController implements Greet, Greet2 {

    @Override
    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name) {

        return "Hello " + name + " A project is running in Maven";
    }

    @Override
    @GetMapping(value = {"/HelloWorld2", "HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name) {
        if (name == null || name.isBlank()) {
            name = "UNKNOW";
        }

        return "Hello " + name + " A project is running in Maven";
    }

}