package com.algonquin.demo.post;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@RequestMapping(value="/posts")
	public static String welcome() {
		return "Welcome";
	}

}
