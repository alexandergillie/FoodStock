package com.gillie.foodstock.model;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by Alexander on 8/29/2017.
 */

public class GroceryItem {

    private String name;
    private Calendar beginningDate;
    private Calendar expirationDate;
    private int quantity;
    private int expirationDaysLeft;

    public GroceryItem(String name) {
        this.name = name;
    }

    public GroceryItem(String name, Calendar beginningDate, Calendar expirationDate, int quantity) {
        this.name = name;
        this.beginningDate = beginningDate;
        this.expirationDate = expirationDate;
        this.quantity = quantity;

        long duration = expirationDate.getTimeInMillis() - beginningDate.getTimeInMillis();
        expirationDaysLeft = (int) TimeUnit.MILLISECONDS.toDays(duration);
    }

    public GroceryItem(String name, Calendar beginningDate, int quantity, int expirationDaysLeft) {
        this.name = name;
        this.beginningDate = beginningDate;
        this.quantity = quantity;
        this.expirationDaysLeft = expirationDaysLeft;
    }

    public String getName() {
        return name;
    }

    public Calendar getBeginningDate() {
        return beginningDate;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExpirationDaysLeft() {
        return expirationDaysLeft;
    }
}
