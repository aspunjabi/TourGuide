package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the View that shows the transport category
        TextView transport = (TextView) findViewById(R.id.transport);

        // Set a click listener on that View
        transport.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the transport category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TransportActivity}
                Intent transportIntent = new Intent(MainActivity.this, TransportActivity.class);

                // Start the new activity
                startActivity(transportIntent);
            }
        });

        // Find the View that shows the landmarks category
        TextView landmarks = (TextView) findViewById(R.id.landmarks);

        // Set a click listener on that View
        landmarks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LandmarksActivity}
                Intent landmarksIntent = new Intent(MainActivity.this, LandmarksActivity.class);

                // Start the new activity
                startActivity(landmarksIntent);
            }
        });

        // Find the View that shows the religious category
        TextView religious = (TextView) findViewById(R.id.religious);

        // Set a click listener on that View
        religious.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ReligiousActivity}
                Intent religiousIntent = new Intent(MainActivity.this, ReligiousActivity.class);

                // Start the new activity
                startActivity(religiousIntent);
            }
        });

        // Find the View that shows the shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

    }
}

