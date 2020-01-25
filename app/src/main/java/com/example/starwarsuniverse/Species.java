package com.example.starwarsuniverse;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Species implements Serializable {

    @SerializedName("name")
    private String mName;

    @SerializedName("classification")
    private String mClassification;

    @SerializedName("designation")
    private String mDesignation;

    @SerializedName("average_height")
    private String mAverageHeight;

    @SerializedName("average_lifespan")
    private String mAverageLifespan;

    @SerializedName("eye_colors")
    private String mEyeColors;

    @SerializedName("hair_colors")
    private String mHairColors;

    @SerializedName("skin_colors")
    private String mSkinColors;

    @SerializedName("homeworld")
    private String mHomeworld;

    @SerializedName("people")
    private ArrayList<String> mPeople;

    @SerializedName("films")
    private ArrayList<String> mFilms;

    public Species(String name, String classification, String designation, String averageHeight, String averageLifespan, String eyeColors,
                   String hairColors, String skinColors, String homeworld,
                   ArrayList<String> people, ArrayList<String> films) {

        this.mName = name;
        this.mClassification = classification;
        this.mDesignation = designation;
        this.mAverageHeight = averageHeight;
        this.mAverageLifespan = averageLifespan;
        this.mEyeColors = eyeColors;
        this.mHairColors = hairColors;
        this.mSkinColors = skinColors;
        this.mHomeworld = homeworld;
        this.mPeople = people;
        this.mFilms = films;
    }

    public String getAverageHeight() {
        return mAverageHeight;
    }

    public void setAverageHeight(String averageHeight) {
        this.mAverageHeight = averageHeight;
    }

    public String getAverageLifespan() {
        return mAverageLifespan;
    }

    public void setAverageLifespan(String averageLifespan) {
        this.mAverageLifespan = averageLifespan;
    }

    public String getEyeColors() {
        return mEyeColors;
    }

    public void setEyeColors(String eyeColors) {
        this.mEyeColors = eyeColors;
    }

    public String getHairColors() {
        return mHairColors;
    }

    public void setHairColors(String hairColors) {
        this.mHairColors = hairColors;
    }

    public String getSkinColors() {
        return mSkinColors;
    }

    public void setSkinColors(String skinColors) {
        this.mSkinColors = skinColors;
    }

    public String getHomeworld() {
        return mHomeworld;
    }

    public void setHomeworld(String homeworld) {
        this.mHomeworld = homeworld;
    }

    public ArrayList<String> getPeople() {
        return mPeople;
    }

    public void setPeople(ArrayList<String> people) {
        this.mPeople = people;
    }

    public ArrayList<String> getFilms() {
        return mFilms;
    }

    public void setFilms(ArrayList<String> films) {
        this.mFilms = films;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getClassification() {
        return mClassification;
    }

    public void setClassification(String classification) {
        this.mClassification = classification;
    }

    public String getDesignation() {
        return mDesignation;
    }

    public void setDesignation(String designation) {
        this.mDesignation = designation;
    }

    public int getImageId() {

        String mName1 = mName;

        if (mName1.equalsIgnoreCase("ewok")) {

            int img1 = R.drawable.ewoks;

            return img1;

        } else if (mName1.equalsIgnoreCase("hutt")) {

            int img1 = R.drawable.jabbathehutt;

            return img1;

        } else if (mName1.equalsIgnoreCase("Trandoshan")) {

            int img1 = R.drawable.trandoshan;

            return img1;

        } else if (mName1.equalsIgnoreCase("Mon Calamari")) {

            int img1 = R.drawable.moncalamari;

            return img1;

        } else if (mName1.equalsIgnoreCase("sullustan")) {

            int img1 = R.drawable.sullustan;

            return img1;

        } else if (mName1.equalsIgnoreCase("Neimoidian")) {

            int img1 = R.drawable.neimoidian;

            return img1;

        } else if (mName1.equalsIgnoreCase("gungan")) {

            int img1 = R.drawable.gungan;

            return img1;

        } else if (mName1.equalsIgnoreCase("toydarian")) {

            int img1 = R.drawable.toydarian;

            return img1;

        } else {

            int img1 = R.drawable.ic_launcher_background;

            return img1;

        }

    }


}

