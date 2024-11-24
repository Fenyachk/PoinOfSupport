package com.example.poinofsupport.ui.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.poinofsupport.R;
import com.example.poinofsupport.base.ui.BaseFragment;
import com.example.poinofsupport.databinding.UserProfileBinding;

public class UsersFragment extends BaseFragment<UserProfileBinding> {
    public UsersFragment() {
        super(R.layout.user_profile);
    }

    @Override
    public UserProfileBinding getBinding(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        return UserProfileBinding.inflate(inflater, container, false);
    }
}
