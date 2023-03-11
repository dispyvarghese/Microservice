package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.model.Student;
import com.product.vo.StudentDTO;

@Service
public interface StudentService {

	Student getStudentById(int id);

	Student addStudent(Student student);

	List<Student> getStudentByLastName(String lastName);

	List<Student> getStudentByFirstAndLastName(String firstName, String lastName);

	List<StudentDTO> getStudentByFirstNameAndEmail(int id);

}
