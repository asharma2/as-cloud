package com.cloud.student.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.cloud.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private Map<String, Student> students = new HashMap<>();

	@PostConstruct
	public void postConstruct() {
		students.put("1", new Student().setEmail("a@cloud.com").setId("1").setName("A CLOUD"));
		students.put("2", new Student().setEmail("b@cloud.com").setId("2").setName("B CLOUD"));
		students.put("3", new Student().setEmail("c@cloud.com").setId("3").setName("C CLOUD"));
	}

	@Override
	public Student findById(String id) {
		return students.get(id);
	}

	@Override
	public List<Student> findAll() {
		return new LinkedList<>(students.values());
	}

	@Override
	public void save(Student student) {
		students.put(student.getId(), student);
	}

	@Override
	public Student delete(String id) {
		return students.remove(id);
	}

}
