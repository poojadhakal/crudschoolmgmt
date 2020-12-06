package com.puzza.schoolmanagement.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TeacherDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TeacherDetailId;
	private String Zipcode;
	private String Job;
	private double Income;
	private String Subject;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "TeacherDetail")
	private Teacher teacher;
	
	
	public int getTeacherDetailId() {
		return TeacherDetailId;
	}
	public void setTeacherDetailId(int teacherDetailId) {
		TeacherDetailId = teacherDetailId;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public double getIncome() {
		return Income;
	}
	public void setIncome(double income) {
		Income = income;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	@OneToOne(fetch = FetchType.EAGER)
	public Teacher getTea() {
		return tea;
	}
	public void setTea(Teacher tea) {
		this.tea = tea;
	}

}
