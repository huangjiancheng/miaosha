package com.hjc.miaosha.controller.vieobject;

import lombok.Data;

/**
 * @author hjc
 * @title: UserVO
 * @description:
 * @date 2020/6/24 0024下午 7:07
 */
@Data
public class UserVO {
    private Integer id;

    private String name;

    private Byte gender;

    private Integer age;

    private String telphone;
}
