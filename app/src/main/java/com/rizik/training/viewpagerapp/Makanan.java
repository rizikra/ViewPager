package com.rizik.training.viewpagerapp;

public class Makanan{
    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    private String nama, harga;

    public Makanan (String nm, String price){
        this.nama = nm;
        this.harga = price;
    }
}

