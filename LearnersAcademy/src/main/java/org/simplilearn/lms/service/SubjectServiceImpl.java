package org.simplilearn.lms.service;

import java.util.List;

import org.simplilearn.lms.dao.SubjectDao;
import org.simplilearn.lms.dao.SubjectDaoImpl;
import org.simplilearn.lms.entities.Subject;

public class SubjectServiceImpl implements SubjectService{
	private SubjectDao dao=new SubjectDaoImpl();
	@Override
	public void addSubject(Subject subject) {
		dao.insert(subject);
	}
	@Override
	public List<Subject> getSubjects() {
		return dao.getAll();
	}
	

}
