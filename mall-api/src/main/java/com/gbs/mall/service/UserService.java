package com.gbs.mall.service;



import com.gbs.mall.bean.UmsMember;
import com.gbs.mall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
