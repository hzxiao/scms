package com.scms.teacher.dao;

import com.scms.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Long teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Long teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    List<Teacher> selectAll();

    List<Teacher> selectByDept(@Param("dept") String dept);

    List<Teacher> selectSincePrimaryKey(Long teacherId);
}