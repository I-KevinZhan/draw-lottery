
package com.github.siemen.rpc.Impl;

import com.github.siemen.rpc.LbsReq;
import com.github.siemen.rpc.LbsResponse;
import com.github.siemen.rpc.LbsService;
import org.springframework.stereotype.Service;

/**
 * <b>描述：RPC服务实现 获取城市信息</b> <br/>
 *
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