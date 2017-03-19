package com.scms.admin.dao;

import com.scms.entity.SystemAnnounce;

public interface SystemAnnounceMapper {
    int insert(SystemAnnounce record);

    int insertSelective(SystemAnnounce record);
}