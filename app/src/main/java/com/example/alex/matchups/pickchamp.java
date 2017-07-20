package com.example.alex.matchups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class pickchamp extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Dialog);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickchamp);
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        //--DECLARING IMAGEBUTTONS--//
        ImageButton aatrox1 = (ImageButton)findViewById(R.id.aatrox1);
        ImageButton akali1 = (ImageButton)findViewById(R.id.akali1);
        ImageButton ahri1 = (ImageButton)findViewById(R.id.ahri1);


        //--ONCLICKLISTENERS--//
        aatrox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.aatrox);
                act2.putExtra("message", "Aatrox");
                startActivity(act2);
            }
        });
        ahri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.ahri);
                act2.putExtra("message", "Ahri");
                startActivity(act2);
            }
        });
        akali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.akali);
                act2.putExtra("message", "Akali");
                startActivity(act2);
            }
        });
    }}
