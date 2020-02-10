package com.rizik.training.viewpagerapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {
    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getImage() {
        return image;
    }

    private String nama, harga, deskripsi;
    private int image;

    public Makanan (String nm, String price, String deskripsi, int image){
        this.nama = nm;
        this.harga = price;
        this.deskripsi = deskripsi;
        this.image = image;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.harga);
        dest.writeString(this.deskripsi);
        dest.writeInt(this.image);
    }

    protected Makanan(Parcel in) {
        this.nama = in.readString();
        this.harga = in.readString();
        this.deskripsi = in.readString();
        this.image = in.readInt();
    }

    public static final Parcelable.Creator<Makanan> CREATOR = new Parcelable.Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel source) {
            return new Makanan(source);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };
}

