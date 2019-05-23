package com.llh.lucky_me.modle.component.prize;

import lombok.Data;

@Data
public class DrawerBo {
    private String userId;
    private String memberId;
    private Integer drawTimes;
    private Integer rmf;
    private Integer wishPrizeCode;
}
