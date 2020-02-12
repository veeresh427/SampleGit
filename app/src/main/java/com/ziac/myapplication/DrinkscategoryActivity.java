package com.ziac.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkscategoryActivity extends ListActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listDrinks=getListView();
        ArrayAdapter<Drinks>listAdapter=new ArrayAdapter<Drinks>(this,android.R.layout.simple_list_item_1,Drinks.drinks);
        listDrinks.setAdapter(listAdapter);
    }
    public void onListItemClick(ListView listView, View itemView,int position,long id)
    {
        if(position==0) {
        Intent intent = new Intent(DrinkscategoryActivity.this, DrinkActivity.class);
        // intent.putExtra(DrinkActivity.EXTRA_DRINKNO,(int)id);
        startActivity(intent);
    }
        else if (position==1)
        {
            Intent intent=new Intent(DrinkscategoryActivity.this,DrinkActivity1.class);
            startActivity(intent);
        }
        else if (position==2)
        {
            Intent intent=new Intent(DrinkscategoryActivity.this,DrinkActivity2.class);
            startActivity(intent);
        }
    }

}
