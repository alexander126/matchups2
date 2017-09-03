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
        ImageButton brand1 = (ImageButton)findViewById(R.id.brand1);
        ImageButton braum1 = (ImageButton)findViewById(R.id.braum1);
        ImageButton cait1 = (ImageButton)findViewById(R.id.cait1);
        ImageButton camille1 = (ImageButton)findViewById(R.id.camille1);
        ImageButton cassiopea1 = (ImageButton)findViewById(R.id.cassiopea1);
        ImageButton chogath1 = (ImageButton)findViewById(R.id.chogath1);
        ImageButton corki1 = (ImageButton)findViewById(R.id.corki1);
        ImageButton darius1 = (ImageButton)findViewById(R.id.darius1);
        ImageButton diana1 = (ImageButton)findViewById(R.id.diana1);
        ImageButton draven1 = (ImageButton)findViewById(R.id.draven1);
        ImageButton drmundo1 = (ImageButton)findViewById(R.id.drmundo1);
        ImageButton elise1 = (ImageButton)findViewById(R.id.elise1);
        ImageButton evelynn1 = (ImageButton)findViewById(R.id.evelynn1);
        ImageButton ezreal1 = (ImageButton)findViewById(R.id.ezreal1);
        ImageButton fiddle1 = (ImageButton)findViewById(R.id.fiddle1);
        ImageButton fiora1 = (ImageButton)findViewById(R.id.fiora1);
        ImageButton fizz1 = (ImageButton)findViewById(R.id.fizz1);
        ImageButton galio1 = (ImageButton)findViewById(R.id.galio1);
        ImageButton gangplank1 = (ImageButton)findViewById(R.id.gangplank1);
        ImageButton garen1 = (ImageButton)findViewById(R.id.garen1);
        ImageButton gnar1 = (ImageButton)findViewById(R.id.gnar1);
        ImageButton gragas1 = (ImageButton)findViewById(R.id.gragas1);
        ImageButton graves1 = (ImageButton)findViewById(R.id.graves1);
        ImageButton hecarim1 = (ImageButton)findViewById(R.id.hecarim1);
        ImageButton heimer1 = (ImageButton)findViewById(R.id.heimerdinger1);
        ImageButton illaoi1 = (ImageButton)findViewById(R.id.illaoi1);
        ImageButton irelia1 = (ImageButton)findViewById(R.id.irelia1);
        ImageButton ivern1 = (ImageButton)findViewById(R.id.ivern1);
        ImageButton janna1 = (ImageButton)findViewById(R.id.janna1);
        ImageButton jarvan1 = (ImageButton)findViewById(R.id.jarvan1);
        ImageButton jax1 = (ImageButton)findViewById(R.id.jax1);
        ImageButton jayce1 = (ImageButton)findViewById(R.id.jayce1);
        ImageButton jhin1 = (ImageButton)findViewById(R.id.jhin1);
        ImageButton jinx1 = (ImageButton)findViewById(R.id.jinx1);
        ImageButton kalista1 = (ImageButton)findViewById(R.id.kalista1);
        ImageButton karma1 = (ImageButton)findViewById(R.id.karma1);
        ImageButton karthus1 = (ImageButton)findViewById(R.id.karthus1);
        ImageButton kassadin1 = (ImageButton)findViewById(R.id.kassadin1);
        ImageButton katarina1 = (ImageButton)findViewById(R.id.katarina1);
        ImageButton kayle1 = (ImageButton)findViewById(R.id.kayle1);
        ImageButton kayn1 = (ImageButton)findViewById(R.id.kayn1);
        ImageButton kennen1 = (ImageButton)findViewById(R.id.kennen1);
        ImageButton khazix1 = (ImageButton)findViewById(R.id.khazix1);
        ImageButton kindred1 = (ImageButton)findViewById(R.id.kindred1);
        ImageButton kled1 = (ImageButton)findViewById(R.id.kled1);
        ImageButton kogmaw1 = (ImageButton)findViewById(R.id.kogmaw1);
        ImageButton leblanc1 = (ImageButton)findViewById(R.id.leblanc1);
        ImageButton leesin1 = (ImageButton)findViewById(R.id.leesin1);
        ImageButton leona1 = (ImageButton)findViewById(R.id.leona1);
        ImageButton lissandra1 = (ImageButton)findViewById(R.id.lissandra1);
        ImageButton lucian1 = (ImageButton)findViewById(R.id.lucian1);
        ImageButton lulu1 = (ImageButton)findViewById(R.id.lulu1);
        ImageButton lux1 = (ImageButton)findViewById(R.id.lux1);
        ImageButton malphite1 = (ImageButton)findViewById(R.id.malphite1);
        ImageButton malzahar1 = (ImageButton)findViewById(R.id.malzahar1);
        ImageButton maokai1 = (ImageButton)findViewById(R.id.maokai1);
        ImageButton masteryi1 = (ImageButton)findViewById(R.id.masteryi1);
        ImageButton missfortune1 = (ImageButton)findViewById(R.id.missfortune1);
        ImageButton mordekaiser1 = (ImageButton)findViewById(R.id.mordekaiser1);
        ImageButton morgana1 = (ImageButton)findViewById(R.id.morgana1);
        ImageButton nami1 = (ImageButton)findViewById(R.id.nami1);
        ImageButton nasus1 = (ImageButton)findViewById(R.id.nasus1);
        ImageButton nautilius1 = (ImageButton)findViewById(R.id.nautilius1);
        ImageButton nidalee1 = (ImageButton)findViewById(R.id.nidalee1);
        ImageButton nocturne1 = (ImageButton)findViewById(R.id.nocturne);
        ImageButton nunu1 = (ImageButton)findViewById(R.id.nunu1);
        ImageButton olaf1 = (ImageButton)findViewById(R.id.olaf1);
        ImageButton orianna1 = (ImageButton)findViewById(R.id.orianna1);
        ImageButton ornn1 = (ImageButton)findViewById(R.id.ornn1);
        ImageButton pantheon1 = (ImageButton)findViewById(R.id.pantheon1);
        ImageButton poppy1 = (ImageButton)findViewById(R.id.poppy1);
        ImageButton quinn1 = (ImageButton)findViewById(R.id.quinn1);
        ImageButton rakan1 = (ImageButton)findViewById(R.id.rakan1);
        ImageButton rammus1 = (ImageButton)findViewById(R.id.rammus1);
        ImageButton reksai1 = (ImageButton)findViewById(R.id.reksai1);
        ImageButton renekton1 = (ImageButton)findViewById(R.id.renekton1);
        ImageButton rengar1 = (ImageButton)findViewById(R.id.rengar1);
        ImageButton riven1 = (ImageButton)findViewById(R.id.riven1);
        ImageButton rumble1 = (ImageButton)findViewById(R.id.rumble1);
        ImageButton ryze1 = (ImageButton)findViewById(R.id.ryze1);
        ImageButton sejuani1 = (ImageButton)findViewById(R.id.sejuani1);
        ImageButton shacko1 = (ImageButton)findViewById(R.id.shacko1);
        ImageButton shen1 = (ImageButton)findViewById(R.id.shen1);
        ImageButton shyvana1 = (ImageButton)findViewById(R.id.shyvana1);
        ImageButton singed1 = (ImageButton)findViewById(R.id.singed1);
        ImageButton sion1 = (ImageButton)findViewById(R.id.sion1);
        ImageButton sivir1 = (ImageButton)findViewById(R.id.sivir1);
        ImageButton skarner1 = (ImageButton)findViewById(R.id.skarner1);
        ImageButton sona1 = (ImageButton)findViewById(R.id.sona1);
        ImageButton soraka1 = (ImageButton)findViewById(R.id.soraka1);
        ImageButton swain1 = (ImageButton)findViewById(R.id.swain1);
        ImageButton syndra1 = (ImageButton)findViewById(R.id.syndra1);
        ImageButton tahmkench1 = (ImageButton)findViewById(R.id.tahmkench1);
        ImageButton taliyah1 = (ImageButton)findViewById(R.id.taliyah1);
        ImageButton talon1 = (ImageButton)findViewById(R.id.talon1);
        ImageButton taric1 = (ImageButton)findViewById(R.id.taric1);
        ImageButton teemo1 = (ImageButton)findViewById(R.id.teemo1);
        ImageButton thresh1 = (ImageButton)findViewById(R.id.thresh1);
        ImageButton tristana1 = (ImageButton)findViewById(R.id.tristana1);
        ImageButton trunde1 = (ImageButton)findViewById(R.id.trundle1);
        ImageButton tryndamare1 = (ImageButton)findViewById(R.id.tryndamere1);
        ImageButton twistedfate1 = (ImageButton)findViewById(R.id.twistedfate1);
        ImageButton twitch1 = (ImageButton)findViewById(R.id.twitch1);
        ImageButton udyr1 = (ImageButton)findViewById(R.id.udyr1);
        ImageButton urgot1 = (ImageButton)findViewById(R.id.urgot1);
        ImageButton varus1 = (ImageButton)findViewById(R.id.varus1);
        ImageButton vayne1 = (ImageButton)findViewById(R.id.vayne1);
        ImageButton veigar1 = (ImageButton)findViewById(R.id.veigar1);
        ImageButton velkoz1 = (ImageButton)findViewById(R.id.velkoz1);
        ImageButton vi1 = (ImageButton)findViewById(R.id.vi1);
        ImageButton viktor1 = (ImageButton)findViewById(R.id.viktor1);
        ImageButton vladimir1 = (ImageButton)findViewById(R.id.vladimir1);
        ImageButton volibear1 = (ImageButton)findViewById(R.id.volibear1);
        ImageButton warwick1 = (ImageButton)findViewById(R.id.warwick1);
        ImageButton wukong1 = (ImageButton)findViewById(R.id.wukong1);
        ImageButton xayah1 = (ImageButton)findViewById(R.id.xayah1);
        ImageButton xerath1 = (ImageButton)findViewById(R.id.xerath1);
        ImageButton xinzhao1 = (ImageButton)findViewById(R.id.xinzhao1);
        ImageButton yasuo1 = (ImageButton)findViewById(R.id.yasuo1);
        ImageButton yorick1 = (ImageButton)findViewById(R.id.yorick1);
        ImageButton zac1 = (ImageButton)findViewById(R.id.zac1);
        ImageButton zed1 = (ImageButton)findViewById(R.id.zed1);
        ImageButton ziggs1 = (ImageButton)findViewById(R.id.ziggs1);
        ImageButton zilean1 = (ImageButton)findViewById(R.id.zilean1);
        ImageButton zyra1 = (ImageButton)findViewById(R.id.zyra1);









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
        brand1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.brand);
                act2.putExtra("message", "Brand");
                setResult(10,act2);
                finish();
            }
        });
        braum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.braum);
                act2.putExtra("message", "Braum");
                setResult(10,act2);
                finish();
            }
        });
        cait1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.caitlyn);
                act2.putExtra("message", "Caitlyn");
                setResult(10,act2);
                finish();
            }
        });
        camille1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.camille);
                act2.putExtra("message", "Camille");
                setResult(10,act2);
                finish();
            }
        });
        cassiopea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.cassiopeia);
                act2.putExtra("message", "Cassiopea");
                setResult(10,act2);
                finish();
            }
        });
        chogath1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.chogath);
                act2.putExtra("message", "Cho'Gath");
                setResult(10,act2);
                finish();
            }
        });
        corki1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.corki);
                act2.putExtra("message", "Corki");
                setResult(10,act2);
                finish();
            }
        });
        darius1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.darius);
                act2.putExtra("message", "Darius");
                setResult(10,act2);
                finish();
            }
        });
        diana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.diana);
                act2.putExtra("message", "Diana");
                setResult(10,act2);
                finish();
            }
        });
        draven1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.draven);
                act2.putExtra("message", "Draven");
                setResult(10,act2);
                finish();
            }
        });
        drmundo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.drmundo);
                act2.putExtra("message", "Dr.Mundo");
                setResult(10,act2);
                finish();
            }
        });
        elise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.elise);
                act2.putExtra("message", "Elise");
                setResult(10,act2);
                finish();
            }
        });
        evelynn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.evelynn);
                act2.putExtra("message", "Evelynn");
                setResult(10,act2);
                finish();
            }
        });
        ezreal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.ezreal);
                act2.putExtra("message", "Ezreal");
                setResult(10,act2);
                finish();
            }
        });
        fiddle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.fiddlesticks);
                act2.putExtra("message", "Fiddlesticks");
                setResult(10,act2);
                finish();
            }
        });
        fiora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.fiora);
                act2.putExtra("message", "Fiora");
                setResult(10,act2);
                finish();
            }
        });
        fizz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.fizz);
                act2.putExtra("message", "Fizz");
                setResult(10,act2);
                finish();
            }
        });
        galio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.galio);
                act2.putExtra("message", "Galio");
                setResult(10,act2);
                finish();
            }
        });
        gangplank1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.gangplank);
                act2.putExtra("message", "Gangplank");
                setResult(10,act2);
                finish();
            }
        });
        garen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.garen);
                act2.putExtra("message", "Garen");
                setResult(10,act2);
                finish();
            }
        });
        gnar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.gnar);
                act2.putExtra("message", "Gnar");
                setResult(10,act2);
                finish();
            }
        });
        gragas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.gragas);
                act2.putExtra("message", "Gragas");
                setResult(10,act2);
                finish();
            }
        });
        graves1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.graves);
                act2.putExtra("message", "Graves");
                setResult(10,act2);
                finish();
            }
        });
        hecarim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.hecarim);
                act2.putExtra("message", "Heracim");
                setResult(10,act2);
                finish();
            }
        });
        heimer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.heimerdinger);
                act2.putExtra("message", "Heimerdinger");
                setResult(10,act2);
                finish();
            }
        });
        illaoi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.illaoi);
                act2.putExtra("message", "Illaoi");
                setResult(10,act2);
                finish();
            }
        });
        irelia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.irelia);
                act2.putExtra("message", "Irelia");
                setResult(10,act2);
                finish();
            }
        });
        ivern1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.ivern);
                act2.putExtra("message", "Ivern");
                setResult(10,act2);
                finish();
            }
        });
        janna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.janna);
                act2.putExtra("message", "Janna");
                setResult(10,act2);
                finish();
            }
        });
        jarvan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.jarvan);
                act2.putExtra("message", "Jarvan");
                setResult(10,act2);
                finish();
            }
        });
        jax1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.jax);
                act2.putExtra("message", "Jax");
                setResult(10,act2);
                finish();
            }
        });
        jayce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.jayce);
                act2.putExtra("message", "Jayce");
                setResult(10,act2);
                finish();
            }
        });
        jhin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.jhin);
                act2.putExtra("message", "Jhin");
                setResult(10,act2);
                finish();
            }
        });
        jinx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.jinx);
                act2.putExtra("message", "Jinx");
                setResult(10,act2);
                finish();
            }
        });
        kalista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.kalista);
                act2.putExtra("message", "Kalista");
                setResult(10,act2);
                finish();
            }
        });
        karma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.karma);
                act2.putExtra("message", "Karma");
                setResult(10,act2);
                finish();
            }
        });
        karthus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.karthus);
                act2.putExtra("message", "Karthus");
                setResult(10,act2);
                finish();
            }
        });
        kassadin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.kassadin);
                act2.putExtra("message", "Kassadin");
                setResult(10,act2);
                finish();
            }
        });
        katarina1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.katarina);
                act2.putExtra("message", "Katarina");
                setResult(10,act2);
                finish();
            }
        });
        kayle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.kayle);
                act2.putExtra("message", "Kayle");
                setResult(10,act2);
                finish();
            }
        });
        kayn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.kayn);
                act2.putExtra("message", "Kayn");
                setResult(10,act2);
                finish();
            }
        });
        kennen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.kennen);
                act2.putExtra("message", "Kennen");
                setResult(10,act2);
                finish();
            }
        });
        khazix1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.khazix);
                act2.putExtra("message", "Kha'Zix");
                setResult(10,act2);
                finish();
            }
        });
        kindred1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.kindred);
                act2.putExtra("message", "Kindred");
                setResult(10,act2);
                finish();
            }
        });
        kled1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.kled);
                act2.putExtra("message", "Kled");
                setResult(10,act2);
                finish();
            }
        });
        kogmaw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.kogmaw);
                act2.putExtra("message", "Kog Maw");
                setResult(10,act2);
                finish();
            }
        });
        leblanc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.leblanc);
                act2.putExtra("message", "Le Blanc");
                setResult(10,act2);
                finish();
            }
        });
        leesin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.leesin);
                act2.putExtra("message", "Lee Sin");
                setResult(10,act2);
                finish();
            }
        });
        leona1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.leona);
                act2.putExtra("message", "Leona");
                setResult(10,act2);
                finish();
            }
        });
        lissandra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.lissandra);
                act2.putExtra("message", "Lissandra");
                setResult(10,act2);
                finish();
            }
        });
        lucian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.lucian);
                act2.putExtra("message", "Lucian");
                setResult(10,act2);
                finish();
            }
        });
        lulu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.lulu);
                act2.putExtra("message", "Lulu");
                setResult(10,act2);
                finish();
            }
        });
        lux1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.lux);
                act2.putExtra("message", "Lux");
                setResult(10,act2);
                finish();
            }
        });
        malphite1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.malphite);
                act2.putExtra("message", "Malphite");
                setResult(10,act2);
                finish();
            }
        });
        malzahar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.malzahar);
                act2.putExtra("message", "Malzahar");
                setResult(10,act2);
                finish();
            }
        });
        maokai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.maokai);
                act2.putExtra("message", "Maokai");
                setResult(10,act2);
                finish();
            }
        });
        masteryi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.masteryi);
                act2.putExtra("message", "Master Yi");
                setResult(10,act2);
                finish();
            }
        });
        missfortune1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.missfortune);
                act2.putExtra("message", "Miss Fortune");
                setResult(10,act2);
                finish();
            }
        });
        mordekaiser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.mordekaiser);
                act2.putExtra("message", "Mordekaiser");
                setResult(10,act2);
                finish();
            }
        });
        morgana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.morgana);
                act2.putExtra("message", "Morgana");
                setResult(10,act2);
                finish();
            }
        });
        nami1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.nami);
                act2.putExtra("message", "Nami");
                setResult(10,act2);
                finish();
            }
        });
        nasus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.nasus);
                act2.putExtra("message", "Nasus");
                setResult(10,act2);
                finish();
            }
        });
        nautilius1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.nautilius);
                act2.putExtra("message", "Nautilius");
                setResult(10,act2);
                finish();
            }
        });
        nidalee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.nidalee);
                act2.putExtra("message", "Nidalee");
                setResult(10,act2);
                finish();
            }
        });
        nocturne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.nocturne);
                act2.putExtra("message", "Nocturne");
                setResult(10,act2);
                finish();
            }
        });
        nunu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.nunu);
                act2.putExtra("message", "Nunu");
                setResult(10,act2);
                finish();
            }
        });
        olaf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.olaf);
                act2.putExtra("message", "Olaf");
                setResult(10,act2);
                finish();
            }
        });
        orianna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.orianna);
                act2.putExtra("message", "Orianna");
                setResult(10,act2);
                finish();
            }
        });
        //TODO--FIND ORN ICON AND REPLACE--//
        ornn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.orianna);
                act2.putExtra("message", "Ornn");
                setResult(10,act2);
                finish();
            }
        });
        pantheon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.pantheon);
                act2.putExtra("message", "Pantheon");
                setResult(10,act2);
                finish();
            }
        });
        poppy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.poppy);
                act2.putExtra("message", "Poppy");
                setResult(10,act2);
                finish();
            }
        });
        quinn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.quinn);
                act2.putExtra("message", "Quinn");
                setResult(10,act2);
                finish();
            }
        });
        rakan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.rakan);
                act2.putExtra("message", "Rakan");
                setResult(10,act2);
                finish();
            }
        });

        rammus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.rammus);
                act2.putExtra("message", "Rammus");
                setResult(10,act2);
                finish();
            }
        });

        reksai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.reksai);
                act2.putExtra("message", "Rek'Sai");
                setResult(10,act2);
                finish();
            }
        });
        renekton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.renekton);
                act2.putExtra("message", "Renekton");
                setResult(10,act2);
                finish();
            }
        });
        rengar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.rengar);
                act2.putExtra("message", "Rengar");
                setResult(10,act2);
                finish();
            }
        });
        riven1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.riven);
                act2.putExtra("message", "Riven");
                setResult(10,act2);
                finish();
            }
        });
        rumble1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.rumble);
                act2.putExtra("message", "Rumble");
                setResult(10,act2);
                finish();
            }
        });
        ryze1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.ryze);
                act2.putExtra("message", "Ryze");
                setResult(10,act2);
                finish();
            }
        });
        sejuani1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.sejuani);
                act2.putExtra("message", "Sejuani");
                setResult(10,act2);
                finish();
            }
        });
        shacko1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.shacko);
                act2.putExtra("message", "Shacko");
                setResult(10,act2);
                finish();
            }
        });
        shen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.shen);
                act2.putExtra("message", "Shen");
                setResult(10,act2);
                finish();
            }
        });
        shyvana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.shyvana);
                act2.putExtra("message", "Shyvana");
                setResult(10,act2);
                finish();
            }
        });
        singed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.singed);
                act2.putExtra("message", "Singed");
                setResult(10,act2);
                finish();
            }
        });
        sion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.sion);
                act2.putExtra("message", "Sion");
                setResult(10,act2);
                finish();
            }
        });
        sivir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.sivir);
                act2.putExtra("message", "Sivir");
                setResult(10,act2);
                finish();
            }
        });
        skarner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.skarner);
                act2.putExtra("message", "Skarner");
                setResult(10,act2);
                finish();
            }
        });
        sona1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.sona);
                act2.putExtra("message", "Sona");
                setResult(10,act2);
                finish();
            }
        });
        soraka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.soraka);
                act2.putExtra("message", "Soraka");
                setResult(10,act2);
                finish();
            }
        });
        swain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.swain);
                act2.putExtra("message", "Swain");
                setResult(10,act2);
                finish();
            }
        });
        syndra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.syndra);
                act2.putExtra("message", "Syndra");
                setResult(10,act2);
                finish();
            }
        });
        tahmkench1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.tahmkench);
                act2.putExtra("message", "Tahm Kench");
                setResult(10,act2);
                finish();
            }
        });
        taliyah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.taliyah);
                act2.putExtra("message", "Taliyah");
                setResult(10,act2);
                finish();
            }
        });

        talon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.talon);
                act2.putExtra("message", "Talon");
                setResult(10,act2);
                finish();
            }
        });

        taric1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.taric);
                act2.putExtra("message", "Taric");
                setResult(10,act2);
                finish();
            }
        });
        teemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.teemo);
                act2.putExtra("message", "Teemo");
                setResult(10,act2);
                finish();
            }
        });
        thresh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.thresh);
                act2.putExtra("message", "Thresh");
                setResult(10,act2);
                finish();
            }
        });
        tristana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.tristana);
                act2.putExtra("message", "Tristana");
                setResult(10,act2);
                finish();
            }
        });
        trunde1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.trundle);
                act2.putExtra("message", "Trundle");
                setResult(10,act2);
                finish();
            }
        });
        tryndamare1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.tryndamere);
                act2.putExtra("message", "Tryndamere");
                setResult(10,act2);
                finish();
            }
        });
        twistedfate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.twistedfate);
                act2.putExtra("message", "Twisted Fate");
                setResult(10,act2);
                finish();
            }
        });
        twitch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.twitch);
                act2.putExtra("message", "Twitch");
                setResult(10,act2);
                finish();
            }
        });
        udyr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.udyr);
                act2.putExtra("message", "Udyr");
                setResult(10,act2);
                finish();
            }
        });
        urgot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.urgot);
                act2.putExtra("message", "Urgot");
                setResult(10,act2);
                finish();
            }
        });
        varus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.varus);
                act2.putExtra("message", "Varus");
                setResult(10,act2);
                finish();
            }
        });
        vayne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.vayne);
                act2.putExtra("message", "Vayne");
                setResult(10,act2);
                finish();
            }
        });
        veigar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.veigar);
                act2.putExtra("message", "Veigar");
                setResult(10,act2);
                finish();
            }
        });
        velkoz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.velkoz);
                act2.putExtra("message", "Vel'Koz");
                setResult(10,act2);
                finish();
            }
        });
        vi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.vi);
                act2.putExtra("message", "Vi");
                setResult(10,act2);
                finish();
            }
        });
        viktor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.viktor);
                act2.putExtra("message", "Viktor");
                setResult(10,act2);
                finish();
            }
        });
        vladimir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.vladimir);
                act2.putExtra("message", "Vladimir");
                setResult(10,act2);
                finish();
            }
        });
        volibear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.volibear);
                act2.putExtra("message", "Volibear");
                setResult(10,act2);
                finish();
            }
        });
        warwick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.warwick);
                act2.putExtra("message", "Warwick");
                setResult(10,act2);
                finish();
            }
        });
        wukong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.wukong);
                act2.putExtra("message", "Wukong");
                setResult(10,act2);
                finish();
            }
        });
        xayah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.xayah);
                act2.putExtra("message", "Xayah");
                setResult(10,act2);
                finish();
            }
        });
        xerath1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.xerath);
                act2.putExtra("message", "Xerath");
                setResult(10,act2);
                finish();
            }
        });
        xinzhao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.xinzhao);
                act2.putExtra("message", "Xin Zhao");
                setResult(10,act2);
                finish();
            }
        });
        yasuo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.yasuo);
                act2.putExtra("message", "Yasuo");
                setResult(10,act2);
                finish();
            }
        });
        yorick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.yorick);
                act2.putExtra("message", "Yorick");
                setResult(10,act2);
                finish();
            }
        });
        zac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.zac);
                act2.putExtra("message", "Zac");
                setResult(10,act2);
                finish();
            }
        });
        zed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.zed);
                act2.putExtra("message", "Zed");
                setResult(10,act2);
                finish();
            }
        });
        ziggs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.ziggs);
                act2.putExtra("message", "Ziggs");
                setResult(10,act2);
                finish();
            }
        });
        zilean1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.zilean);
                act2.putExtra("message", "Zilean");
                setResult(10,act2);
                finish();
            }
        });
        zyra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act2= new Intent(pickchamp.this,MainActivity.class);
                act2.putExtra("myImageResource", R.drawable.zyra);
                act2.putExtra("message", "Zyra");
                setResult(10,act2);
                finish();
            }
        });



    }}
