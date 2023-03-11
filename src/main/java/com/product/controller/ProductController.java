package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Student;
import com.product.service.StudentService;
import com.product.vo.StudentDTO;

@RestController
public class ProductController {
	

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/product")
	public String getOrder() {
		
		return "product1, product2";
	}

	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
	}
	
	@GetMapping("/studentByLastName/{lastName}")
	public List<Student> getStudentByLastName(@PathVariable String lastName){
		return studentService.getStudentByLastName(lastName);
	}
	
	@GetMapping("/studentByFirstAndLastName/{firstName}/{lastName}")
	public List<Student> getStudentByFirstAndLastName(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
		return studentService.getStudentByFirstAndLastName(firstName,lastName);
	}
	
	@GetMapping("/getStudentByFirstNameAndEmail/{id}")
	public List<StudentDTO> getStudentByFirstNameAndEmail(@PathVariable("id") int id){
		return studentService.getStudentByFirstNameAndEmail(id);
	}
}
