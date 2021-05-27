package cn.coder_tq.core.DO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
public class CfInfo {

  private long id;
  private String cfId;
  private long cfCurrentRating;
  private String cfProfilePicture;
  private long cfMaxRating;
  private Date createTime;
  private Date updateTime;
  private long isDelete;

}
