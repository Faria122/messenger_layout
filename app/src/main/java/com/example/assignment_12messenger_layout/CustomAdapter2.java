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

public class CustomAdapter2  extends RecyclerView.Adapter<CustomAdapter2.MyViewHolder2> {

    private Context mcontext2;
    private ArrayList<String> mImageName2;

    private ArrayList<String> mImages;
    private ArrayList<String> mdescription;


    public CustomAdapter2(Context mcontext2, ArrayList<String> mImageName2, ArrayList<String> mImages, ArrayList<String> mdescription) {
        this.mcontext2 = mcontext2;
        this.mImageName2 = mImageName2;
        this.mImages = mImages;
        this.mdescription = mdescription;
    }



    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout2,parent,false);
        CustomAdapter2.MyViewHolder2 holder = new CustomAdapter2.MyViewHolder2(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {

        holder.name2.setText(mImageName2.get(position));
        holder.description.setText(mdescription.get(position));
        Glide.with(mcontext2)
                .asBitmap()
                .load(mImages.get(position))
                .placeholder(R.drawable.img)
                .into(holder.image2);

    }

    @Override
    public int getItemCount() {
        return mImageName2.size();
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {

        CircleImageView image2;
        TextView name2,description;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);

            image2 = itemView.findViewById(R.id.img2);
            name2 = itemView.findViewById(R.id.img_name2);
            description = itemView.findViewById(R.id.img_descr);
        }
    }

}