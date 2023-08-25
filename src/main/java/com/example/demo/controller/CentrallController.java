package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.VisitersParameters;
import com.example.demo.service.VisitersServiceImplementation;

@CrossOrigin("*")
@RestController
@Controller
@RequestMapping("/visiter-api")
public class CentrallController {
	
	@Autowired
	VisitersServiceImplementation visitersService;
	
	
	@PostMapping("/create")
	public VisitersParameters saveVisiter(@RequestBody VisitersParameters visitersParameters) {
		System.out.println(visitersParameters);
		return visitersService.saveVisiter(visitersParameters);
	}

}
