package com.test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class AppTest {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(77);
		p.setName("Aatish");
		p.setSalary(1000.00);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<Person>> violations =	
									validator.validate(p);
		
		if(violations.isEmpty()){
			System.out.println(p);
		}
		else{
			System.out.println("Not a Proper bean");
			for(ConstraintViolation<Person> violation:violations){
				System.out.println(violation.getMessage());
			}
		}
	}

	
}
