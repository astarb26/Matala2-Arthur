package com.example.matala2;

public class DataModel {
    String name;
    String version;
    String description2;
    int id_;
    int image;

    public DataModel(String name, String version ,String description2,int id_, int image) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image = image;
        this.description2 = description2;
    }


    public String getName() {
        return name;
    }

    public String getDescription2() {
        return description2;
    }

    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}
