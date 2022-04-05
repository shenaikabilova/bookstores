package com.kabilova.bookstores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookstoresController {

	private String message;

	@GetMapping("/bookstores")
	public String bookstores(Model model) {
		model.addAttribute("message", "test");

		return "bookstores";
	}
}