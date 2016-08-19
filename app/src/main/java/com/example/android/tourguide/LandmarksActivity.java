package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aspun_000 on 8/17/2016.
 */
public class LandmarksActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction> ();

        attractions.add(new Attraction(getString(R.string.landmark_indiagate_name),
                getString(R.string.landmark_indiagate_address), R.drawable.india_gate));
        attractions.add(new Attraction(getString(R.string.landmark_redfort_name),
                getString(R.string.landmark_redfort_address), R.drawable.red_fort));
        attractions.add(new Attraction(getString(R.string.landmark_qutbminar_name),
                getString(R.string.landmark_qutbminar_address), R.drawable.qutb_minar));
        attractions.add(new Attraction(getString(R.string.landmark_lodigarden_name),
                getString(R.string.landmark_lodigarden_address), R.drawable.lodi_gardens));
        attractions.add(new Attraction(getString(R.string.landmark_rashtrapati_name),
                getString(R.string.landmark_rashtrapati_address), R.drawable.rashtrapati_bhavan));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_landmarks);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);

    }

}
