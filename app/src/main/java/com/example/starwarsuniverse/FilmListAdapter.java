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


public class FilmListAdapter extends ArrayAdapter<Film> {

    public Context context;


    public FilmListAdapter(Context context, ArrayList<Film> filmArrayList) {

        super(context, 0, filmArrayList);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);

        }

        Film currentFilm = getItem(position);


        TextView nameTextView = listItemView.findViewById(R.id.name);

        nameTextView.setText(currentFilm.getTitle());

        TextView genderTextView = listItemView.findViewById(R.id.gender);

        genderTextView.setText(currentFilm.getReleaseDate().toString());


        ImageView imageView = listItemView.findViewById(R.id.people_image_view);

        imageView.setImageResource(currentFilm.getImageId());

        imageView.setVisibility(View.VISIBLE);


        /*String mDrawableName = "anewhope";


        currentFilm.getTitle().toString();
;
        String filName = film.getTitle();


        if(filName.contentEquals(mDrawableName)) {


            imageView.setImageResource((R.drawable.anewhope));

            imageView.setVisibility(View.VISIBLE);


        } else {

            imageView.setImageResource((R.drawable.ic_launcher_background));

            imageView.setVisibility(View.VISIBLE);


        }*/

        return listItemView;

    }

}