package com.ytapp.pythonlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {

    YouTubePlayerView youTubePlayerView,youTubePlayerView1,youTubePlayerView2,youTubePlayerView3,youTubePlayerView4,
            youTubePlayerView5,youTubePlayerView6,youTubePlayerView7,youTubePlayerView8,youTubePlayerView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView1 = findViewById(R.id.youtube_player_view1);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView2 = findViewById(R.id.youtube_player_view2);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView3 = findViewById(R.id.youtube_player_view3);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView4 = findViewById(R.id.youtube_player_view4);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView5 = findViewById(R.id.youtube_player_view5);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView6 = findViewById(R.id.youtube_player_view6);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView7 = findViewById(R.id.youtube_player_view7);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView8 = findViewById(R.id.youtube_player_view8);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView9 = findViewById(R.id.youtube_player_view9);
        getLifecycle().addObserver(youTubePlayerView);
    }

}