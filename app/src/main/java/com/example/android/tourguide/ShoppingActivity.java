package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aspun_000 on 8/17/2016.
 */
public class ShoppingActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction> ();

        attractions.add(new Attraction(getString(R.string.shopping_chandni_name),
                getString(R.string.shopping_chandni_address), R.drawable.chandni_chowk));
        attractions.add(new Attraction(getString(R.string.shopping_connaught_name),
                getString(R.string.shopping_connaught_address), R.drawable.connaught_place));
        attractions.add(new Attraction(getString(R.string.shopping_karolbagh_name),
                getString(R.string.shopping_karolbagh_address), R.drawable.karol_bagh));
        attractions.add(new Attraction(getString(R.string.shopping_dillihaat_name),
                getString(R.string.shopping_dillihaat_address), R.drawable.dilli_haat));
        attractions.add(new Attraction(getString(R.string.shopping_hkv_name),
                getString(R.string.shopping_hkv_address), R.drawable.hauz_khas_village));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_shopping);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);


    }

}
