package com.example.alex.matchups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class pickchamp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Dialog);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickchamp2);
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        //--DECLARING IMAGEBUTTONS--//
        ImageButton aatrox2 = (ImageButton)findViewById(R.id.aatrox2);
        ImageButton akali2 = (ImageButton)findViewById(R.id.akali2);
        ImageButton ahri2 = (ImageButton)findViewById(R.id.ahri2);
        ImageButton alistar2 = (ImageButton)findViewById(R.id.alistar2);
        ImageButton amumu2 = (ImageButton)findViewById(R.id.amumu2);
        ImageButton anivia2 = (ImageButton)findViewById(R.id.anivia2);
        ImageButton annie2 = (ImageButton)findViewById(R.id.annie2);
        ImageButton ashe2 = (ImageButton)findViewById(R.id.ashe2);
        ImageButton aurelionsol2 = (ImageButton)findViewById(R.id.aurelionsol2);
        ImageButton azir2 = (ImageButton)findViewById(R.id.azir2);
        ImageButton bard2 = (ImageButton)findViewById(R.id.bard2);
        ImageButton blitz2 = (ImageButton)findViewById(R.id.blitz2);
        ImageButton brand2 = (ImageButton)findViewById(R.id.brand2);
        ImageButton braum2 = (ImageButton)findViewById(R.id.braum2);
        ImageButton cait2 = (ImageButton)findViewById(R.id.cait2);

        //--ONCLICKLISTENERS--//
        aatrox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.aatrox);
                champ2.putExtra("message2", "Aatrox");
                setResult(11,champ2);
                finish();
            }
        });
        ahri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.ahri);
                champ2.putExtra("message2", "Ahri");
                setResult(11,champ2);
                finish();
            }
        });
        akali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.akali);
                champ2.putExtra("message2", "Akali");
                setResult(11,champ2);
                finish();
            }
        });
        alistar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.alistar);
                champ2.putExtra("message2", "Alistar");
                setResult(11,champ2);
                finish();
            }
        });
        amumu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.amumu);
                champ2.putExtra("message2", "Amumu");
                setResult(11,champ2);
                finish();
            }
        });
        anivia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.anivia);
                champ2.putExtra("message2", "Anivia");
                setResult(11,champ2);
                finish();
            }
        });
        annie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.annie);
                champ2.putExtra("message2", "Annie");
                setResult(11,champ2);
                finish();
            }
        });
        ashe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.ashe);
                champ2.putExtra("message2", "Ashe");
                setResult(11,champ2);
                finish();
            }
        });
        aurelionsol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.aurelionsol);
                champ2.putExtra("message2", "Aurelion Sol");
                setResult(11,champ2);
                finish();
            }
        });
        azir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.azir);
                champ2.putExtra("message2", "Azir");
                setResult(11,champ2);
                finish();
            }
        });
        bard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.bard);
                champ2.putExtra("message2", "Bard");
                setResult(11,champ2);
                finish();
            }
        });
        blitz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.blitzcrank);
                champ2.putExtra("message2", "Blitzcrank");
                setResult(11,champ2);
                finish();
            }
        });
        brand2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.brand);
                champ2.putExtra("message2", "Brand");
                setResult(11,champ2);
                finish();
            }
        });
        braum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.braum);
                champ2.putExtra("message2", "Braum");
                setResult(11,champ2);
                finish();
            }
        });
        cait2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent champ2= new Intent(pickchamp2.this,MainActivity.class);
                champ2.putExtra("myImageResource2", R.drawable.caitlyn);
                champ2.putExtra("message2", "Caitlyn");
                setResult(11,champ2);
                finish();
            }
        });
    }
}
