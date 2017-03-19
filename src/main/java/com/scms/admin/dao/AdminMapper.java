package com.scms.admin.dao;

import com.scms.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Long managerId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Long managerId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}