package com.example.poinofsupport.model;

import android.os.Bundle;

import com.example.poinofsupport.BaseActivity;
import com.example.poinofsupport.R;

public class News extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_company);
        setToolbar();
    }
}
