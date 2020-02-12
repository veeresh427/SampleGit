package com.ziac.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter  extends RecyclerView.Adapter <RecyclerAdapter.ImageViewHolder>{
    ArrayList images;
    ArrayList name;
    ArrayList price;
    PriceActivity priceActivity;

    public RecyclerAdapter(PriceActivity priceActivity, ArrayList images, ArrayList name, ArrayList price) {
        this.priceActivity=priceActivity;
        this.images=images;
        this.name=name;
        this.price=price;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.album_layout,parent,false);
        ImageViewHolder imageViewHolder=new ImageViewHolder(view);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {

      holder.Album.setImageResource((Integer) images.get(position));
      holder.AlbumTitle.setText((CharSequence) name.get(position));
        holder.AlbumTitle1.setText((CharSequence) price.get(position));
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder
    {
        ImageView Album;
        TextView AlbumTitle,AlbumTitle1 ;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            Album=itemView.findViewById(R.id.album);
            AlbumTitle=itemView.findViewById(R.id.album_title);
            AlbumTitle1=itemView.findViewById(R.id.album_title1);
        }
    }
}
