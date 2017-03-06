package com.example.rest;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {
	
	//http://localhost:8080/greet
	
	@RequestMapping(method=RequestMethod.GET,value="/greet"/*, produces=
			{MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}*/)
	public String greet(){
		return "Hello"+ new Date();
	}
}
