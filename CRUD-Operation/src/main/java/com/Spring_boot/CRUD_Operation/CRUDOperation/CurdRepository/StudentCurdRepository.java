package com.Spring_boot.CRUD_Operation.CRUDOperation.CurdRepository;
import com.Spring_boot.CRUD_Operation.CRUDOperation.model.Student;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCurdRepository extends JpaRepository<Student, Integer> {
	
	//Student findByFromAndTo(String from,String to);
	
	List<Student> findAll();

}
