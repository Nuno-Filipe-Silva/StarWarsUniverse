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
public class StarshipFragment extends Fragment {

    final ArrayList<Starship> mStarshipArrayList = new ArrayList<>();

    ListView listView;

    public StarshipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_layout, container, false);

        for(int i = 1; i < 3; i++){

            Call<StarWarsList<Starship>> starWarsStarshipListCall = new RetrofitConnection().starWarsApiConnection().getAllStarships(i);

            starWarsStarshipListCall.enqueue(new Callback<StarWarsList<Starship>>() {
                @Override
                public void onResponse(Call<StarWarsList<Starship>> call, Response<StarWarsList<Starship>> response) {

                    StarWarsList<Starship> starshipStarWarsListResponse = response.body();

                    for(int k = 0; k < starshipStarWarsListResponse.mResults.size(); k++){

                        mStarshipArrayList.add(starshipStarWarsListResponse.getResults().get(k));

                        final StarshipAdapter starshipAdapter = new StarshipAdapter(getActivity(), mStarshipArrayList);

                        listView.setAdapter(starshipAdapter);

                    }


                }

                @Override
                public void onFailure(Call<StarWarsList<Starship>> call, Throwable t) {

                }
            });

        }

        listView = rootView.findViewById(R.id.list);

        return rootView;

    }

}























