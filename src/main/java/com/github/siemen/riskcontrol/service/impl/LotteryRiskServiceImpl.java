
package com.github.siemen.riskcontrol.service.impl;

import com.github.siemen.riskcontrol.domain.vo.RiskAccessToken;
import com.github.siemen.riskcontrol.domain.vo.RiskRequest;
import com.github.siemen.riskcontrol.service.LotteryRiskService;
import org.springframework.stereotype.Service;

/**
 * <b>描述：风险控制服务实现</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
@Service("lotteryRiskService")
public class LotteryRiskServiceImpl implements LotteryRiskService {
    @Override
    public RiskAccessToken accquire(RiskRequest req) {
        return null;
    }
}