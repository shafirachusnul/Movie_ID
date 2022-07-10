package com.shafira.movieid.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.shafira.movieid.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.shafira.movieid.fragment.FragmentMovie;

public class SplashscreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashscreenActivity.this, MainActivity.class));
//                startActivity(new Intent(SplashscreenActivity.this, MainActivity.class));
                finish();
            }
        }, 2000);
    }
}
