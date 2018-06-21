package com.example.thres.mobileproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends FragmentActivity
{

    private SectionsPageAdapter sectionsPageAdapter;
    private ViewPager viewpager;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        viewpager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewpager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewpager);

    }

    private void setupViewPager(ViewPager viewPager)
    {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentA(), "Home");
        adapter.addFragment(new FragmentB(), "About");
        adapter.addFragment(new FragmentC(), "Menu");
        viewPager.setAdapter(adapter);
    }

}

class SectionsPageAdapter extends FragmentPagerAdapter
{

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public void addFragment(Fragment fragment, String title)
    {
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }



    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}