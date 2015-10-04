package com.example.george.myapplication;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment{

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final Activity parentActivity = getActivity();

        View fragmentView = inflater.inflate(R.layout.fragment_main, container, false);
        Button btn = (Button)fragmentView.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ColorPickerDialog(parentActivity, (ColorPickerDialog.OnColorChangedListener)parentActivity, "test",(int)0xFF0000, (int)0x0000FF).show();
            }
        });
        return fragmentView;
    }

}
