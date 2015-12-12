package com.example.c.search;

import android.app.Activity;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {
    /*private List<Item>itemList=new ArrayList<Item>();
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
              intent.putExtra("name", "详细信息正在搜索");
               startActivity(intent);

           }
       });

    }


    private void initltem() {
        for(int i=0;i<100;i++) {
            Item one = new Item("吴倩岚", R.mipmap.one, "学号：2015210408", "班级：10");
            Item two = new Item("谭芮", R.mipmap.two, "学号：2015210413", "班级：10");
            Item three = new Item("饶东", R.mipmap.three, "学号：2015211478", "班级：01");
            Item four = new Item("曾名扬", R.mipmap.four, "学号：2015213870", "班级：01");
            Item five = new Item("吴凡", R.mipmap.four, "学号：2015214165", "班级：08");
            itemList.add(one);
            itemList.add(two);
            itemList.add(three);
            itemList.add(four);
            itemList.add(five);
        }
        }*/
    private List<Card> cards=new ArrayList<>();
    private ListView mListView;
    private Toolbar toolbar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    //设置布局显示
        mListView= (ListView) findViewById(R.id.list_view);//强制向下转型为listview，从布局中找到listview
        initCard();
        CardAdapter cardAdapter = new CardAdapter(cards, this);
        mListView.setAdapter(cardAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("name",cards.get(position).getName());
                intent.putExtra("sex",cards.get(position).getSex());
                startActivity(intent);
            }
        });
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("一卡通重邮");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.mipmap.one));
        toolbar.setTitleTextColor(getResources().getColor(R.color.title));



    }
    private void initCard(){
        cards.add(new Card("吴倩岚",3.0,"2015-12-12","女"));
        cards.add(new Card("凌霄", 368.1, "2015-12-11","男"));
        cards.add(new Card("林龙鑫", 20.59, "2015-12-11","男"));
    }
}




