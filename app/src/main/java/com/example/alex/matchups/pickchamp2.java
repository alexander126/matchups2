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
    }
}
