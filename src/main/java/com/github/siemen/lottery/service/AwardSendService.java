
package com.github.siemen.lottery.service;

import com.github.siemen.lottery.domain.valobj.Award;
import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;

/**
 * <b>描述：发奖服务</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public interface AwardSendService {

    AwardSendResponse sendAward(Award award, DrawLotteryContext context);
}