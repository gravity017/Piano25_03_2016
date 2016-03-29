package ice_pbru.dangchoung.natchanon.piano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //2. Explicit

    //access type    name
    private Button DoButton;
    private Button ReButton;
    private Button MeButton;
    private Button FaButton;
    private Button SoButton;
    private Button LaButton;
    private Button TeButton;
    private Button DooButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3.Bind Windget
        bindwidget();

        //4. Button Controller
        buttoncontroller();


    }//Main Method

    private void buttoncontroller() {

        DoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer DoMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song1);
                DoMediaPlayer.start();

                DoMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

            }
        });

        ReButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ReMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song2);
                ReMediaPlayer.start();
                ReMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        MeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer MePlayer = MediaPlayer.create(getBaseContext(),R.raw.song3);
                MePlayer.start();
                MePlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });


            }
        });

        FaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer FaMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song4);
                FaMediaPlayer.start();
                FaMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        SoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer SoMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song5);
                SoMediaPlayer.start();
                SoMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        LaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer LaMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song6);
                LaMediaPlayer.start();
                LaMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        TeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer TeMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song7);
                TeMediaPlayer.start();
                TeMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        DooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=77suwtdWzpk"));
                startActivity(intent);
            }
        });

    }// Button Controller

    private void bindwidget() {

        DoButton = (Button) findViewById(R.id.button);
        ReButton = (Button) findViewById(R.id.button2);
        MeButton = (Button) findViewById(R.id.button3);
        FaButton = (Button) findViewById(R.id.button4);
        SoButton = (Button) findViewById(R.id.button5);
        LaButton = (Button) findViewById(R.id.button6);
        TeButton = (Button) findViewById(R.id.button7);
        DooButton = (Button) findViewById(R.id.button8);

    }// bind widget

}//Main Class

// ขั้นตอนการทำ
//1. หาขอบเขต
//2. Explicit
//3. Bind Widget
//4. Button Controller
