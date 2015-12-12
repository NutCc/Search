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
    public View getView(int position,View convertView,ViewGroup parent){
        Item item=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceld,null);
            viewHolder=new ViewHolder();
            viewHolder.imageView=(ImageView)view.findViewById(R.id.iv_item);
            viewHolder.textView=(TextView)view.findViewById(R.id.tv_item);
            viewHolder.textView1=(TextView)view.findViewById(R.id.list_grade);
            viewHolder.textView2=(TextView)view.findViewById(R.id.list_xuehao);
            view.setTag(viewHolder);
        }
        else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
       /* ImageView imageView=(ImageView)view.findViewById(R.id.iv_item);
        TextView textView=(TextView)view.findViewById(R.id.tv_item);
        TextView textView1=(TextView)view.findViewById(R.id.list_xuehao);
        TextView textView2=(TextView)view.findViewById(R.id.list_grade);
        imageView.setImageResource(item.getImageId());
        textView.setText(item.getText());
        textView1.setText(item.getGrade());
        textView2.setText(item.getXuehao());*/
        viewHolder.imageView.setImageResource(item.getImageId());
        viewHolder.textView.setText(item.getText());
        viewHolder.textView1.setText(item.getGrade());
        viewHolder.textView2.setText(item.getXuehao());
        return view;
    }
    class ViewHolder{
        ImageView imageView;
        TextView textView;
        TextView textView1;
        TextView textView2;

    }
}
