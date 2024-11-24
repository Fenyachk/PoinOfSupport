package com.example.poinofsupport.ui.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.poinofsupport.R;
import com.example.poinofsupport.base.ui.BaseFragment;
import com.example.poinofsupport.databinding.AboutFragmentBinding;

public class AboutFragment extends BaseFragment<AboutFragmentBinding> {

    public static final String TAG = "AboutFragment";

    public AboutFragment() {
        super(R.layout.about_fragment);
    }

    @Override
    public AboutFragmentBinding getBinding(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        return AboutFragmentBinding.inflate(inflater, container, false);
    }
}
