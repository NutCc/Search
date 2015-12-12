package com.example.c.search;

/**
 * Created by c on 2015/12/12.
 */
public class Card {
    private String name;
    private double money;
    private String time;
    private String sex;

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public String getTime() {
        return time;
    }

    public String getSex() {
        return sex;
    }

    public Card(String name, double money, String time, String sex) {
        this.name = name;
        this.money = money;
        this.time = time;
        this.sex = sex;
    }

}

