package com.Spring_boot.CRUD_Operation.CRUDOperation.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
public class Student {
	
	@Id
	@NotBlank(message = "Email is mandatory")
	private int id;
	@Size(min=3, message="Name length is too short")
	@NotBlank(message = "Email is mandatory")
	private String first_name;
	@Size(min=3, message="Name length is too short")
	@NotBlank(message = "Email is mandatory")
	private String last_name;
	@NotBlank(message = "Email is mandatory")
	private String email;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String first_name, String last_name, int id, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
		this.email = email;
	}
	public Student() {
		
	}
	
	
	

}
