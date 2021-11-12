package com.venh.msa.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
	
	@Value("${venh.test}") 
	private String str; 
	
	@GetMapping("/test") 
	public String test() { 
		return str; 
	}
}
