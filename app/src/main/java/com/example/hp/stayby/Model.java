package com.example.hp.stayby;

/**
 * Created by hp on 24/03/2019.
 */

public class Model {

    String name, address ;
    Integer rent ,image;




    Integer type;

    public Model(String name, String address, Integer rent, Integer type, Integer image) {
        this.name = name;
        this.address = address;
        this.rent = rent;
        this.type = type;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}

