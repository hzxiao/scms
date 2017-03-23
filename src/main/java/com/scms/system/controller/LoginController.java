package com.scms.system.controller;

import com.scms.entity.User;
import com.scms.system.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by hz on 17-3-21.
 */
@Controller
public class LoginController {

    @Resource(name = "userServiceImpl")
    UserService service;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request, HttpSession session) {
        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");
        System.out.println(username+": "+password);
        return null;
    }
}
