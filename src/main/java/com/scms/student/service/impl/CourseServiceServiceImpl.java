package com.scms.student.service.impl;

import com.scms.admin.dao.CourseMapper;
import com.scms.admin.dao.GrantCourseMapper;
import com.scms.constant.CourseStatus;
import com.scms.entity.*;
import com.scms.student.dao.CourseSelectionMapper;
import com.scms.student.dao.StudentMapper;
import com.scms.student.service.CourseService;
import com.scms.teacher.dao.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tying on 2017/3/24.
 */
@Service
public class CourseServiceServiceImpl implements CourseService {
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private GrantCourseMapper grantCourseMapper;
    @Resource
    private CourseMapper courseMapper;
    @Resource
    private TeacherMapper teacherMapper;
    @Resource
    private CourseSelectionMapper courseSelectionMapper;

    @Override
    public List<GrantCourse> findAllSection() {
        return grantCourseMapper.findAllSelection(CourseStatus.SELECTIVE);
    }

    @Override
    public Course findCourseById(long cid) {
        return courseMapper.selectByPrimaryKey(cid);
    }

    @Override
    public Teacher findTeacherById(long tid) {
        return teacherMapper.selectByPrimaryKey(tid);
    }

    @Override
    public List<CourseSelection> findAllCSection(int secId) {
        return courseSelectionMapper.selectByGrantId(secId);
    }

    @Override
    public List<GrantCourse> findByStudentId(long sid) {
        return null;
    }

    @Override
    public int delete(int secId, long sid) {
        return 0;
    }

    @Override
    public int add(int secId, long sid) {
        return 0;
    }
}
