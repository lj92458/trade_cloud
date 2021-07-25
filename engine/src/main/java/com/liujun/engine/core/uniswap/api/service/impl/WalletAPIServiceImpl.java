package com.liujun.engine.core.uniswap.api.service.impl;

import com.liujun.engine.core.uniswap.api.bean.APIConfiguration;
import com.liujun.engine.core.uniswap.api.bean.WithdrawParam;
import com.liujun.engine.core.uniswap.api.bean.WithdrawResult;
import com.liujun.engine.core.uniswap.api.service.WalletAPIService;

public class WalletAPIServiceImpl implements WalletAPIService {

    APIConfiguration config;

    public WalletAPIServiceImpl(APIConfiguration config) {
        this.config=config;
    }


    @Override
    public WithdrawResult withdraw(WithdrawParam param) throws Exception {
        return null;
    }
}
