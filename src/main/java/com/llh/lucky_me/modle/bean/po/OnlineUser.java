package com.llh.lucky_me.modle.bean.po;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "t_tk_user")
public class OnlineUser {
    private String userId;
    private String userName;
    private String roleId;
}
