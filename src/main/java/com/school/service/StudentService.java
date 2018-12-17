package com.school.service;

import java.util.List;

import com.school.entity.Student;

public interface StudentService {

	List<Student> getFullTimeStudent();
	Long saveStudent(Student student);
	Student updateStudent(Student student);
}
