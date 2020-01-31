package com.rizik.training.viewpagerapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

// SUBCLASS DARI ACTIVITY MAIN
public class MyAdapter extends FragmentStatePagerAdapter {
    public MyAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        FragmentSatu fragmentSatu = new FragmentSatu();
        FragmentDua fragmentDua = new FragmentDua();

        Fragment item = null;

        switch (position){
            case 0:
                item = fragmentSatu;
                break;
            case 1:
                item = fragmentDua;
                break;
                default:
                    item = fragmentSatu;
                    break;
        }
        return item;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
