package com.example.dto;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class LearnResource {
    private long id;
    private String author;
    private String title;
    private String url;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LearnResource(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}