package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mainPage extends AppCompatActivity {

    ImageButton destination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        destination = (ImageButton) findViewById(R.id.imageButton4);
        destination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(mainPage.this, PickDestination.class);
                startActivity(changePage);
            }
        });
    }
}