package com.davidrajpaul.viewmodellivedatapoc;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.davidrajpaul.viewmodellivedatapoc.model.MyDataClass;
import com.davidrajpaul.viewmodellivedatapoc.network.NetworkCallHandler;
import com.davidrajpaul.viewmodellivedatapoc.network.RetrofitCallBackInterface;
import com.davidrajpaul.viewmodellivedatapoc.viewmodel.MyDataViewModel;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView name = findViewById(R.id.name);
        final TextView age = findViewById(R.id.age);
        final TextView car = findViewById(R.id.car);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                new MyDataViewModel().getdataClass().observe(MainActivity.this, new Observer<MyDataClass>() {
                    @Override
                    public void onChanged(@Nullable MyDataClass myDataClass) {
                        name.setText(myDataClass.getName());
                        age.setText(myDataClass.getAge());
                        car.setText(myDataClass.getCar());
                    }
                });
            }
        });
    }
}
