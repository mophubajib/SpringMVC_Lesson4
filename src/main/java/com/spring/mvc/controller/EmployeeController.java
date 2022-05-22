package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("")
    public String homeEmployee() {

        return "employee/home";
    }

    @GetMapping("/create")
    public String createEmployee() {

        return "employee/create";
    }
/*
    @GetMapping("/get")
    public String getEmployee() {

        return "employee/get";
    }*/

/*    @GetMapping("/get")
    public String getEmployee(HttpServletRequest request, Model model) {

        String employeeName = request.getParameter("employeeName");
        employeeName = "mr." + employeeName;
        model.addAttribute("modelEmployeeName", employeeName);
        return "employee/get";
    }*/

    @GetMapping("/get")
    public String getEmployee(@RequestParam("employeeAge") String employeeAge, Model model) {

        employeeAge = employeeAge + " old years";
        model.addAttribute("modelEmployeeAge", employeeAge);
        return "employee/get";
    }
}
