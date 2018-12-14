
package com.github.siemen.lottery.service.impl;

import com.github.siemen.lottery.domain.aggregate.DrawLottery;
import com.github.siemen.lottery.domain.entity.MtCity;
import com.github.siemen.lottery.domain.valobj.Award;
import com.github.siemen.lottery.domain.valobj.AwardPool;
import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;
import com.github.siemen.lottery.domain.valobj.IssueResponse;
import com.github.siemen.counter.facade.AwardCountFacade;
import com.github.siemen.lottery.facade.UserCityInfoFacade;
import com.github.siemen.lottery.repo.repository.DrawLotteryRepository;
import com.github.siemen.lottery.service.AwardSendResponse;
import com.github.siemen.lottery.service.AwardSendService;
import com.github.siemen.lottery.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b>描述：抽奖领域服务实现</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
@Service("lotteryService")
public class LotteryServiceImpl implements LotteryService {

    @Autowired
    private DrawLotteryRepository repository;
    @Autowired
    private UserCityInfoFacade userCityInfoFacade;
    @Autowired
    private AwardSendService awardSendService;
    @Autowired
    private AwardCountFacade awardCountFacade;

    @Override
    public IssueResponse issueLottery(DrawLotteryContext context) {
        DrawLottery lottery = repository.getDrawLotteryById(context.getLotteryId());
        awardCountFacade.incrTryCount(context);
        MtCity mtCityInfo = userCityInfoFacade.getMtCityInfo(context);
        context.setMtCityInfo(mtCityInfo);
        AwardPool awardPool = lottery.chooseAwardPool(context);
        Award award = awardPool.randomGetAward();
        return buildIssueResponse(awardSendService.sendAward(award, context));
    }

    private IssueResponse buildIssueResponse(AwardSendResponse awardSendResponse) {
        IssueResponse issueResponse = new IssueResponse();
        return null;
    }
}