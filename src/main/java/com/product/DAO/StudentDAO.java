package com.product.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.model.Student;
import com.product.repository.StudentRepository;
import com.product.vo.StudentDTO;

@Repository
public class StudentDAO {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student getStudentById(int id) {
		Student result = studentRepository.findById( id).get();
		return result;
	}

	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	public List<Student> getStudentByLastName(String lastName){
		return studentRepository.findByLastName(lastName);
	}
	
	public List<Student> getStudentByFirstAndLastName(String firstName, String lastName){
		return studentRepository.findByFirstAndLastName(firstName,lastName);
	}
	
	public List<StudentDTO> getStudentByFirstNameAndEmail(int id){
		List<Object[]> result = studentRepository.getFirstNameAndEmail( id);
		List<StudentDTO> studentLsit = new ArrayList<>();
		for(int i=0;i<result.size();i++) {
			Object[] studentData = result.get(i);
			StudentDTO student = new StudentDTO();
			student.setFirstName((String)studentData[0]);
			student.setEmail((String)studentData[1]);
			studentLsit.add(student);
		}
	return studentLsit;
	}
	}
