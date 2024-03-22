package com.example.name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout__display_string);

        TextView txvshow = (TextView) findViewById(R.id.txvshow);
        Intent intent = getIntent();
        txvshow.setText(intent.getStringExtra("userName")+"您好!");
    }
}