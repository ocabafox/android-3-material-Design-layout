package com.android3.ocabafox.android3materialdesign.Fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android3.ocabafox.android3materialdesign.R;

/**
 * Created by ocabafox on 7/8/2015.
 */
public class TabLayoutFragment extends Fragment {
    View view;
    TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tablayout_activity,container,false);
        setupTablayout();
        return view;
    }

    private void setupTablayout(){

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);

        if(tabLayout == null)
            return;

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 4"));
    }
}
