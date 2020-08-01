package com.zulfycoding.devportfolioapp.controller;

import com.zulfycoding.devportfolioapp.views.AboutFragment;
import com.zulfycoding.devportfolioapp.views.ContactFragment;
import com.zulfycoding.devportfolioapp.views.SkillsFragment;
import com.zulfycoding.devportfolioapp.views.WorkFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class DevPagerAdapter extends FragmentPagerAdapter {
    public DevPagerAdapter(FragmentManager fm) {
        super (fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutFragment ();
            case 1:
                return new WorkFragment ();
            case 2:
                return new SkillsFragment ();
            case 3:
                return new ContactFragment ();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0: return "ABOUT";
            case 1: return "WORK";
            case 2: return "SKILLS";
            case 3: return "CONTACT";
        }
        return null;
    }
}
