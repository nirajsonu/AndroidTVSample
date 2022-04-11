package com.example.androidtvsample;

import android.graphics.drawable.Drawable;

public class SingleRowView {
    String name="";
    String description="";
    Drawable image=null;


    public SingleRowView(String name, String description, Drawable image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
