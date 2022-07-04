package com.kabilova.bookstores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class BookstoresController {

	private String message;

	@GetMapping({"/", "/bookstores"})
	public String bookstores(Model model) {
		model.addAttribute("allBookstores", new ArrayList<>());

		return "bookstores";
	}
}