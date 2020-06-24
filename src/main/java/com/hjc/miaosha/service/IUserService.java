package com.hjc.miaosha.service;

import com.hjc.miaosha.service.model.UserModel;

/**
 * @author hjc
 * @title: IUserService
 * @description:
 * @date 2020/6/24 0024下午 2:49
 */
public interface IUserService {
    UserModel getUserById(Integer id);
}
