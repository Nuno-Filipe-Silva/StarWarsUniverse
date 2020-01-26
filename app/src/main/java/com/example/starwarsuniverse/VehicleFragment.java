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
public class VehicleFragment extends Fragment {


    final ArrayList<Vehicle> mVehicleArrayList = new ArrayList<>();

    ListView listView;

    public VehicleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_layout, container, false);

        for(int i = 1; i < 3; i++){

            final Call<StarWarsList<Vehicle>> starWarsVehicleListCall = new RetrofitConnection().starWarsApiConnection().getAllVehicles(i);

            starWarsVehicleListCall.enqueue(new Callback<StarWarsList<Vehicle>>() {
                @Override
                public void onResponse(Call<StarWarsList<Vehicle>> call, Response<StarWarsList<Vehicle>> response) {

                    StarWarsList<Vehicle> vehicleStarWarsListResponse = response.body();

                    for(int k = 0; k < vehicleStarWarsListResponse.mResults.size(); k++){

                       mVehicleArrayList.add(vehicleStarWarsListResponse.getResults().get(k));

                       final VehicleAdapter vehicleAdapter = new VehicleAdapter(getActivity(), mVehicleArrayList);

                       listView.setAdapter(vehicleAdapter);

                    }




                }

                @Override
                public void onFailure(Call<StarWarsList<Vehicle>> call, Throwable t) {

                }
            });


        }

        listView = rootView.findViewById(R.id.list);

        return rootView;



    }

}



















