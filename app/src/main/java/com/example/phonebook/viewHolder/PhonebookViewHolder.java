package com.example.phonebook.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.phonebook.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class PhonebookViewHolder extends RecyclerView.ViewHolder {
   public TextView userName,cellNumber;
   public CircleImageView image;
   public  ImageView callBtn;

    public PhonebookViewHolder(@NonNull View itemView) {
        super(itemView);
        userName = itemView.findViewById(R.id.name);
        cellNumber = itemView.findViewById(R.id.cellNumber);
        image = itemView.findViewById(R.id.profile_image);
        callBtn = itemView.findViewById(R.id.callBtn);

    }
}
