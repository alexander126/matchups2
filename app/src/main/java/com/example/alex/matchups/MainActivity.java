package com.example.alex.matchups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.text;
import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {
    TextView champ1;
    TextView champ2;
    private ImageView image;
    private ImageView image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //--INITIALISING IMAGEVIEW--//
        image = (ImageView)findViewById(R.id.champ1);
        image2 = (ImageView)findViewById(R.id.champ2);
        ImageView image3 = (ImageView)findViewById(R.id.vs);

        //--SETTING RESOURCES FROM ANOTHER ACTIVITY--//
        image.setImageResource(R.drawable.random);
        image2.setImageResource(R.drawable.random);
        image3.setImageResource(R.drawable.vssymbol);
        //--SETTINGS TEXT FROM ANOTHER ACTIVITY--//
        champ1=(TextView) findViewById(R.id.textview1);
        champ2=(TextView)findViewById(R.id.textview2);



        //--PICK CHAMP BUTTONS--//
        Button champselect1 = (Button)findViewById(R.id.champselect1);
        Button champselect2 = (Button)findViewById(R.id.champselect2);

        //------------------//
        champselect1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity.this, pickchamp.class);
                startActivityForResult(intent,100);

            }
        });

        champselect2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, pickchamp2.class);
                startActivityForResult(intent,100);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==100){
            if(resultCode==10){
                image.setImageResource(data.getIntExtra("myImageResource",R.drawable.random));
                champ1.setText(data.getStringExtra("message"));

            }else if(resultCode==11){
                image2.setImageResource(data.getIntExtra("myImageResource2",R.drawable.random));
                champ2.setText(data.getStringExtra("message2"));
            }
        }
    }}

