package com.gillie.foodstock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gillie.foodstock.model.GroceryAdapter;
import com.gillie.foodstock.model.GroceryItem;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.EntypoModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.joanzapata.iconify.fonts.IoniconsModule;
import com.joanzapata.iconify.fonts.MaterialCommunityModule;
import com.joanzapata.iconify.fonts.MaterialModule;
import com.joanzapata.iconify.fonts.MeteoconsModule;
import com.joanzapata.iconify.fonts.SimpleLineIconsModule;
import com.joanzapata.iconify.fonts.TypiconsModule;
import com.joanzapata.iconify.fonts.WeathericonsModule;

import java.util.ArrayList;

import de.nitri.slidingtoggleswitch.SlidingToggleSwitchView;

public class MainActivity extends AppCompatActivity implements SlidingToggleSwitchView.OnToggleListener {


    private RecyclerView mGroceryView;
    private GroceryAdapter mGroceryAdapter;
    private ArrayList<GroceryItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Iconify
                .with(new FontAwesomeModule())
                .with(new EntypoModule())
                .with(new TypiconsModule())
                .with(new MaterialModule())
                .with(new MaterialCommunityModule())
                .with(new MeteoconsModule())
                .with(new WeathericonsModule())
                .with(new SimpleLineIconsModule())
                .with(new IoniconsModule());

        items = new ArrayList<>();
        items.add(new GroceryItem("test"));


        mGroceryView = (RecyclerView)findViewById(R.id.groceryRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mGroceryView.setLayoutManager(layoutManager);
        mGroceryAdapter = new GroceryAdapter(items);
        mGroceryView.setAdapter(mGroceryAdapter);

    }

    @Override
    public void onToggle(int result) {
        if (result == SlidingToggleSwitchView.LEFT_SELECTED) {


        } else {
        }
        //...

    }
}
