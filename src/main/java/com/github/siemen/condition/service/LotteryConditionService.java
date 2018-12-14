
package com.github.siemen.condition.service;

import com.github.siemen.condition.domain.vo.LotteryConditionResult;

/**
 * <b>描述：抽奖条件限制服务</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public interface LotteryConditionService {
    LotteryConditionResult checkLotteryCondition(Integer lotteryId, Long userId);
}