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
        ImageButton alistar1 = (ImageButton)findViewById(R.id.alistar1);
        ImageButton amumu1 = (ImageButton)findViewById(R.id.amumu1);
        ImageButton anivia1 = (ImageButton)findViewById(R.id.anivia1);
        ImageButton annie1 = (ImageButton)findViewById(R.id.annie1);
        ImageButton ashe1 = (ImageButton)findViewById(R.id.ashe1);
        ImageButton aurelionsol1 = (ImageButton)findViewById(R.id.aurelionsol1);
        ImageButton azir1 = (ImageButton)findViewById(R.id.azir1);
        ImageButton bard1 = (ImageButton)findViewById(R.id.bard1);
        ImageButton blitz1 = (ImageButton)findViewById(R.id.blitz1);


        //--ONCLICKLISTENERS--//
        aatrox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.aatrox);
                act2.putExtra("message", "Aatrox");
                setResult(10,act2);
                finish();
            }
        });
        ahri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.ahri);
                act2.putExtra("message", "Ahri");
                setResult(10,act2);
                finish();
            }
        });
        akali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.akali);
                act2.putExtra("message", "Akali");
                setResult(10,act2);
                finish();
            }
        });
        alistar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.alistar);
                act2.putExtra("message", "Alistar");
                setResult(10,act2);
                finish();
            }
        });
        amumu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.amumu);
                act2.putExtra("message", "Amumu");
                setResult(10,act2);
                finish();
            }
        });
        anivia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.anivia);
                act2.putExtra("message", "Anivia");
                setResult(10,act2);
                finish();
            }
        });
        annie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.annie);
                act2.putExtra("message", "Annie");
                setResult(10,act2);
                finish();
            }
        });
        ashe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.ashe);
                act2.putExtra("message", "Ashe");
                setResult(10,act2);
                finish();
            }
        });
        aurelionsol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.aurelionsol);
                act2.putExtra("message", "Aurelion Sol");
                setResult(10,act2);
                finish();
            }
        });
        azir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.azir);
                act2.putExtra("message", "Azir");
                setResult(10,act2);
                finish();
            }
        });
        bard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.bard);
                act2.putExtra("message", "Bard");
                setResult(10,act2);
                finish();
            }
        });
        blitz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.blitzcrank);
                act2.putExtra("message", "Blitzcrank");
                setResult(10,act2);
                finish();
            }
        });
    }}
