package com.example.starwarsuniverse;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class PeopleFragment extends Fragment {


    final ArrayList<People> mPeopleArrayList = new ArrayList<>();

    ListView listView;

    public PeopleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_layout, container, false);



        for(int i = 1; i < 10; i++){

            Call<StarWarsList<People>> starWarsPeopleListCall = new RetrofitConnection()
                    .starWarsApiConnection().getAllPeople(i);


            starWarsPeopleListCall.enqueue(new Callback<StarWarsList<People>>() {
                @Override
                public void onResponse(Call<StarWarsList<People>> call, Response<StarWarsList<People>> response) {

                    StarWarsList<People> starWarsPeopleListResponse = response.body();

                    for(int k = 0; k < 5; k++){

                        mPeopleArrayList.add(starWarsPeopleListResponse.getResults().get(k));

                    }

                    final PeopleAdapter peopleAdapter = new PeopleAdapter(getActivity(), mPeopleArrayList);

                    listView.setAdapter(peopleAdapter);


                }

                @Override
                public void onFailure(Call<StarWarsList<People>> call, Throwable t) {

                }

            });


        }

        listView = rootView.findViewById(R.id.list);

        return rootView;

    }

}
