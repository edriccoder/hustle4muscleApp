package com.example.hustle4muscle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class intense_level extends AppCompatActivity {
    ListView exerciseListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intense_level);

        exerciseListView = findViewById(R.id.exercise_list_view);

        List<Exercise> exercises = new ArrayList<>();
        exercises.add(new Exercise("Barbell Squat", "Perform a Barbell Squat by standing with feet shoulder-width apart, place barbell on shoulders behind head, lower body into a squat, then rise back up.", R.drawable.barbell_squat_intense));
        exercises.add(new Exercise("Clean and Jerk", "To do a Clean and Jerk, stand with feet shoulder-width apart, lift barbell to shoulders, squat slightly, then push barbell overhead while splitting legs.", R.drawable.clean_and_jerk_intense));
        exercises.add(new Exercise("Box Jumps", "For Box Jumps, start by standing in front of a sturdy box or platform. Bend your knees and swing your arms back, then explosively jump onto the box, landing softly with both feet. Step down carefully and repeat.", R.drawable.box_jumps));
        exercises.add(new Exercise("Battle Ropes", "Battle Ropes involve gripping both ends of a heavy rope and making waves or circles with your arms. Stand with feet shoulder-width apart, engage your core, and perform waves or slams with the ropes for a set duration or repetitions.", R.drawable.battle_ropes));
        exercises.add(new Exercise("Kettlebell Swing", "Perform a Kettlebell Swing by standing with feet shoulder-width apart, holding a kettlebell with both hands between legs. Bend knees slightly, hinge at hips to swing kettlebell back between legs, then forcefully extend hips and swing kettlebell to shoulder height, using the momentum from your hips. Control the swing and repeat.", R.drawable.kettlebell_swing));

        ExerciseAdapter adapter = new ExerciseAdapter(this, exercises);
        exerciseListView.setAdapter(adapter);

    }
}