package com.scms.system.controller;

import com.scms.constant.Role;
import com.scms.entity.User;
import com.scms.system.service.UserService;
import org.apache.log4j.Logger;
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

    Logger logger = Logger.getLogger(LoginController.class);

    @Resource(name = "userServiceImpl")
    UserService service;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpSession session) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = service.checkByPassword(username, password);
        if (user == null) { //账号或密码错误
            return "redirect:/";
        }
        //登录成功
        session.setAttribute("username", username);
        session.setAttribute("role", user.getRole());
        logger.info("user: " + username + " login");
        switch (user.getRole()) {
            case Role.ADMIN:
                break;
            case Role.TEACHER:
                break;
            case Role.STUDENT:
                break;
        }
        return "redirect:/";
    }
}
