package com.liujun.engine.core.binance.api.service.future;

import com.liujun.engine.core.binance.api.bean.futures.result.Account;

public interface FutureAccountAPIService {

    Account accountInfo(long recvWindow);
}
