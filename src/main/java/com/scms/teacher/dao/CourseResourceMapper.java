package com.scms.teacher.dao;

import com.scms.entity.CourseResource;

public interface CourseResourceMapper {
    int deleteByPrimaryKey(Integer courseResourceId);

    int insert(CourseResource record);

    int insertSelective(CourseResource record);

    CourseResource selectByPrimaryKey(Integer courseResourceId);

    int updateByPrimaryKeySelective(CourseResource record);

    int updateByPrimaryKeyWithBLOBs(CourseResource record);

    int updateByPrimaryKey(CourseResource record);
}