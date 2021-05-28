package cn.coder_tq.core.service.Impl;

import cn.coder_tq.core.DO.GroupInfo;
import cn.coder_tq.core.mapper.GroupInfoMapper;
import cn.coder_tq.core.service.GroupInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class GroupInfoServiceImpl extends ServiceImpl<GroupInfoMapper, GroupInfo> implements GroupInfoService {
}
