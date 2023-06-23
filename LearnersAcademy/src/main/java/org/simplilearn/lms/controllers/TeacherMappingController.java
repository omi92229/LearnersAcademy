package org.simplilearn.lms.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplilearn.lms.dao.SubjectDao;
import org.simplilearn.lms.dao.SubjectDaoImpl;
import org.simplilearn.lms.entities.Subject;
import org.simplilearn.lms.entities.Teacher;
import org.simplilearn.lms.service.SubjectService;
import org.simplilearn.lms.service.SubjectServiceImpl;
import org.simplilearn.lms.service.TeacherService;
import org.simplilearn.lms.service.TeacherServiceImpl;

@WebServlet("/mapToTeacher")
public class TeacherMappingController extends HttpServlet {
	private TeacherService teacherService=new TeacherServiceImpl();
	private SubjectDao subjectDao=new SubjectDaoImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		HttpSession session=req.getSession();
		int id=(int) session.getAttribute("sid");
		Teacher teacher=teacherService.getTeacher(name);
		Subject subject=subjectDao.get(id);
		teacher.addSubject(subject);
		subject.setTeacher(teacher);
		teacherService.addTeacher(teacher);
	}
}
