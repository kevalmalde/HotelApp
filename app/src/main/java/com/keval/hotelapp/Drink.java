package com.keval.hotelapp;

/**
 * Created by keval on 4/11/15.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
        new Drink("Latte","A Couple of espresso shots  with steamed milk",R.drawable.latte),
        new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",R.drawable.cappuccino),
        new Drink("Filter", "Highest quality beans roasted and brewed fresh",R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return name;
    }
}
