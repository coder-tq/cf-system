package cn.coder_tq.core.service.Impl;

import cn.coder_tq.core.DO.CfInfo;
import cn.coder_tq.core.DO.CfUserMerge;
import cn.coder_tq.core.DO.UserInfo;
import cn.coder_tq.core.mapper.CfUserMergeMapper;
import cn.coder_tq.core.service.CfUserMergeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CfUserMergeServiceImpl extends ServiceImpl<CfUserMergeMapper, CfUserMerge> implements CfUserMergeService {
    @Override
    public CfUserMerge mergeInfo(UserInfo user, CfInfo cfInfo) {
        CfUserMerge cfUserMerge = new CfUserMerge();

        cfUserMerge.setCfId(cfInfo.getCfId());
        cfUserMerge.setQq(user.getQq());

        return cfUserMerge;
    }

    @Override
    public boolean verifyCfInfo(CfUserMerge cfUserMerge, String verifyCode) {
        return false;
    }
}
