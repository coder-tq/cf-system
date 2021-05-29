package cn.coder_tq.core.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupUserMerge {

  private long id;
  private long groupNumber;
  private long qq;
  private Date createTime;
  private Date updateTime;

}
