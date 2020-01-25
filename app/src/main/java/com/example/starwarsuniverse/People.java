package com.example.starwarsuniverse;

import android.graphics.drawable.Drawable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import retrofit2.http.GET;

public class People implements Serializable {

    private static final int NO_IMAGE_PROVIDED = -1;
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


        if (mName1.equalsIgnoreCase("luke skywalker")) {

            int img1 = R.drawable.lukeskywalker;

            return img1;

        } else if (mName1.equalsIgnoreCase("ayla secura")) {

            int img1 = R.drawable.aaylasecura;

            return img1;

        } else if (mName1.equalsIgnoreCase("c-3po")) {

            int img1 = R.drawable.c3po;

            return img1;

        } else if (mName1.equalsIgnoreCase("lando calrissian")) {

            int img1 = R.drawable.lando;

            return img1;

        } else if (mName1.equalsIgnoreCase("dooku")) {

            int img1 = R.drawable.countdooku;

            return img1;


        } else if (mName1.equalsIgnoreCase("jar jar binks")) {

            int img1 = R.drawable.jarjarbinks;

            return img1;

        } else if (mName1.equalsIgnoreCase("bail prestor organa")) {

            int img1 = R.drawable.bailorgana;

            return img1;

        } else if (mName1.equalsIgnoreCase("darth vader")) {

            int img1 = R.drawable.vader;

            return img1;

        } else if (mName1.equalsIgnoreCase("darth maul")) {

            int img1 = R.drawable.darthmaul;

            return img1;

        } else if (mName1.equalsIgnoreCase("r2-d2")) {

            int img1 = R.drawable.r2d2;

            return img1;

        } else if (mName1.equalsIgnoreCase("ackbar")) {

            int img1 = R.drawable.ackbar;

            return img1;

        } else if (mName1.equalsIgnoreCase("anakin skywalker")) {

            int img1 = R.drawable.anakin;

            return img1;

        } else if (mName1.equalsIgnoreCase("palpatine")) {

            int img1 = R.drawable.palpatine;

            return img1;

        } else if (mName1.equalsIgnoreCase("chewbacca")) {

            int img1 = R.drawable.chewbacca;

            return img1;

        } else if (mName1.equalsIgnoreCase("greedo")) {

            int img1 = R.drawable.greedo;

            return img1;

        } else if (mName1.equalsIgnoreCase("grievous")) {

            int img1 = R.drawable.grievous;

            return img1;

        } else if (mName1.equalsIgnoreCase("leia organa")) {

            int img1 = R.drawable.leiaorgana;

            return img1;

        } else if (mName1.equalsIgnoreCase("mace windu")) {

            int img1 = R.drawable.macewindu;

            return img1;

        } else if (mName1.equalsIgnoreCase("nute gunray")) {

            int img1 = R.drawable.nategunray;

            return img1;

        } else if (mName1.equalsIgnoreCase("obi wan kenobi")) {

            int img1 = R.drawable.obiwan;

            return img1;

        } else if (mName1.equalsIgnoreCase("sebulba")) {

            int img1 = R.drawable.sebulba;

            return img1;

        } else if (mName1.equalsIgnoreCase("watto")) {

            int img1 = R.drawable.watto;

            return img1;

        } else if (mName1.equalsIgnoreCase("wicket w. warrick")) {

            int img1 = R.drawable.wicketwwarrick;

            return img1;

        } else if (mName1.equalsIgnoreCase("wilhuff tarkin")) {

            int img1 = R.drawable.wilhufftarkin;

            return img1;

        } else if (mName1.equalsIgnoreCase("yoda")) {

            int img1 = R.drawable.yoda;

            return img1;

        } else if (mName1.equalsIgnoreCase("boba fett")) {

            int img1 = R.drawable.bobafett;

            return img1;

        } else if (mName1.equalsIgnoreCase("han solo")) {

            int img1 = R.drawable.hansolo;

            return img1;

        } else if (mName1.equalsIgnoreCase("general tarpals")) {

            int img1 = R.drawable.generaltarpals;

            return img1;

        } else if (mName1.equalsIgnoreCase("qui-gon jinn")) {

            int img1 = R.drawable.quigonjinn;

            return img1;

        } else if (mName1.equalsIgnoreCase("bib fortuna")) {

            int img1 = R.drawable.bibfortuna;

            return img1;

        } else if (mName1.equalsIgnoreCase("bb8")) {

            int img1 = R.drawable.bb8;

            return img1;

        } else if (mName1.equalsIgnoreCase("poe dameron")) {

            int img1 = R.drawable.poedameron;

            return img1;

        } else if (mName1.equalsIgnoreCase("rey")) {

            int img1 = R.drawable.rey;

            return img1;

        } else if (mName1.equalsIgnoreCase("kylo ren")) {

            int img1 = R.drawable.kyloren;

            return img1;

        } else if (mName1.equalsIgnoreCase("finn")) {

            int img1 = R.drawable.finn;

            return img1;

        } else if (mName1.equalsIgnoreCase("padmé amidala")) {

            int img1 = R.drawable.padmeamidala;

            return img1;

        } else if (mName1.equalsIgnoreCase("owen lars")) {

            int img1 = R.drawable.owenlars;

            return img1;

        } else if (mName1.equalsIgnoreCase("beru whitesun lars")) {

            int img1 = R.drawable.beruwhitesunlars;

            return img1;

        } else if (mName1.equalsIgnoreCase("r5d4")) {

            int img1 = R.drawable.r5d4;

            return img1;

        } else if (mName1.equalsIgnoreCase("biggs darklighter")) {

            int img1 = R.drawable.biggsdarklighter;

            return img1;

        } else if (mName1.equalsIgnoreCase("wedge antilles")) {

            int img1 = R.drawable.wedgeantilles;

            return img1;

        } else if (mName1.equalsIgnoreCase("jek tono porkins")) {

            int img1 = R.drawable.jektonoporkins;

            return img1;

        } else if (mName1.equalsIgnoreCase("ig-88")) {

            int img1 = R.drawable.ig88;

            return img1;

        } else if (mName1.equalsIgnoreCase("bossk")) {

            int img1 = R.drawable.bossk;

            return img1;

        } else if (mName1.equalsIgnoreCase("lobot")) {

            int img1 = R.drawable.lobot;

            return img1;

        } else if (mName1.equalsIgnoreCase("niennunb")) {

            int img1 = R.drawable.niennunb;

            return img1;

        } else if (mName1.equalsIgnoreCase("Finis Valorum")) {

            int img1 = R.drawable.finisvalorum;

            return img1;

        } else if (mName1.equalsIgnoreCase("Adi Gallia")) {

            int img1 = R.drawable.adigallia;

            return img1;

        } else if (mName1.equalsIgnoreCase("Barriss Offee")) {

            int img1 = R.drawable.barrissoffee;

            return img1;

        } else if (mName1.equalsIgnoreCase("Captain Phasma")) {

            int img1 = R.drawable.captainphasma;

            return img1;

        } else if (mName1.equalsIgnoreCase("Cliegg Lars")) {

            int img1 = R.drawable.cliegglars;

            return img1;

        } else if (mName1.equalsIgnoreCase("Cordé")) {

            int img1 = R.drawable.corde;

            return img1;

        } else if (mName1.equalsIgnoreCase("Dexter Jettster")) {

            int img1 = R.drawable.dexterjettster;

            return img1;

        } else if (mName1.equalsIgnoreCase("Dormé")) {

            int img1 = R.drawable.dorme;

            return img1;

        } else if (mName1.equalsIgnoreCase("Dud Bolt")) {

            int img1 = R.drawable.dudbolt;

            return img1;

        } else if (mName1.equalsIgnoreCase("Eeth Koth")) {

            int img1 = R.drawable.eethkoth;

            return img1;

        } else if (mName1.equalsIgnoreCase("Gregar Typho")) {

            int img1 = R.drawable.gregartypho;

            return img1;

        } else if (mName1.equalsIgnoreCase("Jocasta Nu")) {

            int img1 = R.drawable.jocastanu;

            return img1;

        } else if (mName1.equalsIgnoreCase("Lama Su")) {

            int img1 = R.drawable.lamasu;

            return img1;

        } else if (mName1.equalsIgnoreCase("Luminara Unduli")) {

            int img1 = R.drawable.luminaraunduli;

            return img1;

        } else if (mName1.equalsIgnoreCase("Mas Amedda")) {

            int img1 = R.drawable.masamedda;

            return img1;

        } else if (mName1.equalsIgnoreCase("Plo Koon")) {

            int img1 = R.drawable.plokoon;

            return img1;

        } else if (mName1.equalsIgnoreCase("Poggle the Lesser")) {

            int img1 = R.drawable.pogglethelesser;

            return img1;

        } else if (mName1.equalsIgnoreCase("R4-P17")) {

            int img1 = R.drawable.r4p17;

            return img1;

        } else if (mName1.equalsIgnoreCase("Ratts Tyerell")) {

            int img1 = R.drawable.rattstyerell;

            return img1;

        } else if (mName1.equalsIgnoreCase("Raymus Antilles")) {

            int img1 = R.drawable.raymusantilles;

            return img1;

        } else if (mName1.equalsIgnoreCase("Roos Tarpals")) {

            int img1 = R.drawable.roostarpals;

            return img1;

        } else if (mName1.equalsIgnoreCase("Saesee Tiin")) {

            int img1 = R.drawable.saeseetiin;

            return img1;

        } else if (mName1.equalsIgnoreCase("San Hill")) {

            int img1 = R.drawable.sanhill;

            return img1;

        } else if (mName1.equalsIgnoreCase("Shaak Ti")) {

            int img1 = R.drawable.shaakti;

            return img1;

        } else if (mName1.equalsIgnoreCase("Shmi Skywalker")) {

            int img1 = R.drawable.shmiskywalker;

            return img1;

        } else if (mName1.equalsIgnoreCase("Sly Moore")) {

            int img1 = R.drawable.slymoore;

            return img1;

        } else if (mName1.equalsIgnoreCase("Tarfful")) {

            int img1 = R.drawable.tarfful;

            return img1;

        } else if (mName1.equalsIgnoreCase("Taun We")) {

            int img1 = R.drawable.taunwe;

            return img1;

        } else if (mName1.equalsIgnoreCase("Tion Medon")) {

            int img1 = R.drawable.tionmedon;

            return img1;

        } else if (mName1.equalsIgnoreCase("Wat Tambor")) {

            int img1 = R.drawable.wattambor;

            return img1;

        } else if (mName1.equalsIgnoreCase("Yarael Poof")) {

            int img1 = R.drawable.yaraelpoof;

            return img1;

        } else if (mName1.equalsIgnoreCase("Zam Wesell")) {

            int img1 = R.drawable.zamwesell;

            return img1;

        } else {

            int img1 = R.drawable.ic_launcher_background;

            return img1;

        }

    }

}




