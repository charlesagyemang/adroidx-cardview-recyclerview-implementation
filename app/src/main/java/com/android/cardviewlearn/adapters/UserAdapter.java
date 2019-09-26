package com.android.cardviewlearn.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.cardviewlearn.R;
import com.android.cardviewlearn.models.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;

    public class UserViewHolder extends RecyclerView.ViewHolder {

        public TextView name;


        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.koko22);
        }
    }


    public UserAdapter(List<User> userList){
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = LayoutInflater.from(parent.getContext())
                       .inflate(R.layout.vel_nam, parent, false);

       return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.name.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
