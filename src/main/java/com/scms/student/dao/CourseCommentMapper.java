package com.scms.student.dao;

import com.scms.entity.CourseComment;

public interface CourseCommentMapper {
    int insert(CourseComment record);

    int insertSelective(CourseComment record);
}