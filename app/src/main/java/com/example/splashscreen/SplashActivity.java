package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SplashActivity extends AppCompatActivity {
     private LinearLayout splash_logo;
     private static int splashTimeout = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splash_logo =(LinearLayout) findViewById(R.id.splashlogo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
            }
        },splashTimeout);

        Animation a = AnimationUtils.loadAnimation(this, R.anim.splashanimation);
        splash_logo.startAnimation(a);


    }
}
