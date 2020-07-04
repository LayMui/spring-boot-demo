package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller handling HTTP request
// Contoller that can handle REST method
@RestController
public class DemoController {
    // GET
    // URI - /hello-world
    // method - "Hello World"
   // @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    // This bean is automatically converted into JSON
    // and displayed as {"message":"hello World"}
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("hello World");
    }

    @GetMapping(path="/hello-world-bean/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("hello World %s", name));
    }
}
