package com.example.jinqh.myapplicationclass;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

public class SortAdapter extends BaseAdapter {

    private List<User> list = null;
    private Context mContext;

    public SortAdapter(Context mContext, List<User> list) {
        this.mContext = mContext;
        this.list = list;
    }

    public int getCount() {
        return this.list.size();
    }

    public Object getItem(int position) {
        return list.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup arg2) {
        ViewHolder viewHolder;
        final User user = list.get(position);
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(mContext).inflate(R.layout.tongxunlu_item, null);
            viewHolder.name =  view.findViewById(R.id.name);

            viewHolder.catalog = view.findViewById(R.id.catalog);
            viewHolder.qq_num=view.findViewById(R.id.qq_num);
            viewHolder.phone=view.findViewById(R.id.phone);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        //根据position获取首字母作为目录catalog
        String catalog = list.get(position).getFirstLetter();

        //如果当前位置等于该分类首字母的Char的位置 ，则认为是第一次出现
        if(position == getPositionForSection(catalog)){
            viewHolder.catalog.setVisibility(View.VISIBLE);
            viewHolder.catalog.setText(user.getFirstLetter().toUpperCase());
        }else{
            viewHolder.catalog.setVisibility(View.GONE);
        }

        viewHolder.name.setText(this.list.get(position).getName());


        viewHolder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Toast.makeText(mContext, "数据暂时还没有导入，请等待~~~~"+list.get(position).getName(), Toast.LENGTH_SHORT).show();

                 startTargetActivity( mContext,list.get(position).getName(),list.get(position).getPhone(),list.get(position).getQq_num());
            }
        });

        return view;

    }
    //跳转到详细界面
    //参数：本界面Context,需要传递的参数；
    public static void startTargetActivity(Context srcActivity,String name,  String phone, String qq) {
        Intent intent = new Intent(srcActivity, phone_and_qq.class);
        //键值对传递
        intent.putExtra("name", name);
        intent.putExtra("phone", phone);
        intent.putExtra("qq", qq);
        srcActivity.startActivity(intent);
    }

    final static class ViewHolder {
        TextView catalog;
        Button name;

        TextView phone;
        TextView qq_num;
    }







    /**
     * 获取catalog首次出现位置
     */
    public int getPositionForSection(String catalog) {
        for (int i = 0; i < getCount(); i++) {
            String sortStr = list.get(i).getFirstLetter();
            if (catalog.equalsIgnoreCase(sortStr)) {
                return i;
            }
        }
        return -1;
    }

}