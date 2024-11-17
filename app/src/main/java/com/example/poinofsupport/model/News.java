package com.example.poinofsupport.model;

import android.os.Build;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class News {
    private final int id;
    private String date;
    private String hour;
    private String minute;
    private String author;
    private String title;
    private String content;
    private static final String DATE_FORMAT = "%02d";
    private static final String TIME_FORMAT = "dd.MM.yyyy HH:mm";
    private static final int MAX_LENGTH = 170;

    public News(String date, String author, String title, String content) {
        this(0, date, author, title, content);
    }

    public News(int id, String date, String author, String title, String content) {
        this.id = id;
        this.date = date;
        this.author = author;
        this.title = title;
        this.content = content;
        setDateFormat(date);
    }

    public int getId() {
        return this.id;
    }

    public LocalDateTime getDate() {

        DateTimeFormatter formatter = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            formatter = DateTimeFormatter.ofPattern(TIME_FORMAT);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return LocalDateTime.parse(this.date, formatter);
        }
        return null;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescriptionContent() {
        if (content.length() > MAX_LENGTH) {
            return content.substring(0, MAX_LENGTH) + "...";
        }
        return content;
    }

    public String getContent() {
        return content;
    }
    public void setDateFormat(String date) {
        DateTimeFormatter formatter = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            formatter = DateTimeFormatter.ofPattern(TIME_FORMAT);
        }
        LocalDateTime dateTime = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            dateTime = LocalDateTime.parse(date, formatter);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            this.hour = String.format(DATE_FORMAT, dateTime.getHour());
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            this.minute = String.format(DATE_FORMAT, dateTime.getMinute());
        }
    }
}
