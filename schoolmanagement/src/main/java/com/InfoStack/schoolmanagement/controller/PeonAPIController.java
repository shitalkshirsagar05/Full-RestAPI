package com.InfoStack.schoolmanagement.controller;

import com.InfoStack.schoolmanagement.models.Peon;
import com.InfoStack.schoolmanagement.services.PeonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeonAPIController {
    @Autowired
    PeonService service;

    @RequestMapping("/peons/api/save")
    public Peon savePeon(@RequestParam("name") String name,
                         @RequestParam("salary") int salary,
                         @RequestParam("duty") String duty) {
        Peon p = new Peon(name, salary, duty);
        return service.saveData(p);
    }

    @RequestMapping("peons/api/update/{id}")
    public Peon updatePeon(
            @PathVariable("id") int id,
            @RequestParam("name") String name,
            @RequestParam("salary") int salary,
            @RequestParam("duty") String duty) {
        Peon p = new Peon(id, name, salary, duty);
        return service.saveData(p);
    }

    @RequestMapping("peons/api/get/{id}")
    public Peon getPeon(@PathVariable("id") int id) {
        Peon p = new Peon();
        try {
            if (service.getPeonDetails(id) != null) {
                p = service.getPeonDetails(id);
            }
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            p.setName("NA");
            p.setSalary(0);
            p.setDuty("NA");
            return p;
        }
    }

    @RequestMapping("peons/api/getall")


    public List<Peon> getPeon() {
        return service.getAllPeons();
    }

}