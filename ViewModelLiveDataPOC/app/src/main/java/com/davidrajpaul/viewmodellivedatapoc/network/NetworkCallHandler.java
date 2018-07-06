package com.davidrajpaul.viewmodellivedatapoc.network;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.davidrajpaul.viewmodellivedatapoc.model.MyDataClass;

/**
 * Created by DavidRaj Paul on 06-07-2018.
 */
public class NetworkCallHandler {

    public static void getMyData(RetrofitCallBackInterface<MyDataClass> callBack){
        RetrofitClient.getClient()
                .create(APIInterface.class).getMydata()
                .enqueue(new RetrofitCallBack<>(callBack));
    }


}
