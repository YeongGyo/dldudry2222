package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

	@GetMapping("/")
	public String list() {
		return "board/list";
	}
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	@GetMapping("/update")
	public String update() {
		return "board/update";
	}
}
