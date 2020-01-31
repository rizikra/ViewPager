package com.rizik.training.viewpagerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private MyAdapter myAdapter;
    private TabLayout tabLayout;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateTitle();
        generateData();

        //Panggil viewPager yang ada di activity_main ke Main Activity
        viewPager = findViewById(R.id.viewPager);
        //myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter = MyAdapter.newInstance(getSupportFragmentManager(), menuTitleData, data);
        viewPager.setAdapter(myAdapter);

        //Tambahkan TabLayout
        tabLayout = findViewById(R.id.tab_menu);
        tabLayout.setupWithViewPager(viewPager);

    }
    //Membuat dummy title data
    private void generateTitle(){
        menuTitleData.add("T dot");
        menuTitleData.add("Techpolitan");
        menuTitleData.add("ZONK");
    }
    private void generateData(){
        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");
    }

}
