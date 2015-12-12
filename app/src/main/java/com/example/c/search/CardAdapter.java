package com.example.c.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by c on 2015/12/12.
 */
public class CardAdapter extends BaseAdapter{
    private List<Card> mList;
    private Context mContext;
    public CardAdapter(List<Card> mList, Context context){
        this.mList=mList;
        mContext = context;
    }
    @Override
    public int getCount() {        //得到长度
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_card, null);
        TextView name = (TextView) view.findViewById(R.id.tv_name);
        TextView money= (TextView) view.findViewById(R.id.tv_money);
        TextView time=(TextView)view.findViewById(R.id.tv_time);
        name.setText(mList.get(position).getName());
        money.setText(mList.get(position).getMoney() + "");
        time.setText(mList.get(position).getTime());
        return view;
    }
}
