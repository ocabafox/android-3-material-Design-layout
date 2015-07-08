package com.android3.ocabafox.android3materialdesign.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android3.ocabafox.android3materialdesign.R;

/**
 * Created by ocabafox on 7/7/2015.
 */
public class ToolBarFragment extends Fragment {
    TabLayout tabLayout;
    View view;
    Toolbar toolbar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.toolbar_activity,container,false);
        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        return view;
    }



}
