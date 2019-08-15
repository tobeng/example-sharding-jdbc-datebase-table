package com.tobeng.test.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户 entity
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 19:34
 **/
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    protected Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "name")
    private String name;

}
