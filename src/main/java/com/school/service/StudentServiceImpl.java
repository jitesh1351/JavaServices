package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entity.Student;
import com.school.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	StudentRepository studentRepository;
	@Override
	public List<Student> getFullTimeStudent() {
		// TODO Auto-generated method stub
		return studentRepository.getStudents();
	}

	@Override
	public Long saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student).getId();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
