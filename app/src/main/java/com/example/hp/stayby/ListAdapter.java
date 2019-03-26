package com.example.hp.stayby;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by hp on 24/03/2019.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    ArrayList<Model> arrayList;
    Context context;


    public ListAdapter(ArrayList<Model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        return arrayList.get(position).getType();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        if(viewType==1)
         v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hostel, parent, false);
        else if (viewType==2)
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flat, parent, false);
        else
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pg, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(ListAdapter.MyViewHolder holder, int position) {

        holder.t1.setText(arrayList.get(position).getName());
        holder.t2.setText(arrayList.get(position).getAddress());
        holder.t3.setText("Rs. "+arrayList.get(position).getRent());
        holder.imageView.setImageResource(arrayList.get(position).getImage());


    }


    @Override
    public int getItemCount() {
        return (arrayList.size());
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        LinearLayout linearLayout, linearLayout2;
        ImageView imageView;
        TextView t1, t2, t3;

        public MyViewHolder(View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.hostel_lay);
            linearLayout2 = itemView.findViewById(R.id.hostel_info);
            imageView = itemView.findViewById(R.id.img) ;
            t1 = itemView.findViewById(R.id.type);
            t2 = itemView.findViewById(R.id.address);
            t3 = itemView.findViewById(R.id.rent);


        }


    }
}

