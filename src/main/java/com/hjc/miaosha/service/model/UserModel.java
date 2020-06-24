package com.hjc.miaosha.service.model;

import lombok.Data;

/**
 * @author hjc
 * @title: UserModel
 * @description:
 * @date 2020/6/24 0024下午 3:31
 */
@Data
public class UserModel {
    private Integer id;

    private String name;

    private Byte gender;

    private Integer age;

    private String telphone;

    private String registerMode;

    private String thirdPartyId;

    private String encrptPassword;
}
