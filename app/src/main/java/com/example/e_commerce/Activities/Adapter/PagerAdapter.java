package com.example.e_commerce.Activities.Adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.e_commerce.Activities.Fragments.FragmentOne;
import com.example.e_commerce.Activities.Fragments.FragmentThree;
import com.example.e_commerce.Activities.Fragments.FragmentTwo;

import java.util.ArrayList;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment>arrayList = new ArrayList<>();

    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public PagerAdapter(FragmentManager supportFragmentManager, int i) {
        super(supportFragmentManager, i);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    public void addFragment(Fragment fragment){
        arrayList.add(fragment);
    }
}
