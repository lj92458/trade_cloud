package com.liujun.engine.core.binance.api.service.spot;

import com.liujun.engine.core.binance.api.bean.spot.result.Account;
import com.liujun.engine.core.binance.api.bean.spot.result.Depth;

public interface SpotProductAPIService {

    Depth marketDepth(String symbol, Integer limit);


}
