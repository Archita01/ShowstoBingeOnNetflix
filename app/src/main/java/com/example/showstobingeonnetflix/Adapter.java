package com.example.showstobingeonnetflix;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Holder>{
    Context context;
    String[] ShowNameList;
    String[] DescriptionList;
    int[] images;

    public Adapter(Context context, String[] ShowNameList, String[] DescriptionList, int[] images)
    {
        this.context = context;
        this.ShowNameList = ShowNameList;
        this.DescriptionList = DescriptionList;
        this.images = images;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.row, null);
        Holder view = new Holder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.Title.setText(ShowNameList[position]);
        holder.Des.setText(DescriptionList[position]);
        holder.ImagView.setImageResource(images[position]);
        holder.relativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , MainActivity2.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ShowNameList.length;
    }
}
