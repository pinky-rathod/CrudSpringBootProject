package com.admin.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.admin.springcrud.bean.Subject;
import com.admin.springcrud.service.SubjectService;

@RestController
public class SubjectController
{
	@Autowired
	private SubjectService Subservice;
	
	@RequestMapping("/subjects")
	public List<Subject> AllSubjects()
	{
		return Subservice.getAllSubjects();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/subjects")
	public void addSubject(@RequestBody Subject subject)
	{
		Subservice.addSubject(subject);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/subjects/{id}")
	public void updateSubject(@PathVariable String id ,@RequestBody Subject subject)
	{
		Subservice.updateSubject(id,subject);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/subjects/{id}")
	public void deleteSubject(@PathVariable String id)
	{
		Subservice.deleteSubject(id);
	}
	
}



