package com.llh.lucky_me.modle.controller;

import com.llh.lucky_me.modle.bean.ResponseWrapper;
import com.llh.lucky_me.modle.bean.dto.DrawDTO;
import com.llh.lucky_me.modle.bean.vo.PrizeVO;
import com.llh.lucky_me.modle.component.example.BoundedHashSet;
import com.llh.lucky_me.system.utils.RedisUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@Api(value = "draw api", description = "抽奖接口")
/**
 * @author llh
 */
public class DrawController {

    @Autowired
    private RedisUtils redis;
    @Autowired
    private MongoTemplate mongoTemplate;


    @ApiOperation(value = "抽奖")
    @RequestMapping(value = "/draw", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseWrapper drawPrize(@RequestBody DrawDTO drawDTO, MultipartFile file) {
        log.info("info:prizeId:{}",drawDTO.getPrizeId());
        log.error("error:prizeId:{}",drawDTO.getPrizeId());
        PrizeVO vo = new PrizeVO();
        vo.setPrizeCode("iphone");
        redis.set("prize",drawDTO.getPrizeId());
        List<String> alist = new ArrayList<>();
        //mongoTemplate.save("prize","drawDTO.getPrizeId()");

        return ResponseWrapper.success("success",vo);
    }
}
