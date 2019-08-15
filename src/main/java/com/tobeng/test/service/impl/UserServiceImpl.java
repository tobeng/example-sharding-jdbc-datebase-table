package com.tobeng.test.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.tobeng.test.dao.UserDao;
import com.tobeng.test.dto.UserDTO;
import com.tobeng.test.entity.User;
import com.tobeng.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户 service 实现类
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 19:37
 **/
@Transactional(rollbackFor = Exception.class)
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User saveUser(UserDTO userDTO) {
        User user = new User();
        BeanUtil.copyProperties(userDTO, user);
        return userDao.saveAndFlush(user);
    }
}
