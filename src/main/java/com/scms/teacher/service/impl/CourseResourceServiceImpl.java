package com.scms.teacher.service.impl;

import com.scms.entity.CourseResource;
import com.scms.teacher.dao.CourseResourceMapper;
import com.scms.teacher.service.CourseResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hz on 17-4-4.
 */
@Service
public class CourseResourceServiceImpl implements CourseResourceService {

    @Resource
    CourseResourceMapper mapper;

    @Override
    public int deleteByResourceID(Integer courseResourceId) {
        return mapper.deleteByPrimaryKey(courseResourceId);
    }

    @Override
    public int insert(CourseResource record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(CourseResource record) {
        return mapper.insertSelective(record);
    }

    @Override
    public CourseResource findByResourceID(Integer courseResourceId) {
        return mapper.selectByPrimaryKey(courseResourceId);
    }

    @Override
    public int update(CourseResource record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CourseResource record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<CourseResource> findByGrantCourseID(Integer grantCourseId) {
        return mapper.selectByGrantCourseID(grantCourseId);
    }
}
