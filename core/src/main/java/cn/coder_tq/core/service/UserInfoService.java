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
    /**
     *
     * @param user 用户信息
     * 只需要检查用户账号密码是否正确即可。
     * @return 验证结果
     */
    boolean checkUser(UserInfo user);
}
