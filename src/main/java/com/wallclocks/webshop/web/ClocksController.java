package com.wallclocks.webshop.web;

import com.wallclocks.webshop.data.ClockItem;
import com.wallclocks.webshop.service.ClockService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClocksController {

	private final ClockService cservice;

	public ClocksController(ClockService cservice) {
		this.cservice = cservice;
	}

	@GetMapping("/clocks.html")
	public String all(Model model) {
		model.addAttribute("clocks", cservice.findAll());
		return "clocks/lists";
	}

	// @GetMapping(value = "/books.html", params = "isbn")
	// public String get(@RequestParam("isbn") String isbn, Model model) {

	// 	bookService.find(isbn)
	// 					.ifPresent(book -> model.addAttribute("book", book));

	// 	return "books/details";
	// }

	// @PostMapping("/books")
	// public Book create(@ModelAttribute Book book) {
	// 	return bookService.create(book);
	// }
}