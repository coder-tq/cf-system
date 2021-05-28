package cn.coder_tq.core.service.Impl;

import cn.coder_tq.core.DO.UserInfo;
import cn.coder_tq.core.mapper.UserInfoMapper;
import cn.coder_tq.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Override
    public boolean checkUser(UserInfo user) {
        return false;
    }
}
