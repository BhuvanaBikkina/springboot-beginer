package com.bhuvana.WebProject.model;

public class User {
    private int id;
    private String name, gender, image;

    public User() {
    }

    public User(String name, String gender, String image, int id) {
        this.gender = gender;
        this.name = name;
        this.image = image;
        this.id = id;
    }

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
