package com.example.sanjay.studentreminder;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

/**
 * Created by sanjay on 14-03-2017.
 */

public class useful_links extends Activity {

    WebView officeweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.useful_links);
        officeweb=(WebView)findViewById(R.id.officeweb);
        officeweb.getSettings().setJavaScriptEnabled(true);
        officeweb.loadUrl("http://kitsw.hol.es/Modules/Time-Table/Student/");
    }
}
