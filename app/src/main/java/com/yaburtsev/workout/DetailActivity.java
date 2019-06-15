package com.yaburtsev.workout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        WorkoutDetailFragment fragment = (WorkoutDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detail_fragment);

        if (fragment != null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                int workoutId = extras.getInt(EXTRA_WORKOUT_ID);
                fragment.setWorkoutId(workoutId);
            }
        }
    }

}
