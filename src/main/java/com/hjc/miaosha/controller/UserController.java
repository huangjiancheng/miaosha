package com.hjc.miaosha.controller;

import com.hjc.miaosha.controller.vieobject.UserVO;
import com.hjc.miaosha.service.IUserService;
import com.hjc.miaosha.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hjc
 * @title: UserController
 * @description:
 * @date 2020/6/24 0024下午 2:47
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/get")
    public UserVO getUser(@RequestParam(name = "id") Integer id) {
        UserModel userModel = userService.getUserById(id);
        return this.convertFromModel(userModel);
    }

    public UserVO convertFromModel(UserModel userModel) {
        if(userModel == null){
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel, userVO);
        return userVO;
    }
}
