package com.torryharris;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyController {
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");
        mv.addObject("result", result);
    return mv;
}
    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        ModelAndView mv = new ModelAndView();
        if (userName.equals("admin") && password.equals("1234")) {
            mv.setViewName("sucess.jsp");
        } else {
            mv.setViewName("failure.jsp");
        }
        return mv;
    }
}
