package com.cloud.student.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.student.model.Student;
import com.cloud.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/student")
	public List<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping(path = "/student/{id}")
	public Student get(@PathVariable("id") String id) {
		return studentService.findById(id);
	}

	@DeleteMapping(path = "/student/{id}")
	public Student delete(@PathVariable("id") String id) {
		return studentService.delete(id);
	}

	@PostMapping(path = "/student", consumes = "application/json")
	public Student save(@RequestBody Student student) {
		studentService.save(student);
		return student;
	}

	@PutMapping(path = "/student", consumes = "application/json")
	public Student update(@RequestBody Student student) {
		studentService.save(student);
		return student;
	}

}
