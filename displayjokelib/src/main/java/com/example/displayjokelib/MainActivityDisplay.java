package com.example.displayjokelib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivityDisplay extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_display_layout);
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.joke_container,new JokesFragment()).commit();
        }
    }
}
