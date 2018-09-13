package com.zhuandian.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhuandian.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        mainBinding  = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.tvInfo.setText("Data Binding");

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container,new DemoFragment())
                .commit();
    }
}
