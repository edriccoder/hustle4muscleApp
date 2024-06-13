package com.example.hustle4muscle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ExerciseAdapter extends ArrayAdapter<Exercise> {
    private final Context context;
    private final List<Exercise> exercises;

    public ExerciseAdapter(@NonNull Context context, @NonNull List<Exercise> exercises) {
        super(context, R.layout.exercise_item, exercises);
        this.context = context;
        this.exercises = exercises;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.exercise_item, parent, false);
        }

        Exercise exercise = exercises.get(position);

        TextView nameTextView = convertView.findViewById(R.id.exercise_name);
        TextView descriptionTextView = convertView.findViewById(R.id.exercise_description);
        ImageView gifImageView = convertView.findViewById(R.id.exercise_gif);

        nameTextView.setText(exercise.getName());
        descriptionTextView.setText(exercise.getDescription());

        // Load GIF with Glide
        Glide.with(context)
                .asGif()
                .load(exercise.getGifResource())
                .into(gifImageView);

        return convertView;
    }
}
