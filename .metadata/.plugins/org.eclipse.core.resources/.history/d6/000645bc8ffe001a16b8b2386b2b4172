package com.Spring_boot.CRUD_Operation.CRUDOperation.Controller;
import com.Spring_boot.CRUD_Operation.CRUDOperation.CurdService.CrudService;
import com.Spring_boot.CRUD_Operation.CRUDOperation.model.Student;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentCurdRestController {
	
	@Autowired
	private CrudService crudservice;
	
	@GetMapping("/findallstudent")
public List <Student> fetchallstudentlist()
	{
		List<Student> student =new ArrayList<Student>();
		
		student = crudservice.fetchallstudentlist();
		return student;
	}
	
	@PostMapping("/addstudent")
	public Student savestudent(@RequestBody Student student)
	{
		return crudservice.savestudenttoDB(student);
		
	}
	@GetMapping("/getstudentbyID/{id}")
	public Student fetchstudentbyID(@PathVariable int id)
	{
		return crudservice.fetchstudentbyID(id).get();
	}
	@GetMapping("/deletestudent/{id}")
	public String DeleteStudentByID(@PathVariable int id)
	{
		return crudservice.DeleteStudentByID(id);
		
	}
	
	
}
