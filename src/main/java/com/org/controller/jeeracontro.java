package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entity.Jeeraentity;
import com.org.service.Demoservice;

@RestController
@RequestMapping("/demo")
public class jeeracontro {
	@Autowired
	private Demoservice demoservice;
	
	@PostMapping("/add")
	public Jeeraentity jeeraentity(@RequestBody Jeeraentity jeeraentity) {
		return demoservice.Add(jeeraentity);
		
	}

}
