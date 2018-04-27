/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.lottery.service;

import com.github.siemen.lottery.domain.valobj.IssueResponse;
import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;

/**
 * <b>描述：抽奖领域服务</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public interface LotteryService {
    IssueResponse issueLottery(DrawLotteryContext context);
}