package com.llh.lucky_me.modle.component.prize;

import lombok.Data;

@Data
public class PrizeBO {
    private Integer code;
    private Double prod;
    private Boolean isNumberLimit;
    private Integer number;
}
