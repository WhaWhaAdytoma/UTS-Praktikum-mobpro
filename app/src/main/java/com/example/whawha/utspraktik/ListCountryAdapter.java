package com.example.whawha.utspraktik;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListCountryAdapter extends RecyclerView.Adapter<ListCountryAdapter.OriginalViewHolder> {
    private Context context;
    private ArrayList<President> listPresident;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(final OnItemClickListener
                                               mItemClickListener) {
        this.mOnItemClickListener = mItemClickListener;
    }

    public ListCountryAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<President> getListPresident() {
        return listPresident;
    }

    public void setListPresident(ArrayList<President> listPresident) {
        this.listPresident = listPresident;
    }

    @Override
    public OriginalViewHolder onCreateViewHolder(ViewGroup parent, int
            viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_country,
                        parent, false);
        return new OriginalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OriginalViewHolder holder, final int position) {
        holder.tvName.setText(getListPresident().get(position).getName());

        holder.tvRemarks.setText(getListPresident().get(position).getRemarks());
        Glide.with(context)
                .load(getListPresident().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Kamu memilih "
                        + getListPresident().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    class OriginalViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public OriginalViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

