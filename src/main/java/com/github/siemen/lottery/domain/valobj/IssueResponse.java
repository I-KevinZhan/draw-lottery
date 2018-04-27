/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.lottery.domain.valobj;

import com.github.siemen.domain.PrizeInfo;

/**
 * <b>描述：</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public class IssueResponse {
    public static final int OK = 200;
    private int code;
    private PrizeInfo pirzeInfo;

    public int getCode() {
        return code;
    }

    public PrizeInfo getPirzeInfo() {
        return pirzeInfo;
    }
}