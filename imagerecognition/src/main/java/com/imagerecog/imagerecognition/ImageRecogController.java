package com.imagerecog.imagerecognition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageRecogController {
	
	@GetMapping("/classify")
	public String imageRecognizerClassify()
	{
		return "Cat or Dog";
	}
	
	@GetMapping("/")
	public String imageRecognizer()
	{
		return "Welcome to Kalyan's Image Classifier";
	}
	
	
}
