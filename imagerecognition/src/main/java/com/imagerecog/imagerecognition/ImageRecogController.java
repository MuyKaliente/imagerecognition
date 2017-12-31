package com.imagerecog.imagerecognition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageRecogController {
	
	@GetMapping("/")
	public String imageRecognizer()
	{
		return "Cat or Dog";
	}
	
}
