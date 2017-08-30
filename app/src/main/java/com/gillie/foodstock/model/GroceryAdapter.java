package com.gillie.foodstock.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gillie.foodstock.R;

import java.util.ArrayList;

/**
 * Created by Alexander on 8/29/2017.
 */

public class GroceryAdapter extends RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder> {
    private ArrayList<GroceryItem> mGroceries;

    public GroceryAdapter(ArrayList<GroceryItem> groceries){
        mGroceries = groceries;
    }

    @Override
    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new GroceryViewHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(GroceryViewHolder holder, int position) {
        GroceryItem currentItem = mGroceries.get(position);
        holder.name.setText(currentItem.getName());
    }

    @Override
    public int getItemCount() {
        return mGroceries.size();
    }

    public class GroceryViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView expirationDate;
        public GroceryViewHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.groceryitem, parent, false));

            name = (TextView)parent.findViewById(R.id.ItemName);
            expirationDate = (TextView)parent.findViewById(R.id.ExpirationDate);
        }
    }
}
