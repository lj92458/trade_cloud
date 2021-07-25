package com.liujun.engine.core.binance.api.service.future.impl;

import com.liujun.engine.core.binance.api.bean.futures.result.Account;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface FutureAccountAPI {

    @GET("/dapi/v1/account")
    @Headers("SECURITY_TYPE:USER_DATA")
    Call<Account> accountInfo(@Query("recvWindow") long recvWindow,
                                     @Query("timestamp") long timestamp);
}
