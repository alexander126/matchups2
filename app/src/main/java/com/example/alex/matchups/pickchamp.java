package com.example.alex.matchups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class pickchamp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickchamp);
        Button btn3 = (Button)findViewById(R.id.button4);
        Button btn2 = (Button)findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.mentor);
                startActivity(act2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.nadka);
                startActivity(act2);
            }
        });
    }}
