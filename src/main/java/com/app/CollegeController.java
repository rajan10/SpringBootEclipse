package com.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//used to define a Spring MVC controller that handles web requests and returns the response directly, typically in JSON format
@RestController //combines @ResponseBody and @Controller 

//This annotation specifies the base URL path for all the endpoints in the controller. 
//In this case, all endpoints in CollegeController will be under the "/college" path
@RequestMapping("/college")
public class CollegeController {

	
	//This annotation maps HTTP GET requests to the specified path. The {collegeId} is a path variable, and it will be dynamically replaced with the actual value provided in the request URL.
	@GetMapping("/{collegeId}")
	public ResponseEntity<College> getCollegeDetails(@PathVariable("collegeId") Long collegeId){
		
		College c1 = new College();
		c1.setCollegeId(1l);
		c1.setCollegeName("Corporate College");
		c1.setAddress("Kathmandu");
		return new ResponseEntity<College>(c1,HttpStatus.OK);
	}

}
