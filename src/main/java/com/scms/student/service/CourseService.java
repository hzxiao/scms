package com.scms.student.service;

import com.scms.entity.*;

import java.util.List;

/**
 * Created by tying on 2017/3/24.
 */
public interface CourseService {
    public List<GrantCourse> findAllSection();
    public List<GrantCourse> findByStudentId(long sid);
    public int delete(int secId, long sid);
    public int add(int secId, long sid);
    public Course findCourseById(long cid);
    public Teacher findTeacherById(long tid);
    public List<CourseSelection> findAllCSection(int secId);
}
