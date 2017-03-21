package com.scms.system.service.impl;

import com.scms.entity.User;
import com.scms.system.dao.UserMapper;
import com.scms.system.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hz on 17-3-21.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper mapper;
    @Override
    public int insert(User record) {
        return mapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
