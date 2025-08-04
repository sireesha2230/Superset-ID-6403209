package com.cognizant.spring_learn;

public class Country {
    private String name;
    private String code;

    public Country() {}

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Getters and Setters


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
