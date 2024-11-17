package com.example.poinofsupport.repository;

import com.example.poinofsupport.database.FakeDatabase;
import com.example.poinofsupport.model.News;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class RepoImpl implements IRepo {

    private final FakeDatabase databaseConnector = new FakeDatabase();
    @Override
    public void insertTask(News news) {

    }

    @Override
    public void updateTask(News news) {

    }

    @Override
    public void deleteTask(int newsId) {

    }

    @Override
    public List<News> getAllNews() {
        return this.databaseConnector.getAllNews();
    }

    @Override
    public List<News> getNewsById(int newsId) {
        return this.databaseConnector.getNewsById(newsId);
    }

    @Override
    public List<News> getNewsByDay(LocalDate date) {
        return Collections.emptyList();
    }
}