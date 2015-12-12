package com.example.c.search;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private TextView mDetailText;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String a=getIntent().getStringExtra("name");
        String sex=getIntent().getStringExtra("sex");
        Toast.makeText(this,a,Toast.LENGTH_SHORT).show();
        mDetailText= (TextView) findViewById(R.id.tv_detail);
        mDetailText.setText(a+sex);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("详细信息");
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.title));
        toolbar.setNavigationIcon(getResources().getDrawable(R.mipmap.ic_close));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
