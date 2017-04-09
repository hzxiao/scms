package com.scms.teacher.service;

import com.scms.entity.Teacher;

import java.util.List;

/**
 * Created by hz on 17-4-4.
 */
public interface TeacherService {
    int deleteByTeacherID(Long teacherId);

    int insert(Teacher teacher);

    Teacher selectTeacherID(Long teacherId);

    int updateBySelective(Teacher record);

    List<Teacher> findByDept(String dept);

    List<Teacher> findAll();

    List<Teacher> findSinceID(Long teacherId);
}
