package com.example.sanjay.studentreminder;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by sanjay on 16-03-2017.
 */

public class aboutfrag extends Activity {
    WebView feedweb  ;

    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        feedweb=(WebView)findViewById(R.id.feedweb);
        feedweb.getSettings().setJavaScriptEnabled(true);
        feedweb.loadUrl("http://kitsw.hol.es/");
    }
}
