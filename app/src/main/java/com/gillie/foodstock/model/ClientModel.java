package com.gillie.foodstock.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by alexander on 4/1/18.
 */

public class ClientModel {

    public static ClientModel _instance;

    public static ClientModel getInstance(){
        if (_instance == null){
            _instance = new ClientModel();
        }

        return _instance;
    }


    private Calendar now;
    private List<GroceryItem> groceries;

    private ClientModel(){
        now = Calendar.getInstance();
        groceries = new ArrayList<GroceryItem>();
    }

    public Calendar getNow(){
        now = Calendar.getInstance();
        return now;
    }
}
