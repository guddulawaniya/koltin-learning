package com.example.selflearning;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptercards extends RecyclerView.Adapter<Adaptercards.viewholder> {


    ArrayList imagelist;
    Context context;

    public Adaptercards(ArrayList imagelist,Context context) {
        this.imagelist = imagelist;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayoutdesign,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        cardModule module = (cardModule) imagelist.get(position);
        holder.title_name.setText(module.getTitle());
        holder.image.setImageResource(module.getImage());
        holder.descripation.setText(module.getDescripation());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Topics_activity.class);
                intent.putExtra("id",module.getId());

            }
        });




    }

    @Override
    public int getItemCount() {
        return imagelist.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        TextView title_name,descripation;
        ImageView image;
        CardView cardView;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            title_name = itemView.findViewById(R.id.title_name);
            descripation = itemView.findViewById(R.id.descripation);
            cardView = itemView.findViewById(R.id.maincard);
        }
    }

}


