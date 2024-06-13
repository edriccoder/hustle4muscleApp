package com.example.hustle4muscle;

public class Exercise {
    private String name;
    private String description;
    private int gifResource;

    public Exercise(String name, String description, int gifResource) {
        this.name = name;
        this.description = description;
        this.gifResource = gifResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getGifResource() {
        return gifResource;
    }
}
