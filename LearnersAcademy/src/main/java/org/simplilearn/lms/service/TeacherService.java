package org.simplilearn.lms.service;

import org.simplilearn.lms.entities.Teacher;

public interface TeacherService {
	void addTeacher(Teacher teacher);
	Teacher getTeacher(String name);
}
