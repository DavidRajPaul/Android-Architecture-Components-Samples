package com.davidrajpaul.viewmodellivedatapoc.network;


import com.davidrajpaul.viewmodellivedatapoc.model.MyDataClass;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by DavidRaj Paul on 06-07-2018.
 */
public interface APIInterface {
    @GET("71a13054c1696a834c5bbb7570e68ece/raw/1a9958d684c7f098d2441f86bf9d04b242249cd7/samplejson.json")
    Call<MyDataClass> getMydata();
}
