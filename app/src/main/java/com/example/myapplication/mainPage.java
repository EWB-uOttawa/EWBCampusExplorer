package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mainPage extends AppCompatActivity {

    ImageButton destination;
    ImageButton building;
    ImageButton favourites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        building = (ImageButton) findViewById(R.id.imageButton3);
        destination = (ImageButton) findViewById(R.id.imageButton4);
        favourites = (ImageButton) findViewById(R.id.imageButton5);
        building.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(mainPage.this, chooseBuilding.class);
                startActivity(changePage);
            }
        });
        destination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(mainPage.this, PickDestination.class);
                startActivity(changePage);
            }
        });
        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(mainPage.this, favouritesPage.class);
                startActivity(changePage);
            }
        });
    }
}