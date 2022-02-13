package com.example.e_commerce.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_commerce.Fragments.CartFragment;
import com.example.e_commerce.Fragments.CategoryFragment;
import com.example.e_commerce.Fragments.HomeFragment;
import com.example.e_commerce.Fragments.UserFragment;
import com.example.e_commerce.Fragments.WishlistFragment;
import com.example.e_commerce.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment fragment ;
    private RelativeLayout Bottomtab;
    private ImageView imageCategory,imageWishlist,imageCart,imageUser,imageHome;

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

        imageCategory = findViewById(R.id.home);
        imageCategory.setOnClickListener(this);

        imageWishlist = findViewById(R.id.home1);
        imageWishlist.setOnClickListener(this);

        imageCart = findViewById(R.id.home3);
        imageCart.setOnClickListener(this);

        imageUser = findViewById(R.id.home4);
        imageUser.setOnClickListener(this);

        imageHome = findViewById(R.id.hom);
        imageHome.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

       switch (view.getId()){
           case R.id.home:
               fragment = new CategoryFragment();
               FragmentManager fragmentManager = this.getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.ChangeFrame, fragment,null);
               fragmentTransaction.commit();
              break;
           case R.id.home1:
               fragment = new WishlistFragment();
               FragmentManager fragmentManager1 = this.getSupportFragmentManager();
               FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
               fragmentTransaction1.replace(R.id.ChangeFrame, fragment,null);
               fragmentTransaction1.commit();
               break;
           case R.id.home3:
               fragment = new CartFragment();
               FragmentManager fragmentManager2 = this.getSupportFragmentManager();
               FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
               fragmentTransaction2.replace(R.id.ChangeFrame, fragment,null);
               fragmentTransaction2.commit();
               break;
           case R.id.home4:
               fragment =new UserFragment();
               FragmentManager fragmentManager3 = this.getSupportFragmentManager();
               FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
               fragmentTransaction3.replace(R.id.ChangeFrame, fragment,null);
               fragmentTransaction3.commit();
               break;
           case R.id.hom:
               fragment =new HomeFragment();
               FragmentManager fragmentManager4 = this.getSupportFragmentManager();
               FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();
               fragmentTransaction4.replace(R.id.ChangeFrame, fragment,null);
               fragmentTransaction4.commit();
               break;


       }

    }
}