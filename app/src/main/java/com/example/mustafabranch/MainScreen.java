package com.example.mustafabranch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainScreen extends AppCompatActivity {

    ImageButton destination;
    ImageButton search;
    ImageButton favourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        destination = (ImageButton) findViewById(R.id.imageButton4);
        destination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(MainScreen.this, PickDestination.class);
                startActivity(changePage);
            }
        });
        search = (ImageButton) findViewById(R.id.imageButton3);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(MainScreen.this, SearchActivity.class);
                startActivity(changePage);
            }
        });
        favourite = (ImageButton) findViewById(R.id.imageButton5);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(MainScreen.this, FavouritesPage.class);
                startActivity(changePage);
            }
        });
    }
}