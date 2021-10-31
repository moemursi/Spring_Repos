package com.algonquin.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    private final Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello() {
        result.put("name", "Stephan");
        result.put("City" , "San jose");
        return result;
    }
}
