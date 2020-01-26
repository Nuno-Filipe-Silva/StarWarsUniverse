package com.example.starwarsuniverse;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehicle implements Serializable {


    @SerializedName("name")
    private String mName;

    @SerializedName("model")
    private String mModel;

    @SerializedName("vehicle_class")
    private String mVehicleClass;

    @SerializedName("manufacturer")
    private String mManufacturer;

    @SerializedName("length")
    private String mLength;

    @SerializedName("cost_in_credits")
    private String mCostInCredits;

    @SerializedName("crew")
    private String mCrew;

    @SerializedName("passengers")
    private String mPassengers;

    @SerializedName("max_atmosphering_speed")
    private String mMaxAtmospheringSpeed;

    @SerializedName("cargo_capacity")
    private String mCargoCapacity;

    @SerializedName("consumables")
    private String mConsumables;

    @SerializedName("pilots")
    private ArrayList<String> mPilots;

    @SerializedName("url")
    private String mUrl;

    @SerializedName("created")
    private String mCreated;

    @SerializedName("edited")
    private String mEdited;


    public Vehicle(String mName, String mModel, String mVehicleClass, String mManufacturer,
                   String mLength, String mCostInCredits, String mCrew, String mPassengers,
                   String mMaxAtmospheringSpeed, String mCargoCapacity, String mConsumables,
                   ArrayList<String> mPilots, String mUrl, String mCreated, String mEdited) {
        
        this.mName = mName;
        this.mModel = mModel;
        this.mVehicleClass = mVehicleClass;
        this.mManufacturer = mManufacturer;
        this.mLength = mLength;
        this.mCostInCredits = mCostInCredits;
        this.mCrew = mCrew;
        this.mPassengers = mPassengers;
        this.mMaxAtmospheringSpeed = mMaxAtmospheringSpeed;
        this.mCargoCapacity = mCargoCapacity;
        this.mConsumables = mConsumables;
        this.mPilots = mPilots;
        this.mUrl = mUrl;
        this.mCreated = mCreated;
        this.mEdited = mEdited;
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

    public String getVehicleClass() {
        return mVehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.mVehicleClass = vehicleClass;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.mManufacturer = manufacturer;
    }

    public String getLength() {
        return mLength;
    }

    public void setLength(String length) {
        this.mLength = length;
    }

    public String getCostInCredits() {
        return mCostInCredits;
    }

    public void setCostInCredits(String costInCredits) {
        this.mCostInCredits = costInCredits;
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
















