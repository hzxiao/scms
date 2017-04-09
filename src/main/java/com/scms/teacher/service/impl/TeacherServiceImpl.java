package com.scms.teacher.service.impl;

import com.scms.entity.Teacher;
import com.scms.teacher.dao.TeacherMapper;
import com.scms.teacher.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hz on 17-4-4.
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    TeacherMapper teacherMapper;

    @Override
    public int deleteByTeacherID(Long teacherId) {
        return teacherMapper.deleteByPrimaryKey(teacherId);
    }

    @Override
    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public Teacher selectTeacherID(Long teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public int updateBySelective(Teacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Teacher> findByDept(String dept) {
        return teacherMapper.selectByDept(dept);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.selectAll();
    }

    @Override
    public List<Teacher> findSinceID(Long teacherId) {
        return teacherMapper.selectSincePrimaryKey(teacherId);
    }
}
