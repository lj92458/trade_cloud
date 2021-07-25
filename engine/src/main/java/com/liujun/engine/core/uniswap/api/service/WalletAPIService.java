package com.liujun.engine.core.uniswap.api.service;

import com.liujun.engine.core.uniswap.api.bean.WithdrawParam;
import com.liujun.engine.core.uniswap.api.bean.WithdrawResult;

public interface WalletAPIService {
    WithdrawResult withdraw(WithdrawParam param) throws Exception;
}
