package cn.coder_tq.core.DO;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("group_user_merge")
public class GroupUserMerge {

  @TableId(value = "id", type = IdType.AUTO)
  private long id;

  @TableField(value = "group_number")
  private long groupNumber;

  @TableField(value = "qq")
  private long qq;

  @TableField(value = "create_time")
  private Date createTime;

  @TableField(value = "update_time")
  private Date updateTime;

}
