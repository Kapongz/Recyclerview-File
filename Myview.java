package com.example.spinnerxlistview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Myview extends RecyclerView.ViewHolder {
    TextView tvname,price;
    ImageView img;
    CardView card;

    public Myview(@NonNull View v){
        super(v);
        tvname = v.findViewById(R.id.textView);
        price = v.findViewById(R.id.textView2);
        img = v.findViewById(R.id.imageView);
        card = v.findViewById(R.id.cardv);
    }
}
