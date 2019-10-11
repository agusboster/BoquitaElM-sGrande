package com.BocaJuniors.turnosKinesiolog.a.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/brava")
public class JR10Controller {
	
		
		@GetMapping("")
		public String getAllEmployees() {
			return "Todo Boca";
		}
}
