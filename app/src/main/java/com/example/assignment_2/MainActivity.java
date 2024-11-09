package com.example.assignment_2;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openQuestion1(View view) {
        startActivity(new Intent(this, Question1.class));
    }

    public void openQuestion2(View view) {
        startActivity(new Intent(this, Question2form.class));
    }

    public void openQuestion3(View view) {
        startActivity(new Intent(this, Question3.class));
    }

    public void openQuestion4(View view) {
        startActivity(new Intent(this, Question4.class));
    }

    public void openQuestion5(View view) {
        startActivity(new Intent(this, Question5.class));
    }
}