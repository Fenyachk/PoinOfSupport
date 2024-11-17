package com.example.poinofsupport.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {


    private final MutableLiveData<List<News>> news = new MutableLiveData<>(new ArrayList<>());
    public LiveData<List<News>> getUiState() {
        return news;
    }

    public void getNews() {

        List<News> newsList = new ArrayList<>();

        newsList.add(
                new News("01.01.2024", "Автор 1", "Заголовок 1", "Текст новости 1")
        );
        newsList.add(
                new News("02.01.2024", "Автор 2", "Заголовок 2", "Текст новости 2")
        );

        news.setValue(newsList);
    }

}
