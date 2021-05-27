package cn.coder_tq.core.DO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class UserInfo {

  private long id;
  private long qq;
  private String password;
  private Date createTime;
  private Date updateTime;
  private long isDeleted;
  private String nickname;

}
