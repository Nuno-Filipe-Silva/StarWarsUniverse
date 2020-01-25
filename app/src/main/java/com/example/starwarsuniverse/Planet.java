package com.example.starwarsuniverse;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Planet implements Serializable {


    @SerializedName("name")
    private String mName;

    @SerializedName("diameter")
    private String mDiameter;

    @SerializedName("rotation_period")
    private String mRotationPeriod;

    @SerializedName("orbital_period")
    private String mOrbitalPeriod;

    @SerializedName("gravity")
    private String mGravity;

    @SerializedName("population")
    private String mPopulation;

    @SerializedName("climate")
    private String mClimate;

    @SerializedName("terrain")
    private String mTerrain;

    @SerializedName("surface_water")
    private String mSurfaceWater;

    @SerializedName("residents")
    private ArrayList<String> mResidents;

    @SerializedName("url")
    private String mUrl;

    @SerializedName("created")
    private String mCreated;

    @SerializedName("edited")
    private String mEdited;



    public Planet(String name, String diameter, String rotationPeriod, String orbitalPeriod,
                  String gravity, String population, String climate, String terrain,
                  String surfaceWater, ArrayList<String> residents, String url,
                  String created, String edited) {
        this.mName = name;
        this.mDiameter = diameter;
        this.mRotationPeriod = rotationPeriod;
        this.mOrbitalPeriod = orbitalPeriod;
        this.mGravity = gravity;
        this.mPopulation = population;
        this.mClimate = climate;
        this.mTerrain = terrain;
        this.mSurfaceWater = surfaceWater;
        this.mResidents = residents;
        this.mUrl = url;
        this.mCreated = created;
        this.mEdited = edited;
    }


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDiameter() {
        return mDiameter;
    }

    public void setDiameter(String diameter) {
        this.mDiameter = diameter;
    }

    public String getRotationPeriod() {
        return mRotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.mRotationPeriod = rotationPeriod;
    }

    public String getOrbitalPeriod() {
        return mOrbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.mOrbitalPeriod = orbitalPeriod;
    }

    public String getGravity() {
        return mGravity;
    }

    public void setGravity(String gravity) {
        this.mGravity = gravity;
    }

    public String getPopulation() {
        return mPopulation;
    }

    public void setPopulation(String population) {
        this.mPopulation = population;
    }

    public String getClimate() {
        return mClimate;
    }

    public void setClimate(String climate) {
        this.mClimate = climate;
    }

    public String getTerrain() {
        return mTerrain;
    }

    public void setTerrain(String terrain) {
        this.mTerrain = terrain;
    }

    public String getSurfaceWater() {
        return mSurfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.mSurfaceWater = surfaceWater;
    }

    public ArrayList<String> getResidents() {
        return mResidents;
    }

    public void setResidents(ArrayList<String> residents) {
        this.mResidents = residents;
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

    public int getImageId(){

        String mName1 = mName;

        if(mName1.equalsIgnoreCase("endor")){

            int img1 = R.drawable.endor;

            return img1;

        } else {

            int img1 = R.drawable.ic_launcher_background;

            return img1;

        }

    }

}
