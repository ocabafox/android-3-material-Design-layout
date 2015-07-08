package com.android3.ocabafox.android3materialdesign.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android3.ocabafox.android3materialdesign.R;

/**
 * Created by ocabafox on 7/8/2015.
 */
public class CollapsingToolbarLayoutFragment extends Fragment {
    View view;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.collapsing_layout,container,false);
        setupCollapsingToolbarLayout();
        return view;
    }

    private void setupCollapsingToolbarLayout(){

        collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar);
        if(collapsingToolbarLayout != null){
            collapsingToolbarLayout.setTitle("OMG");
            //collapsingToolbarLayout.setCollapsedTitleTextColor(0xED1C24);
            //collapsingToolbarLayout.setExpandedTitleColor(0xED1C24);
        }
    }
}
