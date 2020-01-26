package com.example.starwarsuniverse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StarWarsApiConnection {

    @GET("people/")
    public Call<StarWarsList<People>> getAllPeople(@Query("page") int page);

    @GET("films/")
    public Call<StarWarsList<Film>> getAllFilms(@Query("page")int page);

    @GET("species/")
    public Call<StarWarsList<Species>> getAllSpecies(@Query("page") int page);

    @GET("planets/")
    public Call<StarWarsList<Planet>> getAllPlanets (@Query("page") int page);

    @GET("starships/")
    public Call<StarWarsList<Starship>> getAllStarships(@Query("page") int page);


}
