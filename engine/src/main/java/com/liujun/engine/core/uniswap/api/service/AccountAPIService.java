package com.liujun.engine.core.uniswap.api.service;

import com.liujun.engine.core.uniswap.api.bean.Account;

import java.util.List;

public interface AccountAPIService {
     List<Account> getAccounts(String... symbolArr);


}
