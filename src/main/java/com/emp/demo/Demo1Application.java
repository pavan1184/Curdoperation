package com.emp.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.demo.entity.Employee;
import com.emp.demo.repository.EmpRepository;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
	
	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1, "pavan" , 29000);
		Employee e2 = new Employee(2, "akhil" , 25000);
		Employee e3 = new Employee(3, "ramesh" ,24000);
		Employee e4 = new Employee(4, "suresh" ,35000);
		Employee e5 = new Employee(5, "hemanth",28000);
		Employee e6 = new Employee(6, "vinod" , 23000);
		Employee e7 = new Employee(7, "digvijay",40000);
		Employee e8 = new Employee(8, "rahul" , 32000);
		Employee e9 = new Employee(9, "kamalesh" ,27000);
		Employee e10 = new Employee(10, "somu" , 22000);
		
		empRepository.employee.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));
		
	}

}
