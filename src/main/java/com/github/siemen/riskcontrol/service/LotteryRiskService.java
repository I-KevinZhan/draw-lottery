
package com.github.siemen.riskcontrol.service;

import com.github.siemen.riskcontrol.domain.vo.RiskAccessToken;
import com.github.siemen.riskcontrol.domain.vo.RiskRequest;

/**
 * <b>描述：风险控制领域服务</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public interface LotteryRiskService {
    RiskAccessToken accquire(RiskRequest req);
}