package com.scms.teacher.service;

import com.scms.entity.CourseResource;

import java.util.List;

/**
 * Created by hz on 17-4-4.
 */
public interface CourseResourceService {
    int deleteByResourceID(Integer courseResourceId);

    int insert(CourseResource record);

    int insertSelective(CourseResource record);

    CourseResource findByResourceID(Integer courseResourceId);

    int update(CourseResource record);

    int updateByPrimaryKey(CourseResource record);

    List<CourseResource> findByGrantCourseID(Integer grantCourseId);
}
