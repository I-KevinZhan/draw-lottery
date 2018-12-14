
package com.github.siemen.rpc;

/**
 * <b>描述：外部RPC服务：获取城市信息</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public interface LbsService {

    LbsResponse getLbsCityInfo(LbsReq lbsReq);
}