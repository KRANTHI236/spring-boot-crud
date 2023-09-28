package com.sathguru;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

	@RequestMapping("hello")
	public String helloWorld() {

		return "hello spring project";
	}

}
