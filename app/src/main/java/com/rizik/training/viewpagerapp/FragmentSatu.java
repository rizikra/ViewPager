package com.rizik.training.viewpagerapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSatu extends Fragment {

    private static ArrayList<Makanan> foods;
    public static FragmentSatu newInstance (ArrayList<Makanan> text){
        FragmentSatu fragmentSatu = new FragmentSatu();

        foods = text;
//        Bundle args = new Bundle();
//        args.putString("text", String.valueOf(text));
//        fragmentSatu.setArguments(args);
        return fragmentSatu;
    }
    public FragmentSatu() {
        // Required empty public constructor
    }

    private ListView listData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_fragment_satu, container, false);
       // final String[] items = new String[]{"Data 1", "Data 2", "Data 3"};
        UserAdapter adapter = new UserAdapter(getActivity(), foods);
        listData = (ListView)rootView.findViewById(R.id.lv_data);
        listData.setAdapter(adapter);

        return rootView;
    }
}