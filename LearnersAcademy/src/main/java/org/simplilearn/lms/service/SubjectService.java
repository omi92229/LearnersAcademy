package org.simplilearn.lms.service;

import java.util.List;

import org.simplilearn.lms.entities.Subject;

public interface SubjectService {
	void addSubject(Subject subject);
	List<Subject> getSubjects();
}
