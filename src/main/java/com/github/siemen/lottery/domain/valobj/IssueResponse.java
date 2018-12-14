
package com.github.siemen.lottery.domain.valobj;

import com.github.siemen.domain.PrizeInfo;

/**
 * <b>描述：</b> <br/>
 *
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