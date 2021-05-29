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
@TableName("group_info")
public class GroupInfo {

  @TableId(value = "id", type = IdType.AUTO)
  private long id;

  @TableField("group_name")
  private String groupName;

  @TableField("group_number")
  private long groupNumber;

  @TableField("create_time")
  private Date createTime;

  @TableField("update_time")
  private Date updateTime;

}
