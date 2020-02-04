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

    ArrayList<MenuMakanan> kumpulanMenu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // generateTitle();
        //generateData();
        generateMenu();

        //Panggil viewPager yang ada di activity_main ke Main Activity
        viewPager = findViewById(R.id.viewPager);
        myAdapter = new MyAdapter(getSupportFragmentManager());
        //myAdapter = MyAdapter.newInstance(getSupportFragmentManager(), menuTitleData, data);
        myAdapter = MyAdapter.newInstance(getSupportFragmentManager(), kumpulanMenu, getApplicationContext());
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

    public void generateMenu() {
        ArrayList<Makanan> menuAyam = new ArrayList<>();
        menuAyam.add(new Makanan("Ayam Goreng", "10000"));
        menuAyam.add(new Makanan("Ayam Bakar", "15000"));
        menuAyam.add(new Makanan("Ayam Betutu", "20000"));
        kumpulanMenu.add(new MenuMakanan("Ayam", menuAyam));

        ArrayList<Makanan> menuMie = new ArrayList<>();
        menuMie.add(new Makanan("Mie Goreng", "10000"));
        menuMie.add(new Makanan("Mie Soto", "15000"));
        menuMie.add(new Makanan("Mie Rendang", "20000"));
        kumpulanMenu.add(new MenuMakanan("Mie", menuMie));

        ArrayList<Makanan> menuPaket = new ArrayList<>();
        menuPaket.add(new Makanan("Pahe", "10000"));
        menuPaket.add(new Makanan("Pale", "15000"));
        menuPaket.add(new Makanan("Pak De", "20000"));
        kumpulanMenu.add(new MenuMakanan("Paket", menuPaket));
    }
}
