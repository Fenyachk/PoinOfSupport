package com.example.poinofsupport.database;

import com.example.poinofsupport.model.News;
import com.example.poinofsupport.model.Users;

import java.time.LocalDate;
import java.util.List;

public interface DatabaseConnection {
    void connect();

    void disconnect();

    void insert(News news);

    void update(News news);

    void delete(int newsId);

    List<News> getAllNews();

    List<News> getNewsById(int taskId);

    List<News> getNewsByDay(LocalDate date);

    void addUser(Users users);

    void updateUser(Users users);

    void deleteUser(int userId);

    List<Users> getAllUsers();

    List<Users> getUserById(int taskId);
}

