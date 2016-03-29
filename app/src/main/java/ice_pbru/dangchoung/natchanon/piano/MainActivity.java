package ice_pbru.dangchoung.natchanon.piano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


    }//Main Method

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

//1. หาขอบเขต
//2. Explicit
//3. Bind Widget
