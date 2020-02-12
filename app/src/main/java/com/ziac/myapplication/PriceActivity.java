package com.ziac.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PriceActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    ArrayList images=new ArrayList<>(Arrays.asList(R.drawable.latte,R.drawable.coffee,R.drawable.green,R.drawable.k,R.drawable.andhra,R.drawable.t));
    ArrayList name=new ArrayList<>(Arrays.asList("Latte","Coffee","Green Tea","Karnataka","Andhra","TamilNadu"));
    ArrayList price=new ArrayList<>(Arrays.asList("Rs:15","Rs:15","Rs:15","Rs:75","Rs:75","Rs:75"));
    private  RecyclerView.LayoutManager layoutManager;

    private  RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerAdapter adapter=new RecyclerAdapter(PriceActivity.this,images,name,price);
        recyclerView.setAdapter(adapter);
    }
}
