package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aspun_000 on 8/17/2016.
 */
public class TransportActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.item_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction> ();

        attractions.add(new Attraction(getString(R.string.transport_airport_name),
                getString(R.string.transport_airport_address), R.drawable.delhi_airport));
        attractions.add(new Attraction(getString(R.string.transport_railway_name),
                getString(R.string.transport_railway_address), R.drawable.delhi_railway_station));
        attractions.add(new Attraction(getString(R.string.transport_bus_name),
                getString(R.string.transport_bus_address), R.drawable.isbt));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_transport);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);

    }

}
