package com.tobeng.test.dto;

import lombok.Data;

/**
 * 用户接收 DTO
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 19:41
 **/
@Data
public class UserDTO {

    protected Long id;

    private String city;

    private String name;

}
