package com.school.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.Student;
import com.school.service.StudentService;



@RestController
@RequestMapping("/school/v1")
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;



	@GetMapping(value = "/students", produces = "application/json")
	public List<Student> getFullTimeStudent() throws Exception {
		
		logger.info("Entered in method-getFullTimeStudent of class-StudentController at {}",
				System.currentTimeMillis());
		return studentService.getFullTimeStudent();
	}
	

	@PutMapping(value = "/students", produces = "application/json")
	public Student updateStudent(@RequestBody Student student) throws Exception {

		logger.info("Entered in method-updateStudent of class-StudentController at {}",
				System.currentTimeMillis());
		
		return studentService.updateStudent(student);
	}
	

	@PostMapping(value = "/students", produces = "application/json")
	public Long studentAdmission(@RequestBody Student student) throws Exception {

		logger.info("Entered in method-studentAdmission of class-StudentController at {}",
				System.currentTimeMillis());
		return studentService.saveStudent(student);
	}
}
