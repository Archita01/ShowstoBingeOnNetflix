package com.example.showstobingeonnetflix;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    ImageView ImagView;
    TextView Title,Des;
    RelativeLayout relativelayout;

    public Holder(@NonNull View itemView) {
        super(itemView);

        this.ImagView = itemView.findViewById(R.id.image);
        this.Title = itemView.findViewById(R.id.title);
        this.Des = itemView.findViewById(R.id.Description);
        relativelayout = itemView.findViewById(R.id.relative_layout);

    }
}
