package com.example.starwarsuniverse;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {


    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fragmentManager){

        super(fragmentManager);

        mContext = context;

    }


    @Override
    public Fragment getItem(int position) {

        if(position == 0){

            return new PeopleFragment();

        } else if(position == 1) {return new FilmsFragment();}

        else if(position == 2) {return new SpeciesFragment();}

        else if(position == 3) {return new PlanetFragment();}

        else {return new FilmsFragment();}
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0){

                return mContext.getString(R.string.category_people);

        } else if(position == 1){

            return mContext.getString(R.string.category_films);

        }else if(position == 2){

            return mContext.getString(R.string.category_species);

        } else if(position == 3){

            return mContext.getString(R.string.category_planets);

        } else {

            return mContext.getString(R.string.category_films);

        }

    }

    @Override
    public int getCount() {
        return 5;
    }
}
