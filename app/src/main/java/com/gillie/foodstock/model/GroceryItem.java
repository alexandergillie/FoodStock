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

    public GroceryItem(String name) {
        this.name = name;
    }

    public GroceryItem(String name, Calendar beginningDate, Calendar expirationDate, int quantity) {
        this.name = name;
        this.beginningDate = beginningDate;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
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

    public int getDaysLeft(){
        Calendar now = ClientModel.getInstance().getNow();
        return (int)(calendarDaysBetween(now, expirationDate));
    }

    public int getQuantity() {
        return quantity;
    }


    public static long calendarDaysBetween(Calendar startCal, Calendar endCal) {

        // Create copies so we don't update the original calendars.

        Calendar start = Calendar.getInstance();
        start.setTimeZone(startCal.getTimeZone());
        start.setTimeInMillis(startCal.getTimeInMillis());

        Calendar end = Calendar.getInstance();
        end.setTimeZone(endCal.getTimeZone());
        end.setTimeInMillis(endCal.getTimeInMillis());

        // Set the copies to be at midnight, but keep the day information.

        start.set(Calendar.HOUR_OF_DAY, 0);
        start.set(Calendar.MINUTE, 0);
        start.set(Calendar.SECOND, 0);
        start.set(Calendar.MILLISECOND, 0);

        end.set(Calendar.HOUR_OF_DAY, 0);
        end.set(Calendar.MINUTE, 0);
        end.set(Calendar.SECOND, 0);
        end.set(Calendar.MILLISECOND, 0);

        // At this point, each calendar is set to midnight on
        // their respective days. Now use TimeUnit.MILLISECONDS to
        // compute the number of full days between the two of them.

        return TimeUnit.MILLISECONDS.toDays(
                Math.abs(end.getTimeInMillis() - start.getTimeInMillis()));
    }
}
