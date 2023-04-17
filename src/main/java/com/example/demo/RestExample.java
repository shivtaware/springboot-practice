package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExample {
	@RequestMapping("/students")
	public List<Student> retrieveStudents(){
		return Arrays.asList(new Student(1,"Shiv","Taware"), new Student(2,"Pravin", "Kokane"), new Student(3,"Shubhangi", "Taware"));
	}
	
	
	
	

}
