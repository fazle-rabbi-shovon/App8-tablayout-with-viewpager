package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private Toolbar myToolbar;
    private TabLayout tabLayout;
    private ViewPager myViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myToolbar = findViewById(R.id.myToolbar);
        tabLayout = findViewById(R.id.tabLayout);
        myViewPager = findViewById(R.id.myViewPager);

        setSupportActionBar(myToolbar);
        setupViewPager(myViewPager);

        tabLayout.setupWithViewPager(myViewPager);

    }

    private void setupViewPager(ViewPager viewPager){

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new ChatFragment(),"CHAT");
        viewPagerAdapter.addFragment(new StatusFragment(),"STATUS");
        viewPagerAdapter.addFragment(new CallFragment(),"CALL");

        viewPager.setAdapter(viewPagerAdapter);



    }
}
