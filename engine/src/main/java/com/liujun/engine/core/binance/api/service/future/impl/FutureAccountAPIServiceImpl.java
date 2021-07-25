package com.liujun.engine.core.binance.api.service.future.impl;

import com.liujun.engine.core.binance.api.bean.futures.result.Account;
import com.liujun.engine.core.binance.api.client.APIClient;
import com.liujun.engine.core.binance.api.config.APIConfiguration;
import com.liujun.engine.core.binance.api.service.future.FutureAccountAPIService;
import com.liujun.engine.core.binance.api.utils.DateUtils;

public class FutureAccountAPIServiceImpl implements FutureAccountAPIService {
    private final APIClient client;
    private final FutureAccountAPI futureAccountAPI;
    public FutureAccountAPIServiceImpl(APIConfiguration config) {
        this.client = new APIClient(config);
        this.futureAccountAPI = this.client.createService(FutureAccountAPI.class);
    }

    @Override
    public Account accountInfo(long recvWindow) {
        return this.client.executeSync(this.futureAccountAPI.accountInfo(recvWindow, DateUtils.getUnixTimeMilli()));
    }
}
