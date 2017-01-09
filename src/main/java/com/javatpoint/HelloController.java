package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

@Controller
public class HelloController {

	    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin")){  
        String message = "HELLO Bro"+name;  
        return new ModelAndView("hellopage", "message", message);  
        }  
        else{  
            return new ModelAndView("errorpage", "message","Sorry, username or password error");  
        }  
    }  


    @RequestMapping("/signup")
    public ModelAndView register(){
        return new ModelAndView("signup");
    }

}
