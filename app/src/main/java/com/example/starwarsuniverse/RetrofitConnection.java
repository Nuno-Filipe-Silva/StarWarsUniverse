package com.example.starwarsuniverse;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConnection {


    public StarWarsApiConnection starWarsApiConnection(){

        String STAR_WARS_API_URL = "https://swapi.co/api/";


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(STAR_WARS_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(StarWarsApiConnection.class);

    }

}