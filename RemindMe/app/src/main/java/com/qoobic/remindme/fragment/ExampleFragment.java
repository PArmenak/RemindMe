package com.qoobic.remindme.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qoobic.remindme.R;

public class ExampleFragment extends Fragment {
    private static final int Layout = R.layout.fragment_example;

    private View view;

    public static ExampleFragment getInstance(){
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);

        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(Layout, container , false);
        return view;
    }
}
