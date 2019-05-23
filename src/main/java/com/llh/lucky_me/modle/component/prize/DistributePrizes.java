package com.llh.lucky_me.modle.component.prize;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class DistributePrizes {


    /*public void smallDraw(Integer rmf, RmfEnum rmfEnum) {
        //概率普通奖
        List<DrawerBo> drawerList = drawService.selectDrawer(rmf, null);
        List<PrizeBO> list = rmfEnum.getList();
        Integer DJQNumber = list.get(0).getNumber();
        List<Double> probListOne = new ArrayList<Double>();
        for (PrizeBO prizeBO : list) {
            probListOne.add(prizeBO.getProd());
        }
        for (DrawerBo drawerVo : drawerList) {
            Integer drawTimes = drawerVo.getDrawTimes();
            while (drawTimes > 0) {
                Integer index = draw(probListOne);
                PrizeBO prizeHit = list.get(index);

                //个数限制考虑
                try {
                    if (prizeHit.getCode() == 11) {
                        if (DJQNumber > 0) {
                            drawService.saveData(prizeHit.getCode(), 2, drawerVo.getUserId());
                            DJQNumber--;
                            if (DJQNumber == 0) {
                                list.remove(0);
                            }
                        }
                    } else {
                        drawService.saveData(prizeHit.getCode(), 2, drawerVo.getUserId());
                    }
                } catch (Exception e) {
                    log.error("普通奖抽奖插入数据失败", e.getMessage());
                }
                drawTimes--;
            }
        }
    }*/

    public static Integer draw(List<Double> probList) {
        List<Double> sortRateList = new ArrayList<Double>();

        Double sumRate = 0D;
        for (Double prod : probList) {
            sumRate += prod;
        }

        Double rate = 0D;
        for (Double prob : probList) {
            rate += prob;
            sortRateList.add(rate / sumRate);
        }
        //产生一个0到1的随机数
        Double random = Math.random();
        sortRateList.add(random);
        Collections.sort(sortRateList);
        // 返回该随机数在比例集合中的索引
        return sortRateList.indexOf(random);
    }

}
