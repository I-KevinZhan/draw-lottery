/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.lottery.facade;

import com.github.siemen.lottery.domain.entity.MtCity;
import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;
import com.github.siemen.rpc.LbsReq;
import com.github.siemen.rpc.LbsResponse;
import com.github.siemen.rpc.LbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <b>描述：用户城市信息 防腐层</b> <br/>
 * 访问外部信息 增加一层处理
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-04-27<br/>
 *
 */
@Component
public class UserCityInfoFacade {
    @Autowired
    private LbsService lbsService;

    public MtCity getMtCityInfo(DrawLotteryContext context) {
        LbsReq  lbsReq = new LbsReq();
        lbsReq.setLan(context.getLan());
        lbsReq.setLat(context.getLat());
        LbsResponse lbsResponse = lbsService.getLbsCityInfo(lbsReq);
        return buildMtCityInfo(lbsResponse);
    }

    private MtCity buildMtCityInfo(LbsResponse lbsResponse) {
        // 增加一层处理转换
        return null;
    }
}