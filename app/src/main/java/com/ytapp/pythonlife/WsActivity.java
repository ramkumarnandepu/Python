package com.ytapp.pythonlife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


public class WsActivity extends AppCompatActivity {


    YouTubePlayerView youTubePlayerViewws,youTubePlayerViewws1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ws);



        youTubePlayerViewws = findViewById(R.id.youtube_player_viewws);
        getLifecycle().addObserver(youTubePlayerViewws);
        youTubePlayerViewws1 = findViewById(R.id.youtube_player_viewws1);
        getLifecycle().addObserver(youTubePlayerViewws1);

    }

}