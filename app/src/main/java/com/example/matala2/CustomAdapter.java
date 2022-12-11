package com.example.matala2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private RecyclerViewInterface recyclerViewInterface;
    Context context;
    private ArrayList<DataModel> dataSet;


    public CustomAdapter(ArrayList<DataModel> dataSet, BlankFragmentOne blankFragmentOne) {
        this.dataSet = dataSet;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        TextView description2;

        public MyViewHolder(View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.card_view);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (recyclerViewInterface != null) {
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION) {
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });

        }

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view, recyclerViewInterface);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int listPosition) {

        TextView textViewName = viewHolder.textViewName;
        TextView textViewDescription = viewHolder.textViewVersion;
        ImageView imageView = viewHolder.imageViewIcon;
        CardView cardView = viewHolder.cardView;

        textViewDescription.setText(dataSet.get(listPosition).getVersion());
        textViewName.setText(dataSet.get(listPosition).getName());
        imageView.setImageResource(dataSet.get(listPosition).getImage());



        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Bundle bundle = new Bundle();
                bundle.putString("description2",dataSet.get(viewHolder.getAdapterPosition()).getDescription2());
                bundle.putString("title",dataSet.get(viewHolder.getAdapterPosition()).getName());
                bundle.putInt("image",dataSet.get(viewHolder.getAdapterPosition()).getImage());
                Navigation.findNavController(view).navigate(R.id.action_blankFragmentOne_to_blankFragmentTwo,bundle);
            }
        });

    }

        @Override
        public int getItemCount() {
            return dataSet.size();
        }
    }

