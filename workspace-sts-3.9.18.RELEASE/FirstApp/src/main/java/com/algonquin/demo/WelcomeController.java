package com.algonquin.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

  @RequestMapping(value="/welcome")
  public static String welcome() {
    return "index";
  }

}
