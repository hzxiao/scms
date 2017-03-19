package com.scms.student.dao;

import com.scms.entity.CourseSelection;

public interface CourseSelectionMapper {
    int insert(CourseSelection record);

    int insertSelective(CourseSelection record);
}