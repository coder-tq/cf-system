package cn.coder_tq.core.DO;


import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("cf_info")
public class CfInfo {

  @TableId(value = "id", type = IdType.AUTO)
  private long id;

  @TableField("cf_id")
  private String cfId;

  @TableField("cf_current_rating")
  private long cfCurrentRating;

  @TableField("cf_profile_picture")
  private String cfProfilePicture;

  @TableField("cf_max_rating")
  private long cfMaxRating;

  @TableField("create_time")
  private Date createTime;

  @TableField("update_time")
  private Date updateTime;

  @TableLogic("is_delete")
  private long isDelete;

}
