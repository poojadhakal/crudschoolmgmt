package com.puzza.schoolmanagement.Schoolmgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.puzza.schoolmanagement.Model.Teacher;
import com.puzza.schoolmanagement.Model.TeacherDetail;
import com.puzza.schoolmanagement.Repo.TeacherDetailRepo;
import com.puzza.schoolmanagement.Repo.TeacherRepo;

@SpringBootApplication
@ComponentScan(basePackages = {"com.puzza.schoolmanagement.Conteoller", "com.puzza.schoolmanagement.Service","com.puzza.schoolmanagement.Model"})
@EntityScan("com.puzza.schoolmanagement.Model")
@EnableJpaRepositories("com.puzza.schoolmanagement.Repo")


public class SchoolmgmtApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SchoolmgmtApplication.class, args);
	}

	
	@Autowired 
	private TeacherRepo teacherRepo;
	
	@Autowired
	private TeacherDetailRepo teacherDetailRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		 
		
		
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
		
		
		
		teacher.setDetail(details);
	   details.setTea(teacher);
		
		
		
		
		
	}

} 
 