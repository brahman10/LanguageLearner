package com.example.languagelearner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView numbers = findViewById(R.id.numbers);
    TextView family = findViewById(R.id.family);
    TextView phrases = findViewById(R.id.phrases);
    TextView colors = findViewById(R.id.colors);

    public void numberList(View view){
        startActivity(new Intent(MainActivity.this,NumbersActivity.class));
    }

}
