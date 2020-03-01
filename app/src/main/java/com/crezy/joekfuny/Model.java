package com.crezy.joekfuny;

public class Model {

    String name ,image, dos;

    public Model() {
    }

    public Model(String name, String image, String dos) {
        this.name = name;
        this.image = image;
        this.dos = dos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }
}
