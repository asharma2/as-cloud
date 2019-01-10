package com.cloud.student.service;

import java.util.List;

import com.cloud.student.model.Student;

public interface StudentService {

	Student findById(String id);

	List<Student> findAll();

	void save(Student student);

	Student delete(String id);
}
