package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleContoller {

	@RequestMapping("/")
	public String returnHello() {
		return "Meghana";
	}
}
