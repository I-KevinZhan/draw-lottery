/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.lottery.domain.aggregate;

import com.github.siemen.lottery.domain.entity.MtCity;
import com.github.siemen.lottery.domain.valobj.AwardPool;
import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;
import java.util.List;

/**
 * <b>描述：抽奖聚合根</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public class DrawLottery {
    /**
     *  抽奖ID
     */
    private Integer lotteryId;
    /**
     * 奖池列表
     */
    private List<AwardPool> awardPoolList;

    /**
     * setter
     * @param lotteryId
     */
    public void setLotteryId(Integer lotteryId) {
        if (lotteryId == null || lotteryId <= 0) {
            throw new IllegalArgumentException("非法的抽奖ID");
        }
        this.lotteryId = lotteryId;
    }

    /**
     * 选择奖项池
     * @param drawLotteryContext
     * @return
     */
   public AwardPool chooseAwardPool(DrawLotteryContext drawLotteryContext) {
        if (drawLotteryContext.getMtCityInfo() != null) {
            return chooseAwardPoolByCityInfo(awardPoolList, drawLotteryContext.getMtCityInfo());
        } else {
            return chooseAwardPoolByScore(awardPoolList, drawLotteryContext.getGameScore());
        }
   }

    private AwardPool chooseAwardPoolByScore(List<AwardPool> awardPoolList, String gameScore) {
        for (AwardPool awardPool : awardPoolList) {
            if (awardPool.matchedScore(gameScore)) {
                return awardPool;
            }
        }
        return null;
    }

    private AwardPool chooseAwardPoolByCityInfo(List<AwardPool> awardPoolList, MtCity mtCityInfo) {
        for (AwardPool awardPool : awardPoolList) {
            if (awardPool.matchedCity(mtCityInfo.getCityId())) {
                return awardPool;
            }
        }
        return null;
    }

}