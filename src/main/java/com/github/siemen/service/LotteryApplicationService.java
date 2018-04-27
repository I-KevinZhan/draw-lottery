/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.service;

import com.github.siemen.condition.domain.vo.LotteryConditionResult;
import com.github.siemen.condition.service.LotteryConditionService;
import com.github.siemen.domain.ErrorData;
import com.github.siemen.domain.PrizeInfo;
import com.github.siemen.domain.Response;
import com.github.siemen.domain.ResponseCode;
import com.github.siemen.domain.ResponseMsg;
import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;
import com.github.siemen.lottery.domain.valobj.IssueResponse;
import com.github.siemen.lottery.service.LotteryService;
import com.github.siemen.riskcontrol.domain.vo.RiskAccessToken;
import com.github.siemen.riskcontrol.domain.vo.RiskRequest;
import com.github.siemen.riskcontrol.service.LotteryRiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b>描述：抽奖应用服务</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-04-27<br/>
 *
 */
@Service("lotteryApplicationService")
public class LotteryApplicationService {

    @Autowired
    private LotteryService lotteryService;
    @Autowired
    private LotteryConditionService conditionService;
    @Autowired
    private LotteryRiskService riskService;

    public Response<PrizeInfo, ErrorData> participateLottery(DrawLotteryContext lotteryContext) {
        //登录验证
        validLoginInfo(lotteryContext);
        //风险控制验证
        RiskAccessToken riskAccessToken = riskService.accquire(buildRiskReq(lotteryContext));
        //抽奖条件检查
        LotteryConditionResult lotteryConditionResult = conditionService
                .checkLotteryCondition(lotteryContext.getLotteryId(), lotteryContext.getUserId());
        //抽奖
        IssueResponse issueResponse = lotteryService.issueLottery(lotteryContext);
        if (issueResponse != null && issueResponse.getCode() == IssueResponse.OK) {
            return buildSuccessResponse(issueResponse.getPirzeInfo());
        } else {
            return buildErrorResponse(ResponseCode.ISSUE_LOTTERY_FAIL, ResponseMsg.ISSUE_LOTTERY_FAIL);
        }
    }

    private Response<PrizeInfo, ErrorData> buildErrorResponse(int issueLotteryFail, String issueLotteryFail1) {
        return null;
    }

    private Response<PrizeInfo, ErrorData> buildSuccessResponse(PrizeInfo pirzeInfo) {
        return null;
    }

    private RiskRequest buildRiskReq(DrawLotteryContext lotteryContext) {
        return null;
    }

    private void validLoginInfo(DrawLotteryContext lotteryContext) {

    }

}