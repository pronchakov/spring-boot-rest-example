package edu.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/service")
public class Logic {

    private static final Logger log = LoggerFactory.getLogger(Logic.class);

    @GetMapping(path = "/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "Hello " + name;
    }

}
