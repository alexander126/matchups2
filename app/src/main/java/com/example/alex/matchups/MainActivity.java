package com.example.alex.matchups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView)findViewById(R.id.champ1);
        image.setImageResource(getIntent().getIntExtra("myImageResource",R.drawable.mou));
        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                    Intent intent = new Intent(MainActivity.this, pickchamp.class);
                    startActivity(intent);

            }
        });
    }
    }

