package com.example.app_amanigharbi;


public class DataModel {

    int image;
    String name;
    int img;
    int id_;

    public DataModel(int image, String name, int img, int id_) {
        this.image = image;
        this.name = name;
        this.img = img;
        this.id_ = id_;

    }


    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}