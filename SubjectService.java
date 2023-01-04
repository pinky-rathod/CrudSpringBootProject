package com.admin.springcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.springcrud.bean.Subject;
import com.admin.springcrud.repository.SubjectRepository;

@Service
public class SubjectService 
{
	@Autowired
	public SubjectRepository subjectrepo;

	public List<Subject> getAllSubjects()
	{

		List<Subject> subjects = new ArrayList<>();
		subjectrepo.findAll().forEach(subjects::add);
		return subjects;

	     
	}

	public void addSubject(Subject subject) {
		subjectrepo.save(subject);
		
	}

	public void updateSubject(String id, Subject subject) {
		subjectrepo.save(subject);
		
	}

	public void deleteSubject(String id) {
		subjectrepo.deleteById(id);
		
	}
}
