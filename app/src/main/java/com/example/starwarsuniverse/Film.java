package com.example.starwarsuniverse;

import android.view.View;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.text.DateFormat;
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
    private ArrayList<String> mSpecies;

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

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mImageId;

    final String mANewHope = "A New Hope";

    final String mTheEmpireStrikesBack = "The Empire Strikes Back";

    final String mReturnOfTheJedi = "Return of the Jedi";

    final String mThePhantomMenace = "The Phantom Menace";

    final String mAttackOfTheClones = "Attack of the Clones";

    final String mRevengeoftheSith = "Revenge of the Sith";

    final String mTheForceAwakens= "The Force Awakens";

    final String mTheLastJedi = "The Last Jedi";


    public Film(String title, int episodeId, String openingCrawl, String director,
                String producer, Date releaseDate, ArrayList<String> species,
                ArrayList<String> vehicles, ArrayList<String> starships,
                ArrayList<String> characters, ArrayList<String> planets,
                String url, String created, String edited, int imageId) {

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
        this.mImageId = imageId;
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

        DateFormat.getDateInstance(DateFormat.LONG).format(releaseDate);



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


    public int getImageId() {

        String filmTitle = mTitle;





        switch (filmTitle){

            case mANewHope:

                int img = (R.drawable.anewhope);

                return img;


            case mTheEmpireStrikesBack:

                int img2 = (R.drawable.the_empire_strikes_back);

                return img2;


            case mReturnOfTheJedi:

                int img3 = (R.drawable.return_of_the_jedi);

                return img3;


            case mThePhantomMenace:

                int img4 = (R.drawable.the_phantom_menace);

                return img4;


            case mAttackOfTheClones:

                int img5 = (R.drawable.attack_of_the_clones);

                return img5;


            case mRevengeoftheSith:

                int img6 = (R.drawable.revenge_of_the_sith);

                return img6;

            case mTheForceAwakens:

                int img7 = (R.drawable.the_force_awakens);

                return img7;


            case mTheLastJedi:

                int img8 = (R.drawable.the_last_jedi);

                return img8;

                default:

                    int img9 = (R.drawable.ic_launcher_foreground);

                    return img9;


        }

    }

}