package com.example.EmployeeApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Employee_Controller {

    // if the employee role is admin (add new employee functionality should be shwon)
	// if the employee role is user (view employee functionality should be shown)
    @GetMapping("if-unless")
    public String ifUnless(Model model){
    	
        Employee_Model darshana = new Employee_Model("darshana","bhave","darshana@gmail.com", "ADMIN");
        Employee_Model shivalika = new Employee_Model("shivalika","srivastava","shivalika@gmail.com", "USER");
        Employee_Model mohini = new Employee_Model("mohini","bendale","mohini@gmail.com", "USER");
        
        List<Employee_Model> employees = new ArrayList<>();
        employees.add(darshana);
        employees.add(shivalika);
        employees.add(mohini);
        model.addAttribute("employees", employees);
        return "if-unless";
    }
    
    @GetMapping("switch-case")
    public String employee(Model model){
        Employee_Model employee = new Employee_Model("darshana","bhave","darshana@gmail.com", "ADMIN");
        model.addAttribute("employee", employee);
        return "switch-case";
    }
    
    @GetMapping("iteration-loop")
    public String iteration(Model model) {
        List <Employee_Model> employees = new ArrayList < > ();
        employees.add(new Employee_Model("darshana", "bhave", "darshana@gmail.com","ADMIN"));
        employees.add(new Employee_Model("shivalika", "srivastava", "shivalika@gmail.com","USER"));
        employees.add(new Employee_Model("mohini", "bendale", "mohini@gmail.com","USER"));
        employees.add(new Employee_Model("gayatri", "zad", "gayatri@gmail.com","USER"));
        model.addAttribute("employees", employees);
        return "iteration-loop";
    }
    
}