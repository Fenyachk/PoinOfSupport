package com.example.poinofsupport;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.poinofsupport.model.News;
import com.example.poinofsupport.utils.NewsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<News> newsList = new ArrayList<>();
        newsList.add(new News("01.01.2024", "Автор 1", "Заголовок 1", "Текст новости 1"));
        newsList.add(new News("02.01.2024", "Автор 2", "Заголовок 2", "Текст новости 2"));

        NewsAdapter adapter = new NewsAdapter(newsList);
        recyclerView.setAdapter(adapter);
    }
}