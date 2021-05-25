package com.example.instagram_suggestion;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bar = findViewById(R.id.bars);


        //This will animate our Progress Bar
        ObjectAnimator animator = ObjectAnimator.ofInt(bar, "progress", 100);
        animator.setDuration(4000);
        animator.setInterpolator(new LinearInterpolator());
        animator.start();


    }
}
