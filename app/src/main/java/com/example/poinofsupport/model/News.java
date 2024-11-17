package com.example.poinofsupport.model;

public class News {
    private String date;
    private String author;
    private String title;
    private String content;

    public News(String date, String author, String title, String content) {
        this.date = date;
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
