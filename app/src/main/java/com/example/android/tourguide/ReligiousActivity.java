package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aspun_000 on 8/17/2016.
 */
public class ReligiousActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction> ();

        attractions.add(new Attraction(getString(R.string.religious_akshardham_name),
                getString(R.string.religious_akshardham_address), R.drawable.akshardham_temple));
        attractions.add(new Attraction(getString(R.string.religious_lotustemple_name),
                getString(R.string.religious_lotustemple_address), R.drawable.lotus_temple));
        attractions.add(new Attraction(getString(R.string.religious_jamamasjid_name),
                getString(R.string.religious_jamamasjid_address), R.drawable.jama_masjid));
        attractions.add(new Attraction(getString(R.string.religious_banglasahib_name),
                getString(R.string.religious_banglasahib_address), R.drawable.gurdwara_bangla_sahib));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_religious);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);


    }

}
