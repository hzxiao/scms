package com.scms.admin.dao;

import com.scms.entity.AdminControl;

public interface AdminControlMapper {
    int insert(AdminControl record);

    int insertSelective(AdminControl record);
}