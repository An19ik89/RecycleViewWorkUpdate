package com.example.anik.recycleviewwork.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anik.recycleviewwork.Model.ListItem;
import com.example.anik.recycleviewwork.R;

import java.util.List;

/**
 * Created by Anik on 2/23/2017.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder>{

    private List<ListItem>listData;
    private LayoutInflater inflater;

    public DerpAdapter(List<ListItem>listData, Context c){
        this.inflater=LayoutInflater.from(c);
        this.listData=listData;
    }
    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new DerpHolder(view);
    }
    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
      ListItem item=listData.get(position);
        holder.titles.setText(item.getTitle());
        holder.icon.setImageResource(item.getImgResid());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder{
        private TextView titles;
        private ImageView icon;
        private View container;
        public DerpHolder(View itemView) {
            super(itemView);
            titles=(TextView) itemView.findViewById(R.id.lbl_item_text);
            icon=(ImageView) itemView.findViewById(R.id.in_item_icon);
            container=itemView.findViewById(R.id.cont_item_root);
        }
    }
}
