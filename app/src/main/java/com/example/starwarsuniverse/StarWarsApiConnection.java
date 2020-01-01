package com.example.starwarsuniverse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StarWarsApiConnection {

    @GET("people/")
    public Call<StarWarsList<People>> getAllPeople(@Query("page") int page);




}
