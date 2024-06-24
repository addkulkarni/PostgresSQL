package com.postgresql.app.servicei;

import java.util.List;

import com.postgresql.app.model.Student;

public interface StudentServiceI
{

	List<Student> getdata(String username, String password);

	void savedata(Student s);

	Student getStudent(int id);

	List<Student> updatedata(Student s);

	List<Student> deletedata(int id);

}
