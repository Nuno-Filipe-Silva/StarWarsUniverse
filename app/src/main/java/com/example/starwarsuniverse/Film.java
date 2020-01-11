package com.example.starwarsuniverse;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Film implements Serializable {

    @SerializedName("title")
    private String mTitle;

    @SerializedName("episode_id")
    private int mEpisodeId;

    @SerializedName("opening_crawl")
    private String mOpeningCrawl;

    @SerializedName("director")
    private String mDirector;

    @SerializedName("producer")
    private String mProducer;

    @SerializedName("release_date")
    private Date mReleaseDate;

    @SerializedName("species")
    private ArrayList<String>mSpecies;

    @SerializedName("vehicles")
    private ArrayList<String> mVehicles;

    @SerializedName("starships")
    private ArrayList<String> mStarships;

    @SerializedName("characters")
    private ArrayList<String> mCharacters;

    @SerializedName("planets")
    private ArrayList<String> mPlanets;

    @SerializedName("url")
    private String mUrl;

    @SerializedName("created")
    private String mCreated;

    @SerializedName("edited")
    private String mEdited;

    public Film(String title, int episodeId, String openingCrawl, String director,
                String producer, Date releaseDate, ArrayList<String> species,
                ArrayList<String> vehicles, ArrayList<String> starships,
                ArrayList<String> characters, ArrayList<String> planets,
                String url, String created, String edited) {

        this.mTitle = title;
        this.mEpisodeId = episodeId;
        this.mOpeningCrawl = openingCrawl;
        this.mDirector = director;
        this.mProducer = producer;
        this.mReleaseDate = releaseDate;
        this.mSpecies = species;
        this.mVehicles = vehicles;
        this.mStarships = starships;
        this.mCharacters = characters;
        this.mPlanets = planets;
        this.mUrl = url;
        this.mCreated = created;
        this.mEdited = edited;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public int getEpisodeId() {
        return mEpisodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.mEpisodeId = episodeId;
    }

    public String getOpeningCrawl() {
        return mOpeningCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        this.mOpeningCrawl = openingCrawl;
    }

    public String getDirector() {
        return mDirector;
    }

    public void setDirector(String director) {
        this.mDirector = director;
    }

    public String getProducer() {
        return mProducer;
    }

    public void setProducer(String producer) {
        this.mProducer = producer;
    }

    public Date getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.mReleaseDate = releaseDate;
    }

    public ArrayList<String> getSpecies() {
        return mSpecies;
    }

    public void setSpecies(ArrayList<String> species) {
        this.mSpecies = species;
    }

    public ArrayList<String> getVehicles() {
        return mVehicles;
    }

    public void setVehicles(ArrayList<String> vehicles) {
        this.mVehicles = vehicles;
    }

    public ArrayList<String> getStarships() {
        return mStarships;
    }

    public void setStarships(ArrayList<String> starships) {
        this.mStarships = starships;
    }

    public ArrayList<String> getCharacters() {
        return mCharacters;
    }

    public void setCharacters(ArrayList<String> characters) {
        this.mCharacters = characters;
    }

    public ArrayList<String> getPlanets() {
        return mPlanets;
    }

    public void setPlanets(ArrayList<String> planets) {
        this.mPlanets = planets;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public String getCreated() {
        return mCreated;
    }

    public void setCreated(String created) {
        this.mCreated = created;
    }

    public String getEdited() {
        return mEdited;
    }

    public void setEdited(String edited) {
        this.mEdited = edited;
    }

}
