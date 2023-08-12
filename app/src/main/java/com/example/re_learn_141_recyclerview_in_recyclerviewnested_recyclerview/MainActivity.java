package com.example.re_learn_141_recyclerview_in_recyclerviewnested_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "World", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "World", Toast.LENGTH_SHORT).show();
    }
}