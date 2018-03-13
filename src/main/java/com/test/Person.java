package com.test;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	@NotNull(message="Name should not be null")
	@Size(min=4,max=15, message="Name should be between 4 to 15 chars")
	private String name;
	
	@NotNull(message="Should not be null")
	@Min(value=10000,message="min salary: 10000")
	private Double salary;
	
	@NotNull(message="Should not be null")
	@Min(value=15,message="min age: 15") @Max(value=70,message="max age 70")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
}
