package com.rizik.training.viewpagerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil viewPager yang ada di activity_main ke Main Activity
        viewPager = findViewById(R.id.viewPager);
        myAdapter = new MyAdapter(getSupportFragmentManager());

        viewPager.setAdapter(myAdapter);
    }
}
