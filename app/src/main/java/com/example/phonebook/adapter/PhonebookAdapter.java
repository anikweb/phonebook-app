package com.example.phonebook.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonebook.R;
import com.example.phonebook.UserDetailsActivity;
import com.example.phonebook.data.People;
import com.example.phonebook.viewHolder.PhonebookViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PhonebookAdapter extends RecyclerView.Adapter<PhonebookViewHolder> {

    Context context;
    List<People> peopleList;

    public PhonebookAdapter(Context context, List<People> peopleList) {
        this.context = context;
        this.peopleList = peopleList;
    }
    @NonNull
    @Override
    public PhonebookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.phonebook_list_layout,parent,false);
        return new PhonebookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhonebookViewHolder holder, int position) {
        People people = peopleList.get(position);
        holder.userName.setText(people.getName());
        holder.cellNumber.setText(people.getCellNumber());

        Picasso.get().load(people.getImage()).placeholder(R.drawable.loading).into(holder.image);

        holder.itemView.setOnClickListener(v -> {
            Intent PhonebookIntent = new Intent(context,UserDetailsActivity.class);
            PhonebookIntent.putExtra("name",people.getName());
            PhonebookIntent.putExtra("email",people.getEmail());
            PhonebookIntent.putExtra("image",people.getImage());
            PhonebookIntent.putExtra("cellNumber",people.getCellNumber());
            PhonebookIntent.putExtra("address",people.getAddress());
            context.startActivity(PhonebookIntent);
        });
        holder.callBtn.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+people.getCellNumber()));
            context.startActivity(callIntent);
        });

    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }
}
