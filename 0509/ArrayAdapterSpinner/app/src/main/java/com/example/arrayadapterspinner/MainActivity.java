package com.example.arrayadapterspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner drink,temp;
    private TextView txv;
    private String[] tempSet1={"冰","溫","熱"};
    private String[] tempSet2={"冰","去冰"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv=(TextView)findViewById(R.id.order);
        temp=(Spinner)findViewById(R.id.temp);

        drink=(Spinner)findViewById(R.id.drink);
        drink.setOnItemClickListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String [] temSet;
                String[] temSet2;
                if (position == 3)
                    temSet = tempSet2;
                else
                    temSet = tempSet1;

                ArrayAdapter<String> tempAdp =
                        new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_item, tempSet1);
                tempAdp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                temp.setAdapter(tempAd);
                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}