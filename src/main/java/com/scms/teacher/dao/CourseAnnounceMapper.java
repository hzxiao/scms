package com.scms.teacher.dao;

import com.scms.entity.CourseAnnounce;

public interface CourseAnnounceMapper {
    int insert(CourseAnnounce record);

    int insertSelective(CourseAnnounce record);
}