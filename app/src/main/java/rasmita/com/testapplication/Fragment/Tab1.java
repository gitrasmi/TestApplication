package rasmita.com.testapplication.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rasmita.com.testapplication.R;


//Our class extending fragment
public class Tab1 extends Fragment {


    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.tab1, container, false);




        return view;
    }



}

