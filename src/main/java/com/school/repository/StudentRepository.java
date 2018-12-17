package com.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	
	//@Query("SELECT count(*) FROM OnBoardingUser obu where obu.userKycStatus = ?1")
	Student save(Student st);
	
	@Query("SELECT s FROM Student s ")//s where s.fullTime = true
	List<Student> getStudents();

}
