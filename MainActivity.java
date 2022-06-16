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
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    RecyclerView crv;
    RecyclerView.Adapter<Myview> adp1;
    int [] img = {
            R.drawable.acer,
            R.drawable.acer,
    };
    String [] menu = {"Acer","Acer2"};
    String [] price = {"1000","2000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        crv = new RecyclerView(this);


        crv.setLayoutManager(new LinearLayoutManager(this));
        adp1 = new RecyclerView.Adapter<Myview>() {
            @NonNull
            @NotNull
            @Override
            public Myview onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
                Myview myv = new Myview(v);

                return myv;
            }

            @Override
            public void onBindViewHolder(@NonNull @NotNull Myview holder, int position) {

                holder.tvname.setText(menu[position]);
                holder.price.setText(price[position]);
                holder.img.setImageResource(img[position]);
                holder.card.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent obj = new Intent(MainActivity.this,ActivityCategory.class);
                        obj.putExtra("fname",menu[position]);
                        obj.putExtra("fprice",price[position]);
                        obj.putExtra("img",img[position]);
                        startActivity(obj);

                    }
                });

            }

            @Override
            public int getItemCount() {
                return menu.length;
            }

        };
        crv.setAdapter(adp1);
        setContentView(crv);


    }
}