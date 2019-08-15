package com.tobeng.test.dao;

import com.tobeng.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 用户 DAO
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 19:36
 **/
@Repository
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
