package com.cloud.student.model;

public class Student {

	private String id;
	private String name;
	private String email;

	public String getId() {
		return id;
	}

	public Student setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Student setName(String name) {
		this.name = name;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Student setEmail(String email) {
		this.email = email;
		return this;
	}

}
