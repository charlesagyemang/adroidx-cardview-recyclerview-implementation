package com.android.cardviewlearn.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.cardviewlearn.R;
import com.android.cardviewlearn.models.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;


    public class UserViewHolder extends RecyclerView.ViewHolder {

        public TextView titleText, numberOfItems;
        public LinearLayout linearLayout;
        public ImageView imageView;



        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.titleText);
            numberOfItems = itemView.findViewById(R.id.numberOfBed);
            linearLayout = itemView.findViewById(R.id.linLayout);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }


    public UserAdapter(List<User> userList){
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = LayoutInflater.from(parent.getContext())
                       .inflate(R.layout.card_item, parent, false);

       return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.titleText.setText(user.getTitle());
        holder.numberOfItems.setText(user.getNumber());
        holder.imageView.setImageDrawable(user.getIcon());
        holder.linearLayout.setBackground(user.getBg());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
