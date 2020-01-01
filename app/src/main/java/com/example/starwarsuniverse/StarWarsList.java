package com.example.starwarsuniverse;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class StarWarsList<T> implements Serializable {

    @SerializedName("count")
    public int mCount;

    @SerializedName("next")
    public String mNext;

    @SerializedName("previous")
    public String mPrevious;

    @SerializedName("results")
    public ArrayList<T> mResults;


    public StarWarsList(int count, String next, String previous, ArrayList<T> results) {

        this.mCount = count;

        this.mNext = next;

        this.mPrevious = previous;

        this.mResults = results;

    }


    public int getCount() {
        return mCount;
    }

    public void setCount(int count) {
        this.mCount = count;
    }

    public String getNext() {
        return mNext;
    }

    public void setNext(String next) {
        this.mNext = next;
    }

    public String getPrevious() {
        return mPrevious;
    }

    public void setPrevious(String previous) {
        this.mPrevious = previous;
    }

    public ArrayList<T> getResults() {
        return mResults;
    }

    public void setResults(ArrayList<T> results) {
        this.mResults = results;
    }

    public boolean hasMore() {
        return !TextUtils.isEmpty(mNext);
    }

}