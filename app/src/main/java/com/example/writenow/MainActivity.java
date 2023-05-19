package com.example.writenow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.MenuItem;

import com.example.writenow.Home.HomeFragment;
import com.example.writenow.Set.SetFragment;
import com.example.writenow.Star.StarFragment;
import com.example.writenow.Write.WriteFragment;
import com.example.writenow.Write.WriteStudentFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    HomeFragment homeFragment;
    WriteFragment writeFragment;
    StarFragment starFragment;
    SetFragment setFragment;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_home){
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new HomeFragment()).commit();
                    return true;
                }
                else if (id == R.id.nav_write){
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new WriteFragment()).commit();
                    return true;
                }
                else if (id == R.id.nav_star){
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new StarFragment()).commit();
                    return true;
                }
                else if (id == R.id.nav_set){
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new SetFragment()).commit();
                    return true;
                }
                return true;
            }
        });


    }
    private void init(){
        //fragment 객체 생성
        homeFragment = new HomeFragment();
        writeFragment = new WriteFragment();
        starFragment = new StarFragment();
        setFragment = new SetFragment();

        //main.xml상의 bottomNavigationView 연결
        bottomNavigationView = findViewById(R.id.bottomNavi);

        //제일 처음 띄어줄 뷰 세팅
        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,homeFragment).commitAllowingStateLoss();

    }
}