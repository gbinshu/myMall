package com.gbs.mall.user.service;


import com.gbs.mall.user.bean.UmsMember;
import com.gbs.mall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
