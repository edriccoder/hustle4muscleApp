package com.example.hustle4muscle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class easy_level extends AppCompatActivity {
    ListView exerciseListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_easy_level);

        exerciseListView = findViewById(R.id.exercise_list_view);

        List<Exercise> exercises = new ArrayList<>();
        exercises.add(new Exercise("Push Up", "To perform a Push Up, start in a high plank position with hands slightly wider than shoulder-width apart, lower your body by bending elbows, then push back up.", R.drawable.push_up));
        exercises.add(new Exercise("Squat", "Stand with feet shoulder-width apart, lower into a squat by bending knees and hips, keeping chest up and weight on heels, then return to standing.", R.drawable.squat));
        exercises.add(new Exercise("Lunge", "Execute a Lunge by stepping forward with one leg, lowering hips until both knees are bent at 90 degrees, then return to standing and repeat with the other leg." , R.drawable.lunge));
        exercises.add(new Exercise("Plank", "To do a Plank, start face down, lift body off the ground with elbows under shoulders and forearms flat, hold a straight line from head to heels.", R.drawable.plank));
        exercises.add(new Exercise("Glute Bridge", "Perform a Glute Bridge by lying on your back with knees bent, lift hips off the ground by squeezing glutes, hold briefly, then lower hips back down.", R.drawable.glute_bridge));

        ExerciseAdapter adapter = new ExerciseAdapter(this, exercises);
        exerciseListView.setAdapter(adapter);

    }
}