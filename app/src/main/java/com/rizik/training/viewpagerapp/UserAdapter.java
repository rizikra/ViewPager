package com.rizik.training.viewpagerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class UserAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<Makanan> foods;

    public UserAdapter(Context context, ArrayList<Makanan> makanans) {
        this.context = context;
        this.foods=makanans;
    }


    @Override
    public int getCount() {
        return foods.size();
    }

    @Override
    public Object getItem(int position) {
        return foods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        Makanan food = (Makanan) getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);
        }

        TextView tvNamaMakanan = (TextView) convertView.findViewById(R.id.nama_makanan);
        TextView tvHarga = (TextView) convertView.findViewById(R.id.harga);

        tvNamaMakanan.setText(food.getNama());
        tvHarga.setText(food.getHarga());

        return convertView;

    }
}
