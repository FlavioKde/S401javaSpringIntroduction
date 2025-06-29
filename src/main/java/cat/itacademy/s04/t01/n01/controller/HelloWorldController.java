package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Api")
public class HelloWorldController{


    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {

        return "Hello " + name + " A project is running in Maven";
    }


    @GetMapping(value = {"/HelloWorld2", "HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name) {
        String finalName = (name != null) ? name : "UNKNOW";

        return "Hello " + finalName + " A project is running in Maven";
    }

}