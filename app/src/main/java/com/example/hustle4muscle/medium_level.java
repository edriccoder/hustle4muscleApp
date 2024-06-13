package com.example.hustle4muscle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class medium_level extends AppCompatActivity {
    ListView exerciseListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medium_level);

        exerciseListView = findViewById(R.id.exercise_list_view);

        List<Exercise> exercises = new ArrayList<>();
        exercises.add(new Exercise("Dumbbell Bench Press", "To perform a Dumbbell Bench Press, lie on a bench with dumbbells held above your chest, lower them to shoulder level, then push them back up.", R.drawable.dumbbell_bench_press));
        exercises.add(new Exercise("Deadlift", "Stand with feet hip-width apart, bend at the hips to grasp the barbell, keep back straight, lift the barbell by extending hips and knees, then lower it back down.", R.drawable.deadlift));
        exercises.add(new Exercise("Pull-ups", "Execute Pull-ups by gripping a bar with palms facing away, pull body upward until chin clears the bar, then lower body until arms are extended.", R.drawable.pull_ups));
        exercises.add(new Exercise("Leg Press", "To perform a Leg Press, sit on the machine with feet shoulder-width apart, press platform by extending knees, then return to starting position.", R.drawable.leg_press));
        exercises.add(new Exercise("Russian Twist", "For the Russian Twist, sit on the floor, lean back slightly, lift feet off the ground, twist torso to left, then right, while holding a weight or medicine ball.", R.drawable.russian_twist));

        ExerciseAdapter adapter = new ExerciseAdapter(this, exercises);
        exerciseListView.setAdapter(adapter);

    }
}