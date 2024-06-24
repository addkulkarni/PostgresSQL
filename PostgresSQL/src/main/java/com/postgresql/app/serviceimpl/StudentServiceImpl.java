package com.postgresql.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgresql.app.model.Student;
import com.postgresql.app.repository.StudentRepositoryI;
import com.postgresql.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI
{
	@Autowired
	StudentRepositoryI sr;

	@Override
	public List<Student> getdata(String username, String password)
	{
		if(username.equals("admin")&&password.equals("admin"))
		{
			System.out.println(username+" "+password);
			List<Student> l = sr.findAll();
			return l;
		}
		else
		{
			List<Student> l = sr.findAllByUsernameAndPassword(username, password);
			return l;
		}
	}

	@Override
	public void savedata(Student s)
	{
		sr.save(s);
	}

	@Override
	public Student getStudent(int id)
	{
		return sr.findById(id).get();
	}

	@Override
	public List<Student> updatedata(Student s)
	{
		sr.save(s);
		return sr.findAll();
	}

	@Override
	public List<Student> deletedata(int id)
	{
		sr.deleteById(id);
		return sr.findAll();
	}
}
