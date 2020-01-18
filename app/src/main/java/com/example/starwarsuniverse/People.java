package com.example.starwarsuniverse;

import android.graphics.drawable.Drawable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import retrofit2.http.GET;

public class People implements Serializable {

@SerializedName("name")
    private String mName;


@SerializedName("height")
    private String mHeight;


@SerializedName("mass")
    private String mMass;

@SerializedName("hair_color")
    private String mHairColor;

@SerializedName("skin_color")
    private String mSkinColor;


@SerializedName("eye_color")
    private String mEyeColor;


@SerializedName("birth_year")
    private String mBirthYear;


@SerializedName("gender")
    private String mGender;


@SerializedName("homeworld")
    private String mHomeworld;


@SerializedName("films")
    private ArrayList<String> mFilms;


@SerializedName("species")
    private ArrayList<String> mSpeciesArrayList;

@SerializedName("vehicles")
    private ArrayList<String> mVehiclesArrayList;

@SerializedName("starships")
    private ArrayList<String> mStarshipsArrayList;


@SerializedName("created")
    private String mCreated;


@SerializedName("edited")
    private String mEdited;


@SerializedName("url")
    private String mUrl;


    private static final int NO_IMAGE_PROVIDED = -1;

    private int mImageId = NO_IMAGE_PROVIDED;


    public People(String name, String height, String mass, String hairColor, String skinColor,
                  String eyeColor, String birthYear, String gender, String homeworld,
                  ArrayList<String> films, ArrayList<String> speciesArrayList,
                  ArrayList<String> vehiclesArrayList, ArrayList<String> starshipsArrayList,
                  String created, String edited, String url) {

        
        this.mName = name;
        this.mHeight = height;
        this.mMass = mass;
        this.mHairColor = hairColor;
        this.mSkinColor = skinColor;
        this.mEyeColor = eyeColor;
        this.mBirthYear = birthYear;
        this.mGender = gender;
        this.mHomeworld = homeworld;
        this.mFilms = films;
        this.mSpeciesArrayList = speciesArrayList;
        this.mVehiclesArrayList = vehiclesArrayList;
        this.mStarshipsArrayList = starshipsArrayList;
        this.mCreated = created;
        this.mEdited = edited;
        this.mUrl = url;
    }


    public People(String name, String height, String mass, String hairColor, String skinColor,
                  String eyeColor, String birthYear, String gender, String homeworld,
                  ArrayList<String> films, ArrayList<String> speciesArrayList,
                  ArrayList<String> vehiclesArrayList, ArrayList<String> starshipsArrayList,
                  String created, String edited, String url, int imageId) {


        this.mName = name;
        this.mHeight = height;
        this.mMass = mass;
        this.mHairColor = hairColor;
        this.mSkinColor = skinColor;
        this.mEyeColor = eyeColor;
        this.mBirthYear = birthYear;
        this.mGender = gender;
        this.mHomeworld = homeworld;
        this.mFilms = films;
        this.mSpeciesArrayList = speciesArrayList;
        this.mVehiclesArrayList = vehiclesArrayList;
        this.mStarshipsArrayList = starshipsArrayList;
        this.mCreated = created;
        this.mEdited = edited;
        this.mUrl = url;
        this.mImageId = imageId;

    }



    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getHeight() {
        return mHeight;
    }

    public void setHeight(String height) {
        this.mHeight = height;
    }

    public String getMass() {
        return mMass;
    }

    public void setMass(String mass) {
        this.mMass = mass;
    }

    public String getHairColor() {
        return mHairColor;
    }

    public void setHairColor(String hairColor) {
        this.mHairColor = hairColor;
    }

    public String getSkinColor() {
        return mSkinColor;
    }

    public void setSkinColor(String skinColor) {
        this.mSkinColor = skinColor;
    }

    public String getEyeColor() {
        return mEyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.mEyeColor = eyeColor;
    }

    public String getBirthYear() {
        return mBirthYear;
    }

    public void setBirthYear(String birthYear) {
        this.mBirthYear = birthYear;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        this.mGender = gender;
    }

    public String getHomeworld() {
        return mHomeworld;
    }

    public void setHomeworld(String homeworld) {
        this.mHomeworld = homeworld;
    }

    public ArrayList<String> getFilms() {
        return mFilms;
    }

    public void setFilms(ArrayList<String> films) {
        this.mFilms = films;
    }

    public ArrayList<String> getSpeciesArrayList() {
        return mSpeciesArrayList;
    }

    public void setSpeciesArrayList(ArrayList<String> speciesArrayList) {
        this.mSpeciesArrayList = speciesArrayList;
    }

    public ArrayList<String> getVehiclesArrayList() {
        return mVehiclesArrayList;
    }

    public void setVehiclesArrayList(ArrayList<String> vehiclesArrayList) {
        this.mVehiclesArrayList = vehiclesArrayList;
    }

    public ArrayList<String> getStarshipsArrayList() {
        return mStarshipsArrayList;
    }

    public void setmStarshipsArrayList(ArrayList<String> starshipsArrayList) {
        this.mStarshipsArrayList = starshipsArrayList;
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

    public void setmEdited(String edited) {
        this.mEdited = edited;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setmUrl(String url) {
        this.mUrl = url;
    }

    public int getImageId() {

        String mName1 = mName;


            if(mName1.equalsIgnoreCase("luke skywalker")){

                int img1 = R.drawable.lukeskywalker;

                return img1;

            } else if (mName1.equalsIgnoreCase("c-3po")){

                int img1 = R.drawable.c3po;

                return img1;

            }

            else if (mName1.equalsIgnoreCase("lando calrissian")) {

                int img1 = R.drawable.lando;

                return img1;

            }

            else if (mName1.equalsIgnoreCase("dooku")){

                    int img1 = R.drawable.countdooku;

                    return img1;



            }

            else if (mName1.equalsIgnoreCase("jar jar binks")){

                int img1 = R.drawable.jarjarbinks;

                return img1;

            }

            else if (mName1.equalsIgnoreCase("bail prestor organa")){

                int img1 = R.drawable.bailorgana;

                return img1;

            }

            else if (mName1.equalsIgnoreCase("darth vader")){

                int img1 = R.drawable.vader;

                return img1;

            }


            else if (mName1.equalsIgnoreCase("darth maul")){

                int img1 = R.drawable.darthmaul;

                return img1;

            }

            else if (mName1.equalsIgnoreCase("r2-d2")){

                int img1 = R.drawable.r2d2;

                return img1;

            }

            else if (mName1.equalsIgnoreCase("anakin skywalker")){

                int img1 = R.drawable.anakin;

                return img1;

            }



            else {

                int img1 = R.drawable.ic_launcher_background;

                return img1;

            }

        }

    }



