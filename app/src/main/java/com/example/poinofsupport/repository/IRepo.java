package com.example.poinofsupport.repository;

import com.example.poinofsupport.model.News;
import com.example.poinofsupport.model.Users;

import java.time.LocalDate;
import java.util.List;

public interface IRepo {

    void insertTask(News news);

    void updateTask(News news);

    void deleteTask(int newsId);

    List<News> getAllNews();

    List<News> getNewsById(int newsId);

    List<News> getNewsByDay(LocalDate date);

    void addUser(Users users);

    void updateUser(Users users);

    void deleteUser(int userId);

    List<Users> getAllUsers();

    List<Users> getUserById(int taskId);
}

