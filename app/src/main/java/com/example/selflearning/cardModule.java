package com.example.selflearning;

public class cardModule {
    int image,id;
    String title,descripation;

    public cardModule(int image, int id, String title, String descripation) {
        this.image = image;
        this.id = id;
        this.title = title;
        this.descripation = descripation;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripation() {
        return descripation;
    }

    public void setDescripation(String descripation) {
        this.descripation = descripation;
    }
}
