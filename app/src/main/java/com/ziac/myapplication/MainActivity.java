package com.ziac.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position==0){

                    Intent intent=new Intent(MainActivity.this,DrinkscategoryActivity.class);
                    startActivity(intent);
                }
                if(position==1){

                    Intent intent=new Intent(MainActivity.this,DrinkscategoryActivity1.class);
                    startActivity(intent);
                }
                if(position==2){

                    Intent intent=new Intent(MainActivity.this,PriceActivity.class);
                    startActivity(intent);
                }

            }
        };
        ListView listView=(ListView)findViewById(R.id.listview);
        listView.setOnItemClickListener(itemClickListener);
    }

}
