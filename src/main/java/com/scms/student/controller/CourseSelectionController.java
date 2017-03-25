package com.scms.student.controller;

import com.scms.entity.CourseSelection;
import com.scms.entity.GrantCourse;
import com.scms.student.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by tying on 2017/3/24.
 */
@Controller
public class CourseSelectionController {
    @Resource(name = "courseServiceServiceImpl")
    CourseService courseService;

    @RequestMapping(value = "selective")
    public String show(HttpServletRequest request, HttpSession session){
        List<GrantCourse> list = courseService.findAllSection();

        for (int i=0;i<list.size();i++){
            GrantCourse grantCourse= list.get(i);
            System.out.println("授课id:"+grantCourse.getGrantCourseId());
            System.out.println("课程id:"+grantCourse.getCourseId());

            grantCourse.setCourse(courseService.findCourseById(grantCourse.getCourseId()));//通过课程id获取
            grantCourse.setTeacher(courseService.findTeacherById(grantCourse.getTeacherId()));//通过教师id获取
            grantCourse.setCourseSelectionList(courseService.findAllCSection(grantCourse.getGrantCourseId()));//通过授课id获取所有的学生

            System.out.println("课程名称:"+grantCourse.getCourse().getName());
            System.out.println("教师名:"+grantCourse.getTeacher().getName());
            System.out.println("学生id:"+grantCourse.getCourse().getName());

            list.set(i,grantCourse);

        }
        session.setAttribute("courseSelectionList",list);
        return "student/course_selective";
    }
}
