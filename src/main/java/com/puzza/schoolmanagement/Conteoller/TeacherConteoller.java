package com.puzza.schoolmanagement.Conteoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puzza.schoolmanagement.Exception.TeacherException;
import com.puzza.schoolmanagement.Model.Teacher;
import com.puzza.schoolmanagement.Service.TeacherServices;

@RestController
@RequestMapping("/api/teacher")
public class TeacherConteoller {
	@Autowired
	TeacherServices teacherservice;
	@PostMapping("/save")
public Teacher saveTeacher(@RequestBody Teacher t) {
		System.out.println("save teacher record");
		Teacher tu=teacherservice.saveTeacher(t);
		return tu;
	}
	@PostMapping("/addTeachers")
	public List<Teacher> addTeacher(@RequestBody List<Teacher> teachers) {
			List<Teacher> Teacherlist=teacherservice.saveTeachers(teachers);
			return Teacherlist;
		}

	
	@GetMapping("/get")
	public List<Teacher> getAllTeacher(){
		List<Teacher> list=teacherservice.getAllTeacher();
		return list;
	}
	
	@GetMapping("/get/teacher/{id}")
	public Teacher getTeacherById(@PathVariable("id") int id ) throws TeacherException{
		Teacher teach= teacherservice.getTeacherById(id);
		if(teach ==null) {
			System.out.println("ds");
			throw new TeacherException("gag");
		}
		return teach;
		
	}
	//@GetMapping("/get/teacher/{name}")
//	public Teacher getTeacherById(@PathVariable String name) {
	//	Teacher teachname= teacherservice.getByTeacherName(name);
 		//return teachname;
	
//}
//
	@DeleteMapping("/delete/{id}")
	public void deleteTeacher(@PathVariable int id) {
		teacherservice.deleteTeacher(id);
	}
	
}