package com.example.poinofsupport.ui.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.poinofsupport.R;
import com.example.poinofsupport.base.ui.BaseFragment;
import com.example.poinofsupport.databinding.RegistrationFormFragmentBinding;

public class RegistrationFragment extends BaseFragment<RegistrationFormFragmentBinding> {
    public RegistrationFragment() {
        super(R.layout.registration_form_fragment);
    }

    @Override
    public RegistrationFormFragmentBinding getBinding(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        return RegistrationFormFragmentBinding.inflate(inflater, container, false);
    }
}
