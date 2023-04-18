package com.example.demo.stream函数式编程;

public class Student {
	private String name;

	private Integer type;

	public Student(String name, Integer type, Integer age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
