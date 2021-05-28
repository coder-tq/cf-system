package cn.coder_tq.core.service;

import cn.coder_tq.core.DO.CfInfo;
import cn.coder_tq.core.DO.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * @author coder_tq
 * @Date 2021/5/28 19:42
 */
@Service
public interface UserInfoService extends IService<UserInfo> {
    boolean checkUser(UserInfo user);
}
