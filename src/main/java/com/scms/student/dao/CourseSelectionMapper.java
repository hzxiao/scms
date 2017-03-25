package com.scms.student.dao;

import com.scms.entity.CourseSelection;
import com.scms.entity.Student;

import java.util.List;

public interface CourseSelectionMapper {
    int insert(CourseSelection record);

    int insertSelective(CourseSelection record);

    List<CourseSelection> selectByGrantId(Integer grantCourseId);//通过授课条目id获取所有的学生

}