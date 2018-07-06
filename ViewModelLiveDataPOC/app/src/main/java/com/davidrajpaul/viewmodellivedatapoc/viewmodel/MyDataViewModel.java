package com.davidrajpaul.viewmodellivedatapoc.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.davidrajpaul.viewmodellivedatapoc.model.MyDataClass;
import com.davidrajpaul.viewmodellivedatapoc.repository.MyDataRepository;

/**
 * Created by DavidRaj Paul on 06-07-2018.
 */
public class MyDataViewModel extends ViewModel {

    private MutableLiveData<MyDataClass> dataClass;

    public MutableLiveData<MyDataClass> getdataClass() {
        return (MutableLiveData<MyDataClass>) MyDataRepository.getMyData();
    }
}
