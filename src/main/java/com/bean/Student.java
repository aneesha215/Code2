package com.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.bean.Class;
@Entity
@Table
public class Student {

	@Id
	private int SID;
	private String fName;
	private String lName;
	
	
	@ManyToOne
	@JoinColumn(name="cID")
	private Class cls;
	
	public Class getCls() {
		return cls;
	}
	public void setClass(Class cls) {
		this.cls = cls;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
}
