package cn.coder_tq.core.DO;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user_info")
public class UserInfo {

  @TableField("id")
  private long id;

  @TableField("qq")
  private long qq;

  @TableField("password")
  private String password;

  @TableField("create_time")
  private Date createTime;

  @TableField("update_time")
  private Date updateTime;

  @TableLogic("is_deleted")
  private long isDeleted;

  @TableField("nickname")
  private String nickname;

}
