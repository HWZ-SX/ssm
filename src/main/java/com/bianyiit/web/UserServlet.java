package com.bianyiit.web;

import com.bianyiit.domain.User;
import com.bianyiit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("userServlet")
public class UserServlet {
    @Autowired
    private IUserService userService;
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();

        List<User> users = userService.findAll();

        for (User user : users) {
            System.out.println(user);
        }
        modelAndView.addObject("users",users);
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
