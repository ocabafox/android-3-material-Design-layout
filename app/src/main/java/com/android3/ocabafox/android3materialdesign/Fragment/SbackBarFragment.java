package com.android3.ocabafox.android3materialdesign.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android3.ocabafox.android3materialdesign.R;

/**
 * Created by ocabafox on 7/8/2015.
 */
public class SbackBarFragment extends Fragment implements View.OnClickListener {
    View view;
    FloatingActionButton fab;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.snackbar_layout,container,false);
        setupFab();
        return view;
    }

    private void setupFab(){
        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        if(fab != null)
            fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.fab){
            Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();
            Snackbar
                    .make(view.findViewById(R.id.rootLayout), "This is Snackbar", Snackbar.LENGTH_LONG)
                    .setAction("Action", this)
                    .show(); // Don’t forget to show!
        }
    }
}
