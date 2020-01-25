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
public class SpeciesFragment extends Fragment {

    final ArrayList<Species> mSpeciesArrayList = new ArrayList<>();

    ListView listView;

    public SpeciesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_layout, container, false);

        for (int i = 1; i < 3; i++) {

            Call<StarWarsList<Species>> starWarsSpeciesListCall = new RetrofitConnection()
                    .starWarsApiConnection().getAllSpecies(i);


            starWarsSpeciesListCall.enqueue(new Callback<StarWarsList<Species>>() {
                @Override
                public void onResponse(Call<StarWarsList<Species>> call, Response<StarWarsList<Species>> response) {

                    StarWarsList<Species> speciesStarWarsListResponse = response.body();

                    for (int k = 0; k < speciesStarWarsListResponse.mResults.size(); k++) {

                        mSpeciesArrayList.add(speciesStarWarsListResponse.getResults().get(k));

                        final SpeciesAdapter speciesAdapter = new SpeciesAdapter(getActivity(), mSpeciesArrayList);

                        listView.setAdapter(speciesAdapter);


                    }

                }

                @Override
                public void onFailure(Call<StarWarsList<Species>> call, Throwable t) {

                }
            });


        }

        listView = rootView.findViewById(R.id.list);

        return rootView;

    }

}
