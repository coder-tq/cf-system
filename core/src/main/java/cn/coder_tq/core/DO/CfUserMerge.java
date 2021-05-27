package cn.coder_tq.core.DO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class CfUserMerge {

  private long id;
  private String cfId;
  private long qq;
  private Date createTime;
  private Date updateTime;
  private long isDeleted;

}
