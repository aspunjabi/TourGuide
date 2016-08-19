package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aspun_000 on 8/17/2016.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public int mColorResourceId;

    public AttractionAdapter(Activity context, ArrayList<Attraction> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attraction_list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name
        TextView attractionName = (TextView) listItemView.findViewById(R.id.name);
        // Get the name of the attraction from the current attraction object and
        // set this text on the name attractionName
        attractionName.setText(currentAttraction.getName());

        // Find the TextView in the list_item.xml layout with the ID address
        TextView attractionAddress = (TextView) listItemView.findViewById(R.id.address);
        // Get the address from the current attractionAddress object and
        // set this text on the attractionAddress
        attractionAddress.setText(currentAttraction.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        iconView.setImageResource(currentAttraction.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
