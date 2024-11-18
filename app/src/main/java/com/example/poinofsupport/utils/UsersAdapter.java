package com.example.poinofsupport.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.poinofsupport.R;
import com.example.poinofsupport.model.Users;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {

    private List<Users> usersList;

    public UsersAdapter(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_profile, parent, false);
        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        Users user = usersList.get(position);
        holder.userName.setText(user.getFullName());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView userName;

        public UserViewHolder(View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.user_name);
        }
    }
}
