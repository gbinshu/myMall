package com.gbs.mall.user.mapper;


import com.gbs.mall.user.bean.UmsMember;

import java.util.List;

public interface UserMapper {
    List<UmsMember> selectAllUser();
}
