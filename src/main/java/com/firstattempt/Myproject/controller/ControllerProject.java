package com.firstattempt.Myproject.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerProject {
	@GetMapping("/getmethod")
public String getmethod(@RequestParam String name)
{
		String msg = "I am waiting to join on March 13th"+name;
		
	return msg;
}
	@PostMapping("/postmethod")
	public String postmethod()
	{
			String msg = "I am in post method";
			
		return msg;
}
	@PutMapping("/putmethod")
	public String putmethod()
	{
			String msg = "I am in put method";
			
		return msg;
}
	@PatchMapping("/patchmethod")
	public String patchmethod()
	{
			String msg = "I am in patch method";
			
		return msg;
	}
	@DeleteMapping("/deletemethod")
	public String deletemethod()
	{
			String msg = "I am in Delete method";
			
		return msg;
	}
}