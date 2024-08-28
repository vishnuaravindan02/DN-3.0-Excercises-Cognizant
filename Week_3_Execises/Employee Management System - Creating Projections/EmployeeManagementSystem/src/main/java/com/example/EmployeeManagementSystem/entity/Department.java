package com.example.EmployeeManagementSystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "department")
@Getter
@Setter
@NoArgsConstructor
public class Department extends Auditable{
	
	//Setting the primary key for the table
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private String name;
	 
	 @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	 private List<Employee> employees;
	 
	 public Department() {
		 
	 }
	 
	 public Department(String name) {
	        this.name = name;
	 }

	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		this.name = (String) name2;
	}
	 

}
