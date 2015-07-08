package com.android3.ocabafox.android3materialdesign.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android3.ocabafox.android3materialdesign.R;

/**
 * Created by ocabafox on 7/7/2015.
 */
public class FABFragment extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.floating_action_button,container,false);

        return view;
    }






}
