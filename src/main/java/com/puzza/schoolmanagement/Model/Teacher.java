package com.puzza.schoolmanagement.Model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Teacher")
public class Teacher {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String address;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private TeacherDetail detail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public TeacherDetail getDetail() {
		return detail;
	}
	public void setDetail(TeacherDetail detail) {
		this.detail = detail;
	}


}
