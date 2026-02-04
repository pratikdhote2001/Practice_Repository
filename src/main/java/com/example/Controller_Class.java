package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;



@Controller
public class Controller_Class {

    @GetMapping("/add")
    public String getData() {
        return "pratik";
    }

    @GetMapping("/logins")
    public String logins(HttpServletRequest http, org.springframework.ui.Model model)
            
    		{
             model.addAttribute("Uname", http.getParameter("Username"));
             model.addAttribute("Upass", http.getParameter("Password"));
    	
    	
    			
    		

        return "home";
	
    		}
	
    public String getDa()
    {
    	return "Hello Pratik";
    	//Hello
    }
}
