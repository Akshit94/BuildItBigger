package com.google.android.gms.example.androidjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jokeTextView = (TextView) findViewById(R.id.joke_text_view);
        Intent jokeIntent = getIntent();
        if (jokeIntent != null && jokeIntent.hasExtra("joke")) {
            String joke = jokeIntent.getStringExtra("joke");
            jokeTextView.setText(joke);
        }
    }
}
