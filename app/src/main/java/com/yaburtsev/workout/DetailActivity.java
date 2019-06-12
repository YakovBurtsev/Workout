package com.yaburtsev.workout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        WorkoutDetailFragment fragment = (WorkoutDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detail_fragment);

        if (fragment != null) {
            fragment.setWorkoutId(1);
        }
    }


}
