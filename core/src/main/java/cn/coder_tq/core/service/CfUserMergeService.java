package cn.coder_tq.core.service;

import cn.coder_tq.core.DO.CfInfo;
import cn.coder_tq.core.DO.CfUserMerge;
import cn.coder_tq.core.DO.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

@Service
public interface CfUserMergeService extends IService<CfUserMerge> {

    /**
     * 将用户信息和CF信息合并为CfUserMerge实体类
     * @param user 要合并的用户
     * @param cfInfo 要合并的cf信息
     * @return 合并之后的CfUserMerge对象
     */
    CfUserMerge mergeInfo(UserInfo user, CfInfo cfInfo);

    /**
     * 根据验证码验证cf信息,验证码与session绑定
     * @param cfUserMerge cf与用户信息
     * @param verifyCode 用户输入的验证码
     * @return 验证码是否正确
     */
    boolean verifyCfInfo(CfUserMerge cfUserMerge,String verifyCode);

}
