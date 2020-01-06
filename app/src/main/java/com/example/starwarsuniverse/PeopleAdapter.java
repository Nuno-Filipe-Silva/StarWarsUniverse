package com.example.starwarsuniverse;

import android.app.Activity;
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
import java.util.List;

public class PeopleAdapter extends ArrayAdapter<People> {


    public PeopleAdapter(Context context, ArrayList<People> peopleArrayList){

        super(context,0, peopleArrayList);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView ==null){

            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_layout, parent, false);

        }

        People currentPeople = getItem(position);


        TextView nameTextView = listItemView.findViewById(R.id.name);

        nameTextView.setText(currentPeople.getName());

        ImageView imageView = listItemView.findViewById(R.id.people_image_view);

        if(currentPeople.hasImage()){

            imageView.setImageResource(currentPeople.getImageId());

            imageView.setVisibility(View.VISIBLE);

        } else {

            imageView.setVisibility(View.GONE);

        }


        TextView genderTextView = listItemView.findViewById(R.id.gender);

        genderTextView.setText(currentPeople.getGender());


        return listItemView;

    }

}
