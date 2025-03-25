package com.web.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//courses
//Course: id ,name,author


@RestController
public class CurrencyConfigurationController {
	
	
	@RequestMapping("/courses")
	public List<Courses> retriveAllCourses(){
		return Arrays.asList(
				
				new Courses(1,"Learn AWS","in28minutes"),

				new Courses(2,"Learn devops","in28minutes"),
				
				new Courses(3,"Linux","in28minutes")
				
				);
	}


}
