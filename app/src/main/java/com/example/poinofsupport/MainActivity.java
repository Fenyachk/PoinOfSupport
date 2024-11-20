package com.example.poinofsupport;

import android.os.Bundle;
import android.widget.Button;

import com.example.poinofsupport.ui.screens.LoginFragment;
import com.example.poinofsupport.ui.screens.MainFragment;

public class MainActivity extends BaseFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();

        if (savedInstanceState == null) {
            setContainer();
            setListenerVolunteerButton();
        }
    }

    private void setContainer() {
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.container, MainFragment.class, null)
                .commit();
    }
}