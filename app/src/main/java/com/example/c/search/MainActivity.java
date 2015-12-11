package com.example.c.search;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {
    private List<Item>itemList=new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initltem();
        ItemAdapter adapter=new ItemAdapter(this,R.layout.list_item,itemList);
        ListView mlistView=(ListView)findViewById(R.id.list_view);
        mlistView.setAdapter(adapter);
       mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Intent intent=new Intent(MainActivity.this,DetailActivity.class);
             // String data="hehe";
              //intent.putExtra("extra_data",data);
               startActivity(intent);
           }
       });

    }


    private void initltem() {
        for (int i = 0; i <= 100; i++) {
            Item one = new Item("item_"+i, R.mipmap.one);
           // Item two = new Item("item_"+i, R.mipmap.two);
           // Item three = new Item("item_"+i, R.mipmap.three);
            //Item four = new Item("item_"+i, R.mipmap.four);
            itemList.add(one);
          //  itemList.add(two);
           // itemList.add(three);
          //  itemList.add(four);
        }
    }

}
