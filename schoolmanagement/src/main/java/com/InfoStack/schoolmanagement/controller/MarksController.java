package com.InfoStack.schoolmanagement.controller;

import com.InfoStack.schoolmanagement.models.Student;
import com.InfoStack.schoolmanagement.models.StudentMarks;
import com.InfoStack.schoolmanagement.services.StudentService;
import com.InfoStack.schoolmanagement.services.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/marks")
public class MarksController {
    @Autowired
    StudentService mainService;
    @Autowired
    MarksService marksService;

    @RequestMapping("")
    public String getMarksData(ModelMap mp) {
        List<StudentMarks> marksList = marksService.getAllData();
        /*for (int i = 0; i < marksList.size(); i++) {
            System.out.println(marksList.get(i).getSubject1());
            System.out.println(marksList.get(i).getStudent().getName());
        }*/
        mp.addAttribute("marksList", marksList);
        return "marks-table";
    }

    @RequestMapping("/entry")
    public String marksentry(ModelMap modelMap) {
        List<Student> studentList = mainService.getAllStudents();
        modelMap.addAttribute("studentList", studentList);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getName());
        }
        return "student-marks-entry";
    }

    @RequestMapping("/save")
    public String marksinsert(@RequestParam("rollNo") int rollNo,
                              @RequestParam("subject1") int subject1,
                              @RequestParam("subject2") int subject2,
                              @RequestParam("subject3") int subject3) {
        Student s = mainService.getStudentDetails(rollNo);
        StudentMarks sm = new StudentMarks();
        sm.setSubject1(subject1);
        sm.setSubject2(subject2);
        sm.setSubject3(subject3);
        sm.setStudent(s);
        marksService.saveData(sm);
        return "redirect:/marks/entry";
    }
}