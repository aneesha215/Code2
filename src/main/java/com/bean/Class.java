package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table
public class Class {

	@Id
	private int cID;
	private String cName;
	
	@ManyToMany()
	@JoinTable(name="Class_Subject",
				joinColumns=@JoinColumn(name="cID"),
				inverseJoinColumns=@JoinColumn(name="SID")
			)
	private List<Subject> listOfSubject=new ArrayList<>();
	
	@OneToMany(mappedBy="cls")
	private List<Student> listOfStudent=new ArrayList<>();
	
	@ManyToMany()
	@JoinTable(name="Class_Teacher",
				joinColumns=@JoinColumn(name="cID"),
				inverseJoinColumns=@JoinColumn(name="TID")
			)
	private List<Teacher> listOfTeacher=new ArrayList<>();
	
	public List<Teacher> getListOfTeacher() {
		return listOfTeacher;
	}

	public void setListOfTeacher(List<Teacher> listOfTeacher) {
		this.listOfTeacher = listOfTeacher;
	}

	public int getSID() {
		return cID;
	}

	public List<Student> getListOfStudent() {
		return listOfStudent;
	}
	public void setListOfStudent(List<Student> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}
	public List<Subject> getListOfSubject() {
		return listOfSubject;
	}
	public void setListOfSubject(List<Subject> listOfSubject) {
		this.listOfSubject = listOfSubject;
	}
	public void setSID(int sID) {
		cID = sID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Class [cID=" + cID + ", cName=" + cName + "]";
	}
	
	
}
