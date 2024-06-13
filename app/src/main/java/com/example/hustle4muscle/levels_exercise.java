package com.example.hustle4muscle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class levels_exercise extends AppCompatActivity {
    Button easy, medium, intense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_levels_exercise);

        easy = findViewById(R.id.easy);
        medium = findViewById(R.id.medium);
        intense = findViewById(R.id.intense);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(levels_exercise.this, easy_level.class);
                startActivity(intent);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(levels_exercise.this, medium_level.class);
                startActivity(intent);
            }
        });

        intense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(levels_exercise.this, intense_level.class);
                startActivity(intent);
            }
        });
    }
}