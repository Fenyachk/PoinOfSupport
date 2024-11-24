package com.example.poinofsupport.ui.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.poinofsupport.R;
import com.example.poinofsupport.base.ui.BaseFragment;
import com.example.poinofsupport.databinding.LoginFragmentBinding;

public class LoginFragment extends BaseFragment<LoginFragmentBinding> {
    public LoginFragment() {
        super(R.layout.login_fragment);
    }

    @Override
    public LoginFragmentBinding getBinding(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        return LoginFragmentBinding.inflate(inflater, container, false);
    }
}
