package com.rizik.training.viewpagerapp;

import android.provider.ContactsContract;

import java.util.ArrayList;

public class MenuMakanan {
    private String namaMenu;
//    private String data;
    private ArrayList<Makanan> data;

    public static class Makanan{
        private String nama, harga;

        public Makanan (String nm, String price){
            this.nama = nm;
            this.harga = price;
        }
    }

    public MenuMakanan (String namaMenu, ArrayList<Makanan> data) {
        this.namaMenu = namaMenu;
        this.data = data;
    }
    public String getNamaMenu(){
        return namaMenu;
    }
    public String getData(){
        return data;
    }
}