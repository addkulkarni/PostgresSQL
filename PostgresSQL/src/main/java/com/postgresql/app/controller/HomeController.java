package com.postgresql.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.postgresql.app.model.Student;
import com.postgresql.app.servicei.StudentServiceI;

@Controller
public class HomeController
{
	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("openreg")
	public String openreg()
	{
		return "register";
	}
	
	@RequestMapping("register")
	public String register(@ModelAttribute Student s)
	{
		ssi.savedata(s);
		return "login";
	}
	
	@RequestMapping("login")
	public String login(@RequestParam("username")String username, @RequestParam("password")String password,ModelMap m)
	{
		List<Student> l = ssi.getdata(username,password);
		System.out.println(l);
		if(l.isEmpty())
		{
			return "login";
		}
		else
		{
			m.put("data", l);
			return "success";
		}
	}
	
	@RequestMapping("edit")
	public String editdata(@RequestParam("id")int id,ModelMap m)
	{
		Student s = ssi.getStudent(id);
		m.put("s", s);
		return "edit";
	}
	
	@RequestMapping("update")
	public String updatedata(@ModelAttribute Student s,ModelMap m)
	{
		List<Student> l = ssi.updatedata(s);
		m.put("data", l);
		return "success";
	}
	
	@RequestMapping("delete")
	public String deletedata(@RequestParam("id")int id, ModelMap m)
	{
		List<Student> l = ssi.deletedata(id);
		m.put("data", l);
		return "success";
	}
}
