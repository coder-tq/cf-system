package cn.coder_tq.core.DO;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("cf_user_merge")
public class CfUserMerge {

  @TableField("id")
  private long id;

  @TableField("cf_id")
  private String cfId;

  @TableField("qq")
  private long qq;

  @TableField("create_time")
  private Date createTime;

  @TableField("update_time")
  private Date updateTime;

  @TableField("is_deleted")
  private long isDeleted;

}
