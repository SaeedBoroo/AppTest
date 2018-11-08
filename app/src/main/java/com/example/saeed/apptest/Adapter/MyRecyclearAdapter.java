package com.example.saeed.apptest.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saeed.apptest.R;
import com.example.saeed.apptest.model.product;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyRecyclearAdapter extends RecyclerView.Adapter<MyRecyclearAdapter.MyViewHolder> {


    List<product> list;
    Context context;

    public MyRecyclearAdapter(Context context, List<product> list) {
        this.list = list;
        this.context=context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myViewHolder=  LayoutInflater.from(context).inflate(R.layout.recycler_view_item, parent, false);
        return new MyViewHolder(myViewHolder);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textViewName.setText(list.get(position).getName());
        holder.textViewDes.setText(list.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.rv_adapter_name)
        TextView textViewName;
        @BindView(R.id.rv_adapter_description)
        TextView textViewDes;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
