package org.simplilearn.lms.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class AcademicClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private int duation;
	@ManyToMany(mappedBy = "classes",cascade = CascadeType.ALL)
	private Set<Subject> subjects=new HashSet<>();
	@OneToMany(mappedBy = "academicClass",cascade = CascadeType.ALL)
	private Set<Student> students=new HashSet<>();
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuation() {
		return duation;
	}
	public void setDuation(int duation) {
		this.duation = duation;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	//helper methods
	public void addSubject(Subject subject)
	{
		subjects.add(subject);
	}
	
	
	
}
