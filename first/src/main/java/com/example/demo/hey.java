package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class hey {
	
	@RequestMapping	(method= RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "Hello mothafucka";
	}
	
	@RequestMapping (path = "/score", method = RequestMethod.GET)
	public String update(String rev) {
		StringBuilder sb = new StringBuilder(rev);
		return sb.reverse().toString();
	}
	
	@RequestMapping (method= RequestMethod.GET, path="/plus")
	public int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	@RequestMapping (method= RequestMethod.GET, path="/minus")
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	@RequestMapping (method= RequestMethod.GET, path="/multi")
	public double multi(double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
			
	@RequestMapping (method= RequestMethod.GET, path="/div")
	public double div(double num1, double num2) {
		return num1 / num2;
	}
	

	

}
