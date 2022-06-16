package com.example.spinnerxlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityCategory extends AppCompatActivity {
ImageView image;
TextView tvname,tvpric;
RecyclerView crv;
RecyclerView.Adapter<Myview> adp1;
//int [] img = {
//        R.drawable.acer,
//};
//String [] menu = {""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);
        image = findViewById(R.id.img);
        tvname = findViewById(R.id.tvname);
        tvpric = findViewById(R.id.price);

       Bundle bun = getIntent().getExtras();
       image.setImageResource(bun.getInt("img"));
       tvname.setText(bun.getString("fname"));
       tvpric.setText(bun.getString("fprice"));

    }
}