package com.example.phonebook.data;

public class People {
    public String name;
    public String email;
    public String image;
    public String cellNumber;
    public  String address;

    public People(String name, String email, String image, String cellNumber, String address) {
        this.name = name;
        this.email = email;
        this.image = image;
        this.cellNumber = cellNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return image;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getAddress() {
        return address;
    }
}
