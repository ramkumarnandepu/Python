package com.ytapp.pythonlife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    ImageView orgback;
    CardView pythoncard, rmap, dr, flask, mongocard, opencv, django, ml, dl, ws, ds, c, pypro, mlpro, doubts, ocpro, wspro,dock,jav,ai,htm,it,devop,git,androi,cmn;
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        orgback = findViewById(R.id.orgback);
        pythoncard = findViewById(R.id.pyhtoncard);
        rmap = findViewById(R.id.roadmap);
        dr = findViewById(R.id.djangorest);
        flask = findViewById(R.id.flaskcard);
        mongocard = findViewById(R.id.mongodb);
        opencv = findViewById(R.id.opencv);
        django = findViewById(R.id.django);
        ml = findViewById(R.id.mlcard);
        dl = findViewById(R.id.dlcard);
        ws = findViewById(R.id.webscrapping);
        ds = findViewById(R.id.ds);
        c = findViewById(R.id.c);
        pypro = findViewById(R.id.pythonpro);
        mlpro = findViewById(R.id.mpro);
        doubts = findViewById(R.id.doubts);
        ocpro = findViewById(R.id.ocpro);
        wspro = findViewById(R.id.wspro);
        dock = findViewById(R.id.docker);
        jav = findViewById(R.id.Java);
        it = findViewById(R.id.it);
        ai = findViewById(R.id.Ai);
        git = findViewById(R.id.git);
        androi = findViewById(R.id.android);
        cmn = findViewById(R.id.comnetwork);
        devop = findViewById(R.id.devops);
        htm = findViewById(R.id.html);

        ocpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=RK0BlRBcNKI&list=PLbMVPNscUopReIPOWXoCz-0tUkykcVOWg"));
                    startActivity(intent);
                }


        });


        wspro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=grLvq8T7e6M&list=PLbMVPNscUopSCccfxKH-JoLlC82qovN9r"));
                    startActivity(intent);
                }


        });


        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=bE-fa_awXk4&list=PLbMVPNscUopT-F2Cb9gPzth38S6SambFU"));
                    startActivity(intent);
                }


        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=RSt1cJVhP6o&list=PLbMVPNscUopR-0U11cG6lZ5mmQpdoigI0"));
                    startActivity(intent);
                }


        });

        pypro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=uGcty6WFf7o&list=PLbMVPNscUopStOJX4rxuJCu2R2mtzmUn0"));
                    startActivity(intent);
                }


        });

        mlpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=FDMkIbMoMtI&list=PLbMVPNscUopSXXPS2zZ7HopmQRWTaUBPI"));
                    startActivity(intent);
                }


        });

        doubts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=D2h8T6FRGhQ&list=PLbMVPNscUopR4wTAcVoTQgZXLOa4T7_8W"));
                    startActivity(intent);
                }


        });


        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=WBZvozs2rq0&list=PLbMVPNscUopSlRw3TSj3Dq9cbzW7AK97q"));
                    startActivity(intent);
                }

        });

        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=iQU5WDNhK20&list=PLbMVPNscUopRi0Xm0sIMrFgcUt9ghbnm_"));
                    startActivity(intent);
                }



        });

        ws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(HomeActivity.this, WsActivity.class);
                    startActivity(intent);
                }


        });

        django.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=A8OvxYGFupU&list=PLbMVPNscUopRV2oGsRpNeYECVyZ-6KP9v"));
                    startActivity(intent);
                }


        });


        pythoncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(HomeActivity.this, PythonActivity.class);
                    startActivity(intent);
                }


        });

        rmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=RHIdOM9edEg&list=PLbMVPNscUopRRLmf9LB1Tv9O2FTJwOZNC&index=1"));
                    startActivity(intent);
                }

        });


        dr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=wdw3K7FzWqE&list=PLbMVPNscUopSl8J6AoYlDfnsIh-Em_qT4"));
                    startActivity(intent);
                }

        });


        flask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=oQWkuJhSMCQ&list=PLbMVPNscUopQM1LHytgb2ePWH9QSZfnBv"));
                    startActivity(intent);
                }

        });


        mongocard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=ZQuQ-wHuPlg&list=PLbMVPNscUopQbvW-xJqm_m6td3sHxzPvn"));
                    startActivity(intent);
                }

        });


        opencv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=6lIf_zZVuYc&list=PLbMVPNscUopSMQQ0JjULjYejx_GX2BrFD"));
                    startActivity(intent);
                }
        });

        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=fwMMBaXIpqQ&list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P&index=1"));
                    startActivity(intent);
                }
        });
        jav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=AzJEnN2pK_I&list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P&index=3"));
                    startActivity(intent);
                }
        });
        devop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=3j5tWYinpFM&list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P&index=4"));
                    startActivity(intent);
                }
        });
        htm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=7jaQv6xfQjY&list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P&index=11"));
                    startActivity(intent);
                }
        });
        cmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=Z09ayKIhDuM&list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P&index=16"));
                    startActivity(intent);
                }
        });
        androi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=7ZLKpN8vXLo&list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P&index=17"));
                    startActivity(intent);
                }
        });
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=Uql4qdk2XiM&list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P&index=18"));
                    startActivity(intent);
                }
        });
        dock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=72LG34wIWI8&list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P&index=19"));
                    startActivity(intent);
                }
        });
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLbMVPNscUopTabwrwhZxVbvCoofSbe86P"));
                    startActivity(intent);
                }
        });



        orgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                    startActivity(intent);
                }

        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.yt:

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/c/PythonLifetelugu"));
                startActivity(intent);
                return true;

            case R.id.insta:

                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.instagram.com/pythonlifetelugu/"));
                startActivity(intent1);
                return true;

            case R.id.telegram:

                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://t.me/joinchat/UJSjExb7-Khs_0MRig9_Ng"));
                startActivity(intent2);
                return true;

            case R.id.fb:

                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://m.facebook.com/Python-life-telugu-107111387790463"));
                startActivity(intent3);
                return true;

            case R.id.ln:

                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.linkedin.com/in/kiran-sagar-a00a761b2"));
                startActivity(intent4);
                return true;

            case R.id.gh:

                Intent intent5 = new Intent(Intent.ACTION_VIEW);
                intent5.setData(Uri.parse("https://github.com/kiransagar1"));
                startActivity(intent5);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

