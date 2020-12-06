package com.puzza.schoolmanagement.Model;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestPerson {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("pooja");
		teacher.setId(101);
		teacher.setAddress("chitwan");
		
		TeacherDetail details = new TeacherDetail();
		details.setTeacherDetailId(1);
		details.setZipcode("123");
		details.setJob("nepali Teacher");
		details.setIncome(12345.89);
		details.setSubject("Nepali");
		
		 
		
		
	}

}
