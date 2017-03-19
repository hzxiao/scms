package com.scms.admin.dao;

import com.scms.entity.GrantCourse;

public interface GrantCourseMapper {
    int deleteByPrimaryKey(Integer grantCourseId);

    int insert(GrantCourse record);

    int insertSelective(GrantCourse record);

    GrantCourse selectByPrimaryKey(Integer grantCourseId);

    int updateByPrimaryKeySelective(GrantCourse record);

    int updateByPrimaryKey(GrantCourse record);
}