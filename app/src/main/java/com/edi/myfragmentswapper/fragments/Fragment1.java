package com.edi.myfragmentswapper.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edi.myfragmentswapper.R;


public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }


    public static Fragment1 newInstance() {
        Fragment1 fragment = new Fragment1();

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

}
