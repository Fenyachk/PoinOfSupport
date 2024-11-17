package com.example.poinofsupport;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.poinofsupport.model.News;
import com.example.poinofsupport.ui.screens.MainFragment;
import com.example.poinofsupport.utils.NewsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();

        if (savedInstanceState == null) {
            setContainer();
        }
    }

    private void setContainer() {
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.container, MainFragment.class, null)
                .commit();
    }
}