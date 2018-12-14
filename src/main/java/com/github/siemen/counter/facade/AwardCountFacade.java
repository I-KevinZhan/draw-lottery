
package com.github.siemen.counter.facade;

import com.github.siemen.lottery.domain.valobj.DrawLotteryContext;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

/**
 * <b>描述：计数上下文防腐层</b> <br/>
 *
 * <b>时间：</b>2018-04-27<br/>
 *
 */
@Service("awardCountFacade")
public class AwardCountFacade {
    private static final AtomicLong count = new AtomicLong(0);
    public void incrTryCount(DrawLotteryContext context) {
        count.incrementAndGet();
    }
}