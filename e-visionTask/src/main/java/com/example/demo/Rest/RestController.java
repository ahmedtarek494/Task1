package com.example.demo.Rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.DTOs.Employee;
import com.example.demo.bussiness.EmployeeService;

;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/test")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	EmployeeService mostRecentNewsService;

	@PostMapping(path = "/all" , consumes = "text/plain" )
	public ResponseEntity<String> getMostRecentNews(@Valid @RequestBody(required=true) String request) {
	  System.out.println("rest");
		return ResponseEntity.ok(mostRecentNewsService.processemp(request));

	}

}
