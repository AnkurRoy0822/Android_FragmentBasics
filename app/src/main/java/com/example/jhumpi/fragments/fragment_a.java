package com.example.jhumpi.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jhumpi on 6/12/18.
 */

public class fragment_a extends android.support.v4.app.Fragment {

    TextView txt;
    Button btn;
    int counter = 0;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState) {
        if(savedInstanceState!=null){

            counter = savedInstanceState.getInt("Counter",5);
        }
        return layoutInflater.inflate(R.layout.frag_a, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btn = getActivity().findViewById(R.id.fragAbtn);
        txt = getActivity().findViewById(R.id.fragAtxt);

        txt.setText("" + counter);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                counter++;
                txt.setText("" + counter);
            }
        });
    }
    public void onSavedInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Counter",counter);
    }

}
