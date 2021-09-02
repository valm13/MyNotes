package com.dilitrust.recruitement.magnan.mynotes.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "Bienvenue sur MyNotes");
		return "index";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

}
