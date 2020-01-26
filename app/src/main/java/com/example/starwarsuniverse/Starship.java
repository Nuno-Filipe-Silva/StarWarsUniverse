package com.example.starwarsuniverse;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Starship implements Serializable {

    @SerializedName("name")
    private String mName;

    @SerializedName("model")
    private String mModel;

    @SerializedName("starship_class")
    private String mStarshipClass;

    @SerializedName("manufacturer")
    private String mManufacturer;

    @SerializedName("cost_in_credits")
    private String mCostInCredits;

    @SerializedName("length")
    private String mLength;

    @SerializedName("crew")
    private String mCrew;


    @SerializedName("passengers")
    private String mPassengers;

    @SerializedName("max_atmosphering_speed")
    private String mMaxAtmospheringSpeed;

    @SerializedName("hyperdrive_rating")
    private String mHyperdriveRating;

    @SerializedName("MGLT")
    private String mMGLT;

    @SerializedName("cargo_capacity")
    private String mCargoCapacity;

    @SerializedName("consumables")
    private String mConsumables;

    @SerializedName("films")
    private ArrayList<String> mFilms;

    @SerializedName("pilots")
    private ArrayList<String> mPilots;

    @SerializedName("url")
    private String mUrl;

    @SerializedName("created")
    private String mCreated;

    @SerializedName("edited")
    private String mEdited;

    public Starship(String name, String model, String starshipClass, String manufacturer,
                    String costInCredits, String length, String crew, String passengers,
                    String maxAtmospheringSpeed, String hyperdriveRating,
                    String mGLT, String cargoCapacity, String consumables,
                    ArrayList<String> films, ArrayList<String> pilots, String url,
                    String created, String edited) {

        this.mName = name;
        this.mModel = model;
        this.mStarshipClass = starshipClass;
        this.mManufacturer = manufacturer;
        this.mCostInCredits = costInCredits;
        this.mLength = length;
        this.mCrew = crew;
        this.mPassengers = passengers;
        this.mMaxAtmospheringSpeed = maxAtmospheringSpeed;
        this.mHyperdriveRating = hyperdriveRating;
        this.mMGLT = mGLT;
        this.mCargoCapacity = cargoCapacity;
        this.mConsumables = consumables;
        this.mFilms = films;
        this.mPilots = pilots;
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

    public String getModel() {
        return mModel;
    }

    public void setModel(String model) {
        this.mModel = model;
    }

    public String getStarshipClass() {
        return mStarshipClass;
    }

    public void setStarshipClass(String starshipClass) {
        this.mStarshipClass = starshipClass;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.mManufacturer = manufacturer;
    }

    public String getCostInCredits() {
        return mCostInCredits;
    }

    public void setCostInCredits(String costInCredits) {
        this.mCostInCredits = costInCredits;
    }

    public String getLength() {
        return mLength;
    }

    public void setLength(String length) {
        this.mLength = length;
    }

    public String getCrew() {
        return mCrew;
    }

    public void setCrew(String crew) {
        this.mCrew = crew;
    }

    public String getPassengers() {
        return mPassengers;
    }

    public void setPassengers(String passengers) {
        this.mPassengers = passengers;
    }

    public String getMaxAtmospheringSpeed() {
        return mMaxAtmospheringSpeed;
    }

    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.mMaxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    public String getHyperdriveRating() {
        return mHyperdriveRating;
    }

    public void setHyperdriveRating(String hyperdriveRating) {
        this.mHyperdriveRating = hyperdriveRating;
    }

    public String getMGLT() {
        return mMGLT;
    }

    public void setMGLT(String mglt) {
        this.mMGLT = mglt;
    }

    public String getCargoCapacity() {
        return mCargoCapacity;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.mCargoCapacity = cargoCapacity;
    }

    public String getConsumables() {
        return mConsumables;
    }

    public void setConsumables(String consumables) {
        this.mConsumables = consumables;
    }

    public ArrayList<String> getFilms() {
        return mFilms;
    }

    public void setFilms(ArrayList<String> films) {
        this.mFilms = films;
    }

    public ArrayList<String> getPilots() {
        return mPilots;
    }

    public void setPilots(ArrayList<String> pilots) {
        this.mPilots = pilots;
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
