package com.scms.system.service;

import com.scms.entity.User;

/**
 * Created by hz on 17-3-21.
 */
public interface UserService {
    int insert(User record);
    User selectByPrimaryKey(Integer id);

    User checkByPassword(String username, String password);
}
