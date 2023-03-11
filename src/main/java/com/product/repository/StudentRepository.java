package com.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("From Student where lastName=?1")
	List<Student> findByLastName(String lastName);
	
	@Query("From Student where firstName=?1 and lastName=?2")
	List<Student> findByFirstAndLastName(String firstName, String lastName);
	
	@Query("SELECT student.firstName, student.email From Student student where id=?1")
	List<Object[]> getFirstNameAndEmail(Integer id);
}
