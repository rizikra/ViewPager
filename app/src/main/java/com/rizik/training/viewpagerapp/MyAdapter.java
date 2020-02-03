package com.rizik.training.viewpagerapp;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

// SUBCLASS DARI ACTIVITY MAIN
public class MyAdapter extends FragmentStatePagerAdapter {
    private static ArrayList<String> myTitles;
    private static ArrayList<String> myData;

    private static ArrayList<MenuMakanan> myMenu;

    private static int numOfItem;

    public static MyAdapter newInstance (FragmentManager fragmentManager, ArrayList<String> titles, ArrayList<String> data){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myTitles = titles;
        myData = data;
        numOfItem = data.size();
        return myAdapter;
    }
    //Overload newInstance() above
    public static MyAdapter newInstance (FragmentManager fragmentManager, ArrayList<MenuMakanan> kumpulanMenu){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myMenu = kumpulanMenu;
        numOfItem = kumpulanMenu.size();
        return myAdapter;


    }
    //Constractor
    public MyAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String text = myMenu.get(position).getData();

      //  FragmentSatu fragmentSatu = new FragmentSatu();
        FragmentSatu fragmentSatu = FragmentSatu.newInstance(text);

        return fragmentSatu;
    }

    @Override
    public int getCount() {
        return numOfItem;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        try{
            title = myMenu.get(position).getNamaMenu(); //object MenuMakanan menu.getNamaMenu();
        }
        catch (IndexOutOfBoundsException e){
            title = "Apa Saja";
        }
        return title;
    }
}
