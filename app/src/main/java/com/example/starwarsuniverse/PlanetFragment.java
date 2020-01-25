package com.example.starwarsuniverse;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlanetFragment extends Fragment {

    final ArrayList<Planet> mPlanetArrayList = new ArrayList<>();

    ListView listView;

    public PlanetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_layout, container, false);

        for(int i = 1; i < 3; i++){

            Call<StarWarsList<Planet>> starWarsPlanetListCall = new RetrofitConnection().starWarsApiConnection().getAllPlanets(i);

            starWarsPlanetListCall.enqueue(new Callback<StarWarsList<Planet>>() {
                @Override
                public void onResponse(Call<StarWarsList<Planet>> call, Response<StarWarsList<Planet>> response) {

                    StarWarsList<Planet> planetStarWarsListResponse = response.body();

                    for (int k = 0; k < planetStarWarsListResponse.mResults.size(); k++){

                        mPlanetArrayList.add(planetStarWarsListResponse.getResults().get(k));

                        final PlanetAdapter planetAdapter = new PlanetAdapter(getActivity(), mPlanetArrayList);

                        listView.setAdapter(planetAdapter);

                    }


                }

                @Override
                public void onFailure(Call<StarWarsList<Planet>> call, Throwable t) {

                }
            });

        }


        listView = rootView.findViewById(R.id.list);

        return rootView;

    }

}
