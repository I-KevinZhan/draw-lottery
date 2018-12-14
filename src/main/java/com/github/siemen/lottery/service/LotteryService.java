
package com.github.siemen.lottery.service;

import com.github.siemen.lottery.domain.valobj.IssueResponse;
import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;

/**
 * <b>描述：抽奖领域服务</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public interface LotteryService {
    IssueResponse issueLottery(DrawLotteryContext context);
}