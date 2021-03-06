package com.example.papadakis.demo_thesis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Kids1Activity extends AppCompatActivity {

    private Button button, Home;
    private ImageButton SecondImage, LastImage, FirstImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids1);

        //koumpi gia kids2
        button = (Button) findViewById(R.id.Next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openKids2Activity();
            }
        });

        //koumpi gia paixnidi,eikona 1
        SecondImage = (ImageButton) findViewById(R.id.FirstImage);
        SecondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Kids1Activity.this, "Αυτό θα γίνει δεύτερο!", Toast.LENGTH_LONG).show();
            }
        });

        //koumpi gia paixnidi,eikona 2
        LastImage = (ImageButton) findViewById(R.id.SecondImage);
        LastImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Kids1Activity.this, "Αυτό θα γίνει τελευταίο!", Toast.LENGTH_LONG).show();
            }
        });

        //koumpi gia paixnidi,eikona 3
        FirstImage = (ImageButton) findViewById(R.id.LastImage);
        FirstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Kids1Activity.this, "Αυτό θα γίνει πρώτο!", Toast.LENGTH_LONG).show();
            }
        });

        //koumpi gia arxikh
        Home = (Button) findViewById(R.id.Home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openUserActivity();
            }
        });

        //8etoume enan media player pou 8a paixei ton katallhlo hxo
        final MediaPlayer secondSoundMediaPlayer = MediaPlayer.create(this, R.raw.second);

        ImageButton SecondSound = (ImageButton) this.findViewById(R.id.SecondSound);

        SecondSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondSoundMediaPlayer.start();
            }
        });

        //8etoume enan media player pou 8a paixei ton katallhlo hxo
        final MediaPlayer lastSoundMediaPlayer = MediaPlayer.create(this, R.raw.last);

        ImageButton LastSound = (ImageButton) this.findViewById(R.id.FirstSound);

        LastSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastSoundMediaPlayer.start();
            }
        });

        //8etoume enan media player pou 8a paixei ton katallhlo hxo
        final MediaPlayer firstSoundMediaPlayer = MediaPlayer.create(this, R.raw.first);

        ImageButton FirstSound = (ImageButton) this.findViewById(R.id.LastSound);

        FirstSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstSoundMediaPlayer.start();
            }
        });

    }

    //Dhmiourgoume thn activity twn kids2
    public void openKids2Activity(){
        Intent intent = new Intent(this, Kids2Activity.class);
        startActivity(intent);
    }

    //Epistrefoume sthn arxikh
    public void openUserActivity(){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }

}
