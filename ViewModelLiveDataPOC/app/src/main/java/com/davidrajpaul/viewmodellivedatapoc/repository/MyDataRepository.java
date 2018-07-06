package com.davidrajpaul.viewmodellivedatapoc.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.davidrajpaul.viewmodellivedatapoc.model.MyDataClass;
import com.davidrajpaul.viewmodellivedatapoc.network.NetworkCallHandler;
import com.davidrajpaul.viewmodellivedatapoc.network.RetrofitCallBackInterface;

import retrofit2.Response;

/**
 * Created by DavidRaj Paul on 06-07-2018.
 */
public class MyDataRepository {
    public static LiveData<MyDataClass> getMyData() {
        // This is not an optimal implementation, we'll fix it below
        final MutableLiveData<MyDataClass> data = new MutableLiveData<>();

        NetworkCallHandler.getMyData(new RetrofitCallBackInterface<MyDataClass>() {
            @Override
            public void onSuccess(Response<MyDataClass> res) {
                MyDataClass response = res.body();
                if (response != null) {
                    data.setValue(response);
                }
            }

            @Override
            public void onError(int code, String error) {
            }
        });

        return data;
    }
}
