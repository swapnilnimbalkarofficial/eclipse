package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public void m1() {
		System.out.println("m1 method");
	}
	@RequestMapping(value="/Reqe1",method=RequestMethod.GET)
	public void m2() {
		System.out.println("m2 method");
	}
	
	@GetMapping(value="/reqe2")
	public String m3() {
		return "hello";
	}
	
	@GetMapping(value="/req3")
	public int m4(int a) {
		return a;	
	}
	
	@GetMapping(value="/req5")
	public int m5(int a, int b) {
		return a+b; 
	}
	
	@GetMapping(value="/req6")
	public String m6(String s1, String s2) {
		return s1+" "+s2;
	}
	
	@GetMapping(value="/req8")
	public String m7(@RequestParam("s1") String value1,@RequestParam("s2") String value2) {
		return value1+" "+value2;
	}
	
	@GetMapping(value="/req9{a}/{b}")
	public String m8(@PathVariable ("a")String value1,@PathVariable ("b")String value2) {
		return value1+" "+value2;
	}
	
	@GetMapping(value="/req8")
	public String m9(@PathVariable String value1,@PathVariable String value2) {
		return value1+" "+value2;
	}
	
	@GetMapping(value="req9/{a}")
	public int [] m10(@PathVariable int a[]){
		return a;
	}
	
	@GetMapping(value="/req10")
	public int [] m11(@RequestBody int a[]) {
		return a;
	}
	
	
	
}
