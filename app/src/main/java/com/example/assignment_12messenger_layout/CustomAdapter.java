package com.example.assignment_12messenger_layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    public CustomAdapter(Context mcontext1, ArrayList<String> mImageName1, ArrayList<String> mImage1) {
        this.mcontext1 = mcontext1;
        this.mImageName1 = mImageName1;
        this.mImage1 = mImage1;
    }

    private Context mcontext1;
    private ArrayList<String> mImageName1;
    private ArrayList<String> mImage1;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
       MyViewHolder holder = new MyViewHolder(view);
       return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name1.setText(mImageName1.get(position));
        Glide.with(mcontext1)
                .asBitmap()
                .load(mImage1.get(position))
                .placeholder(R.drawable.img)
                .into(holder.image1);
    }

    @Override
    public int getItemCount() {
        return mImageName1.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image1;
        TextView name1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.img);
            name1 = itemView.findViewById(R.id.img_name);
        }
    }

}
