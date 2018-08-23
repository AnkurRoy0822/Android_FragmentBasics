package com.example.jhumpi.fragments;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new myAdapter(fm));

    }


    class myAdapter extends FragmentStatePagerAdapter {

        public myAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment = null;
            if(position==0){
                fragment = new fragment_a();
            }
            if(position==1){
                fragment = new fragment_b();
            }
            if(position==2){
                fragment = new fragment_c();
            }


            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        public CharSequence getPageTitle(int position){
            String title = null;
            if(position==0){
                title = "Frag A";
            }
            if(position==1){
                title = "Frag B";
            }
            if(position==2){
                title = "Frag C";
            }
            return title;
        }
    }
}
