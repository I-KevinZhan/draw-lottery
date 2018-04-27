/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.rpc.Impl;

import com.github.siemen.rpc.LbsReq;
import com.github.siemen.rpc.LbsResponse;
import com.github.siemen.rpc.LbsService;
import org.springframework.stereotype.Service;

/**
 * <b>描述：RPC服务实现 获取城市信息</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-04-27<br/>
 *
 */
@Service("lbsService")
public class LbsServiceImpl implements LbsService {
    @Override
    public LbsResponse getLbsCityInfo(LbsReq lbsReq) {
        return null;
    }
}