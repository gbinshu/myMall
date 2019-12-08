package com.gbs.mall.user.service.impl;


import com.gbs.mall.user.bean.UmsMember;
import com.gbs.mall.user.mapper.UserMapper;
import com.gbs.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
//        List<UmsMember> umsMembers = userMapper.selectAllUser();//不使用通用mapper
        List<UmsMember> umsMembers = userMapper.selectAll();//使用通用mapper
        return umsMembers;
    }

}
