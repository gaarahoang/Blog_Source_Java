package com.longlvq.java.my_blog.it.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "Hành à. mi ngu quá";
	}
}
