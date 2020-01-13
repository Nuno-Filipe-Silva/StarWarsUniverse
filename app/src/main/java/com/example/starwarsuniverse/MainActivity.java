package com.example.starwarsuniverse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);

        CategoryAdapter categoryAdapter =
                new CategoryAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs_categories);

        tabLayout.setupWithViewPager(viewPager);

    }
}
