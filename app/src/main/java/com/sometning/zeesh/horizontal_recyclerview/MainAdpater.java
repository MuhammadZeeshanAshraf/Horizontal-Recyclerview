package com.sometning.zeesh.horizontal_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainAdpater extends RecyclerView.Adapter<MainAdpater.ViewHolder> {

    ArrayList<MainModel> mainModels;
    Context context;
    public MainAdpater(Context context , ArrayList<MainModel> mainModels)
    {
        this.context = context;
        this.mainModels = mainModels;
    }

    @NonNull
    @Override
    public MainAdpater.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item , parent , false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdpater.ViewHolder holder, int position) {

        holder.image.setImageResource(mainModels.get(position).getLogo());
        holder.text.setText(mainModels.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView  text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.logo);
            text  = itemView.findViewById(R.id.lang);
        }
    }
}
