package com.example.sanjay.studentreminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by sanjay on 15-03-2017.
 */

public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread background = new Thread() {
            public void run() {

                try {

                    sleep(5*1000);


                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                }
                catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();


    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}

