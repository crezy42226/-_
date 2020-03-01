package com.crezy.joekfuny;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class Adapter extends RecyclerView.ViewHolder {


    View view;
    public Adapter(@NonNull View itemView) {
        super(itemView);

        view = itemView;


    }
    public void setDatails(Context context,String title,String dos,String image){
        TextView titleTv,dosTv;
        ImageView imageViewTv;
        titleTv = view.findViewById(R.id.titleTv);
        dosTv = view.findViewById(R.id.dosTv);
        imageViewTv = view.findViewById(R.id.imageTv);
        titleTv.setText(title);
        dosTv.setText(dos);
        Picasso.get().load(image).into(imageViewTv);
    }
}
