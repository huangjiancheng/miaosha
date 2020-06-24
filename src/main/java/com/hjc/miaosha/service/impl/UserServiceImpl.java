package com.hjc.miaosha.service.impl;

import com.hjc.miaosha.dao.UserDOMapper;
import com.hjc.miaosha.dao.UserPasswordDOMapper;
import com.hjc.miaosha.dataobject.UserDO;
import com.hjc.miaosha.dataobject.UserPasswordDO;
import com.hjc.miaosha.service.IUserService;
import com.hjc.miaosha.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hjc
 * @title: UserServiceImpl
 * @description:
 * @date 2020/6/24 0024下午 2:49
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDOMapper userDOMapper;
    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserById(Integer id) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if(userDO == null){
            return null;
        }
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDO.getId());
        return this.convertFromDataObject(userDO, userPasswordDO);
    }

    private UserModel convertFromDataObject(UserDO userDO, UserPasswordDO userPasswordDO){
        if(userDO == null){
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO, userModel);
        if(userPasswordDO != null){
            userModel.setEncrptPassword(userPasswordDO.getEncrptPassword());
        }
        return userModel;
    }
}
