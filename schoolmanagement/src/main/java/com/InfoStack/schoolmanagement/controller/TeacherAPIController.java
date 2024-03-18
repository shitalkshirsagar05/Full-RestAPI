package com.InfoStack.schoolmanagement.controller;

import com.InfoStack.schoolmanagement.models.Teacher;
import com.InfoStack.schoolmanagement.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherAPIController {
    @Autowired
    TeacherService  service;

    @RequestMapping("/teacher/api/save")
    public Teacher saveTeacher(@RequestParam("fullname") String name,
                               @RequestParam("salary") int salary,
                               @RequestParam("subject") String subject) {
        Teacher t = new Teacher(name, salary, subject);
        return service.saveTeacherData(t);
    }
    @RequestMapping("teacher/api/update/{teacherId}")
    public Teacher updateTeacher(
            @PathVariable("fullname") String teacherId,
            @RequestParam("salary") int name,
            @RequestParam("subject") String subject) {
        Teacher t = new Teacher(teacherId, name, subject);
        return service.saveTeacherData(t);
    }

    @RequestMapping("teacher/api/get/{teacherId}")
    public Teacher getTeacher(@PathVariable("teacherId") int teacherId) {
        Teacher t = new Teacher();
        try{
            if (service.getTeacherDetails(teacherId) != null){
                t = service.getTeacherDetails(teacherId);
            }
            return t;
        }catch (Exception e){
            e.printStackTrace();
            t.setfullname("NA");
            t.setsalary(0);
            t.setsubject("NA");
            return t;
        }
    }

    @RequestMapping("teacher/api/getall")
    public List<Teacher> getTeacher() {
        return service.getAllTeachers();
    }

    @RequestMapping("teacher/api/delete/{teacherId}")
    public void deleteTeacher(@PathVariable("teacherId") int teacherId) {
        service.deleteTeacher(teacherId);
    }

}
