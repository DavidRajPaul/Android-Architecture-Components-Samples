package com.davidrajpaul.viewmodellivedatapoc.network;

import retrofit2.Response;

/**
 * Created by DavidRaj Paul on 06-07-2018.
 */
public interface RetrofitCallBackInterface<T> {

    public void onSuccess(Response<T> body);

    public void onError(int code, String error);
}
