package com.zhuandian.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhuandian.mvvmdemo.databinding.FragmentDemoBinding;

/**
 * desc :
 * author：xiedong
 * data：2018/9/13
 */
public class DemoFragment extends Fragment {
    private FragmentDemoBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_demo,null);
//        return view;

        mBinding = FragmentDemoBinding.inflate(inflater);
//        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_demo, container, false);
        mBinding.tvFragment.setText("fsdafsda");
        return mBinding.getRoot();
    }
}
