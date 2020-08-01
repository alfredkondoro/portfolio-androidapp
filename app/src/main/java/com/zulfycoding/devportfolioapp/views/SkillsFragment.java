package com.zulfycoding.devportfolioapp.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zulfycoding.devportfolioapp.R;

public class SkillsFragment extends Fragment {

    public SkillsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View skillsView = inflater.inflate(R.layout.fragment_skills, container, false);
        // Inflate the layout for this fragment
        return skillsView;
    }
}