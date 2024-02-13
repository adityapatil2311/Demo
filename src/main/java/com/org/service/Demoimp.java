package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.org.entity.Jeeraentity;
import com.org.repository.Jeera;

@Service
@Component
public class Demoimp implements Demoservice {

	@Autowired
	private Jeera je;
	
	@Override
	public Jeeraentity Add(Jeeraentity jeeraentity) {
		Jeeraentity jeeraentity1= je.save(jeeraentity);
		
		return jeeraentity1;
	}

}
