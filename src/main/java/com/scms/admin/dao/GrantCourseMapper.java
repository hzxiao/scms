package com.scms.admin.dao;

import com.scms.entity.GrantCourse;

import java.util.List;

public interface GrantCourseMapper {
    int deleteByPrimaryKey(Integer grantCourseId);

    int insert(GrantCourse record);

    int insertSelective(GrantCourse record);

    GrantCourse selectByPrimaryKey(Integer grantCourseId);

    int updateByPrimaryKeySelective(GrantCourse record);

    int updateByPrimaryKey(GrantCourse record);


    List<GrantCourse> findAllSelection(Integer status);//获取所有可选课程
}