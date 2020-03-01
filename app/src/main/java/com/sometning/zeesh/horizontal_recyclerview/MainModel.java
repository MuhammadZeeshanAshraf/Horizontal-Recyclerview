package com.sometning.zeesh.horizontal_recyclerview;

public class MainModel {
    Integer logo;
    String name;

    public MainModel(Integer logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public Integer getLogo() {
        return logo;
    }

    public void setLogo(Integer logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
