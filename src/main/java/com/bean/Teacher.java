package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Teacher{

	@Id
	private int TID;
	private String fName;
	private String lName;
	
	@ManyToMany(mappedBy="listOfTeacher")
	private List<Class> listOfClass=new ArrayList<>();
	
	@ManyToMany(mappedBy="listOfTeacher")
	private List<Subject> listOfSubject=new ArrayList<>();
	
	public String getlName() {
		return lName;
	}
	public List<Class> getListOfClass() {
		return listOfClass;
	}
	public void setListOfClass(List<Class> listOfClass) {
		this.listOfClass = listOfClass;
	}
	public List<Subject> getListOfSubject() {
		return listOfSubject;
	}
	public void setListOfSubject(List<Subject> listOfSubject) {
		this.listOfSubject = listOfSubject;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getTID() {
		return TID;
	}
	public void setTID(int sID) {
		TID = sID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
}
