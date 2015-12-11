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
             //我想写个条件。。。能想到的只有switch
              //String name=Item()
              //switch ()
              intent.putExtra("name", "详细信息正在搜索");
               startActivity(intent);

           }
       });

    }


    private void initltem() {
        Item one = new Item("吴倩岚", R.mipmap.one);
        Item two = new Item("谭芮", R.mipmap.two);
        Item three = new Item("饶东", R.mipmap.three);
        Item four = new Item("曾名扬", R.mipmap.four);
        Item five=new Item("吴凡",R.mipmap.four);
        itemList.add(one);
        itemList.add(two);
        itemList.add(three);
        itemList.add(four);
        itemList.add(five);
        }
    }


