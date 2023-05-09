package com.example.writenow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private static BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);

        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new HomeFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    //item을 클릭시 id값을 가져와 FrameLayout에 fragment.xml띄우기
                    case R.id.nav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new HomeFragment()).commit();
                        break;
                    case R.id.nav_write:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new WriteFragment()).commit();
                        break;
                    case R.id.nav_star:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new StarFragment()).commit();
                        break;
                    case R.id.nav_set:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new SetFragment()).commit();
                        break;
                }
                return true;
            }
        });

    }
}