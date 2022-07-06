package com.kabilova.bookstores.controller;

import com.kabilova.bookstores.model.Bookstore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateNewBookstoreController {

	@GetMapping("/createNewBookstore")
	public String createNewBookstore(Model model) {
		model.addAttribute("bookstore", Bookstore.builder()
				.name("Orange")
				.city("Varna")
				.build());

		return "createNewBookstore";
	}

	@PostMapping("/addBookstore")
	public String addBookstore(@ModelAttribute("bookstore") Bookstore bookstore, Model model) {
		return "createNewBookstore";
	}
}
