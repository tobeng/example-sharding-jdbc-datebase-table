package com.tobeng.test.service;

import com.tobeng.test.dto.UserDTO;
import com.tobeng.test.entity.User;

/**
 * 用户 service
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 19:37
 **/
public interface UserService {

    User saveUser(UserDTO userDTO);

}
