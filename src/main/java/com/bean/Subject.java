package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Subject {

	@Id
	private int SID;
	private String sName;
	
	@ManyToMany(mappedBy="listOfSubject")
	
	private List<Class> listOfClass=new ArrayList<>();
	
	@ManyToMany()
	@JoinTable(name="Subject_Teacher",
				joinColumns=@JoinColumn(name="SID"),
				inverseJoinColumns=@JoinColumn(name="TID")
			)
	private List<Teacher> listOfTeacher=new ArrayList<>();
	
	public List<Teacher> getListOfTeacher() {
		return listOfTeacher;
	}
	public void setListOfTeacher(List<Teacher> listOfTeacher) {
		this.listOfTeacher = listOfTeacher;
	}
	public List<Class> getListOfClass() {
		return listOfClass;
	}
	public void setListOfClass(List<Class> listOfClass) {
		this.listOfClass = listOfClass;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String cName) {
		this.sName = cName;
	}
	
}