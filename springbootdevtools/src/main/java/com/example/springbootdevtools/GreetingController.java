package com.example.springbootdevtools;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    String greetingPage(ModelMap map, @RequestParam(required = false) Map<String, String> parameters) {

        String name = parameters.get("name");
        String surname = parameters.get("surname");

        map.put("title", "Atmosware");
        map.put("name", name);
        map.put("surname", surname);
        return "index";
    }

}
