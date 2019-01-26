package com.example.sanjay.studentreminder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by sanjay on 14-03-2017.
 */

public class attendance extends Activity  {
    EditText cp, ch, perc;
    Button cal;
    double num1, num2, num3, per, r;
    int i = 0, x = 1;


   WebView offweb;
    Button apply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance);
       // offweb=(WebView)findViewById(R.id.offweb);
        //offweb.getSettings().setJavaScriptEnabled(true);
        //offweb.loadUrl("https://www.amazon.in/");
        apply=(Button) findViewById(R.id.apply);
        addListenerOnButton();




    }


    public void addListenerOnButton() {

        final Context context = this;
        Toast.makeText(attendance.this,"your attendance is"+per,Toast.LENGTH_LONG ).show();

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(attendance.this,"Submited",Toast.LENGTH_LONG ).show();
            }
        })

        ;



    }
}
