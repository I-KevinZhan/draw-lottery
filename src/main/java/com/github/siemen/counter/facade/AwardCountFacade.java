/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.counter.facade;

import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

/**
 * <b>描述：计数上下文防腐层</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-04-27<br/>
 *
 */
@Service("awardCountFacade")
public class AwardCountFacade {
    private static final AtomicLong count = new AtomicLong(0);
    public void incrTryCount(DrawLotteryContext context) {
        count.incrementAndGet();
    }
}