/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.lottery.repo.cache;

import com.github.siemen.lottery.domain.aggregate.DrawLottery;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>描述：抽奖缓存对象</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public class DrawLotteryCacheAccessObj {

    private static final Map<Integer, DrawLottery> DRAW_LOTTERY_CACHE = new HashMap<>();

    public DrawLottery get(Integer lotteryId) {
        return DRAW_LOTTERY_CACHE.get(lotteryId);
    }

    public void add(Integer lotteryId, DrawLottery drawLottery) {
        DRAW_LOTTERY_CACHE.put(lotteryId, drawLottery);
    }
}