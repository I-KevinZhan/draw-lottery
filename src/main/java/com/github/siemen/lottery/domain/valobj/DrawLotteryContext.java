
package com.github.siemen.lottery.domain.valobj;

import com.github.siemen.lottery.domain.entity.MtCity;

/**
 * <b>描述：抽奖上下文VO</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
public class DrawLotteryContext {

    private MtCity mtCityInfo;
    private String gameScore;
    private String lan;
    private String lat;
    private Long userId;

    public MtCity getMtCityInfo() {
        return mtCityInfo;
    }

    public void setMtCityInfo(MtCity mtCityInfo) {
        this.mtCityInfo = mtCityInfo;
    }

    public String getGameScore() {
        return gameScore;
    }

    public String getLan() {
        return lan;
    }

    public String getLat() {
        return lat;
    }

    public Integer getLotteryId() {
        return 123;
    }

    public Long getUserId() {
        return userId;
    }
}