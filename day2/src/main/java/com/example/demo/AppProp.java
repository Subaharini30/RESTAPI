
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppProp
{
	@Value("${greetings.message}")
	private String welcome;
	
	@GetMapping("/prop")
	public String welcome()
	{
		return welcome;
	}
}