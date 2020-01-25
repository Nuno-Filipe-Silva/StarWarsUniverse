package com.example.starwarsuniverse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SpeciesAdapter extends ArrayAdapter<Species> {

    public SpeciesAdapter(Context context, ArrayList<Species> speciesArrayList) {

        super(context, 0, speciesArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);

        }

        Species currentSpecies = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name);

        nameTextView.setText(currentSpecies.getName());


        TextView genderTextView = listItemView.findViewById(R.id.gender);

        genderTextView.setText(currentSpecies.getHomeworld());


        ImageView imageView = listItemView.findViewById(R.id.people_image_view);


        imageView.setImageResource(currentSpecies.getImageId());

        imageView.setVisibility(View.VISIBLE);

        return listItemView;

    }

}
