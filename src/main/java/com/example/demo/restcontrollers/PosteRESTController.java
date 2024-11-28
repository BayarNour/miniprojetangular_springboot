package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Poste;
import com.example.demo.repos.PosteRepository;

@RestController
@RequestMapping("/api/poss")
@CrossOrigin("*")

public class PosteRESTController {
	
	@Autowired
	PosteRepository posteRepository;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Poste> getAllPoste()
	{
	return posteRepository.findAll();
	}

	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Poste getPosteById(@PathVariable("id") Long id) {
	return posteRepository.findById(id).get();
	}


}
