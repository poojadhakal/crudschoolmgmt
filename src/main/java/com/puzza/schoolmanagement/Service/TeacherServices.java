package com.puzza.schoolmanagement.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.puzza.schoolmanagement.Exception.TeacherException;
import com.puzza.schoolmanagement.Model.Teacher;
import com.puzza.schoolmanagement.Repo.TeacherRepo;

@Service
public class TeacherServices {
	@Autowired
	TeacherRepo teacherrepo;
	
	public Teacher saveTeacher(Teacher teacher) {
	Teacher tech=teacherrepo.save(teacher);
	return tech;
	}
	public List<Teacher> saveTeachers(List<Teacher> teachers) {
		List<Teacher> tech=(List<Teacher>) teacherrepo.saveAll(teachers);
		return tech;
		}
	public List<Teacher> getAllTeacher() {
	List<Teacher> list	=(List<Teacher>) teacherrepo.findAll();
	return list;
	}
    
	public Teacher getTeacherById(int id)  {
		
Teacher teach=teacherrepo.findById(id).get(); 
return teach;
	}
	//public Teacher getByTeacherName(String name) {
		//      Teacher t1= teacherrepo.findByName(name);
		  //    return t1;
//	}
	
	
	//public Teacher updateTeacher(Teacher teacher) {
	//Optional<Teacher> existingTeacher=teacherrepo.findById(teacher.getId());
	//existingTeacher.setName(teacher.getName());
	//existingTeacher.setAddress(teacher.getAddress());
	//return.saveTeacher(existingTeacher);
	//return existingTeacher;
	//}
	
	public void deleteTeacher(int id) {
		teacherrepo.deleteById(id); 
		
	}
}
