package com.product.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.DAO.StudentDAO;
import com.product.model.Student;
import com.product.service.StudentService;
import com.product.vo.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public Student getStudentById(int id) {
		
		return studentDAO.getStudentById(id);
	}

	@Override
	@Transactional
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.addStudent(student);
	}
	
	@Override
	public List<Student> getStudentByLastName(String lastName){
		return studentDAO.getStudentByLastName(lastName);
	}
	
	@Override
	public List<Student> getStudentByFirstAndLastName(String firstName, String lastName){
		return studentDAO.getStudentByFirstAndLastName(firstName,lastName);
	}
	
	@Override
	public List<StudentDTO> getStudentByFirstNameAndEmail(int id){
		return studentDAO.getStudentByFirstNameAndEmail(id);
	}
}
