package com.postgresql.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.app.model.Student;

@Repository
public interface StudentRepositoryI extends JpaRepository<Student, Integer>
{

	List<Student> findAllByUsernameAndPassword(String username, String password);

}
