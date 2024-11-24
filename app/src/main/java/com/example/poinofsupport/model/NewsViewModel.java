package com.example.poinofsupport.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.poinofsupport.repository.RepoImpl;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {


    private final MutableLiveData<List<News>> news = new MutableLiveData<>(new ArrayList<>());
    private static final RepoImpl repoImpl = new RepoImpl();
    public LiveData<List<News>> getUiState() {
        return news;
    }

    public void getNews() {

        List<News> newsList = repoImpl.getAllNews();
        news.setValue(newsList);
    }


    public void getNewsById(int newsId) {
        List<News> newsList = repoImpl.getNewsById(newsId);
        news.setValue(newsList);
    }

}
