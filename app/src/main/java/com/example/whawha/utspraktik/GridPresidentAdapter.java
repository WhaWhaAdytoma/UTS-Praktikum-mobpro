package com.example.whawha.utspraktik;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.BitSet;

public class GridPresidentAdapter extends RecyclerView.Adapter<GridPresidentAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<President>listPresident;

    public ArrayList<President> getListPresident() {
        return listPresident;
    }

    public void setListPresident(ArrayList<President> listPresident) {
        this.listPresident = listPresident;
    }

    public GridPresidentAdapter(Context context) {
        this.context = context;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.act_profil, parent, false);
        GridViewHolder gridViewHolder = new GridViewHolder(view);
        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListPresident().get(position).getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }
    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        public GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}