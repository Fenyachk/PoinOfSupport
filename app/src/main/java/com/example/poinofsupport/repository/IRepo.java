package com.example.poinofsupport.repository;

import com.example.poinofsupport.model.News;

import java.time.LocalDate;
import java.util.List;

public interface IRepo {

    void insertTask(News news);

    void updateTask(News news);

    void deleteTask(int newsId);

    List<News> getAllNews();

    List<News> getNewsById(int newsId);

    List<News> getNewsByDay(LocalDate date);



}
