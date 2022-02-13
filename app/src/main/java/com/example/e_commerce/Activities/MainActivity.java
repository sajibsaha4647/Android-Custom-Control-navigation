package com.example.e_commerce.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.e_commerce.Fragments.HomeFragment;
import com.example.e_commerce.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment fragment ;

    private LinearLayout Bottomtab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.orange));

        fragment = new HomeFragment();
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ChangeFrame, fragment,null);
        fragmentTransaction.commit();

        Bottomtab = findViewById(R.id.Bottomtabid);


        Bottomtab.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.categoryid){
            Toast.makeText(MainActivity.this,"category clickc",Toast.LENGTH_SHORT).show();
        }

    }
}