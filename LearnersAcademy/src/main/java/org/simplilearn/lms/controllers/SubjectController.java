package org.simplilearn.lms.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplilearn.lms.entities.Subject;
import org.simplilearn.lms.service.SubjectService;
import org.simplilearn.lms.service.SubjectServiceImpl;

@WebServlet("/addSub")
public class SubjectController extends HttpServlet{
	private SubjectService service=new SubjectServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String subject=req.getParameter("subject");
		Subject subject2=new Subject();
		subject2.setName(subject);
		service.addSubject(subject2);
	}
}
