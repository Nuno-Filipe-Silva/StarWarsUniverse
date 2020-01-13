package com.example.starwarsuniverse;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FilmsFragment extends Fragment {

    final ArrayList<Film> mFilmArrayList = new ArrayList<>();

    ListView listView;




    public FilmsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ImageView listItemView = rootView.findViewById(R.id.people_image_view);

        for(int i = 1; i < 2; i++){

            Call<StarWarsList<Film>> starWarsListCall = new RetrofitConnection().starWarsApiConnection()
                                                        .getAllFilms(i);

            starWarsListCall.enqueue(new Callback<StarWarsList<Film>>() {
                @Override
                public void onResponse(Call<StarWarsList<Film>> call, Response<StarWarsList<Film>> response) {

                    StarWarsList<Film> filmsStarWarsList = response.body();

                    for(int k = 0; k < filmsStarWarsList.mResults.size();k++){

                        mFilmArrayList.add(filmsStarWarsList.getResults().get(k));


                        final FilmListAdapter filmListAdapter = new FilmListAdapter(getActivity(), mFilmArrayList);

                        listView.setAdapter(filmListAdapter);

                    }

                }

                @Override
                public void onFailure(Call<StarWarsList<Film>> call, Throwable t) {

                }

            });

        }

        listView = rootView.findViewById(R.id.list);

        return rootView;

    }

}