package com.example.e_commerce.Activities.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_commerce.Activities.Adapter.PagerAdapter;
import com.example.e_commerce.R;

public class IntroActivity extends AppCompatActivity  implements ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    private ImageView imageviewOne,ImageviewTwo,Imageviewthree;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        viewPager = findViewById(R.id.viewpagerid);

        imageviewOne =  findViewById(R.id.first_indicator);
        ImageviewTwo =  findViewById(R.id.second_indicator);
        Imageviewthree =  findViewById(R.id.third_indicator);


        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),0);

        viewPager.setAdapter(pagerAdapter);

        viewPager.addOnPageChangeListener(this);

    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}