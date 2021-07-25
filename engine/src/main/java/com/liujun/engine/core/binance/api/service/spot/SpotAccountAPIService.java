package com.liujun.engine.core.binance.api.service.spot;

import com.liujun.engine.core.binance.api.bean.spot.result.Account;

/**
 * 币币资产相关接口
 */
public interface SpotAccountAPIService {

    Account accountInfo(long recvWindow);


}
