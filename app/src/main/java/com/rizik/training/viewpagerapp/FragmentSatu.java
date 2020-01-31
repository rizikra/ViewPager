package com.rizik.training.viewpagerapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSatu extends Fragment {

    public static FragmentSatu newInstance (String text){
        FragmentSatu fragmentSatu = new FragmentSatu();
        Bundle args = new Bundle();
        args.putString("text", text);
        fragmentSatu.setArguments(args);
        return fragmentSatu;
    }
    public FragmentSatu() {
        // Required empty public constructor
    }

    private TextView TextData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_fragment_satu, container, false);
        TextData = rootView.findViewById(R.id.text_data);
        TextData.setText(getArguments().getString("text"));

        return rootView;
    }
}