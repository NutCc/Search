package com.example.c.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by c on 2015/12/8.
 */
public class ItemAdapter extends ArrayAdapter<Item> {
    private int resourceld;
    public ItemAdapter(Context context,int resource,List<Item>objects){
        super(context,resource,objects);
        resourceld=resource;
    }
    @Override
    public View getView(int position,View cinvertView,ViewGroup parent){
        Item item=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceld, null);
        ImageView imageView=(ImageView)view.findViewById(R.id.iv_item);
        TextView textView=(TextView)view.findViewById(R.id.tv_item);
        imageView.setImageResource(item.getImageId());
        textView.setText(item.getText());
        return view;
    }
}
