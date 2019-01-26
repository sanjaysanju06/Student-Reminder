package com.example.sanjay.studentreminder;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sanjay on 14-03-2017.
 */

public class library extends Activity {
    Button remind;
    EditText book;
    WebView libview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//library
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);
     //   libview=(WebView)findViewById(R.id.libweb);
     //   libview.getSettings().setJavaScriptEnabled(true);
     //   libview.loadUrl("https://www.youtube.com/");

       // book = (EditText) findViewById(R.id.editText2);
        //remind = (Button) findViewById(R.id.button2);
      //  remind.setOnClickListener(new myclick());

    }

    class myclick implements View.OnClickListener {

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            scheduleNotification(getNotification("renewal the book" + book), 5000);
        }

    }

    private void scheduleNotification(Notification notification, int delay) {

        Intent notificationIntent = new Intent(this, alarm.class);
        notificationIntent.putExtra(alarm.NOTIFICATION_ID, 1);
        notificationIntent.putExtra(alarm.NOTIFICATION, notification);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        long futureInMillis = SystemClock.elapsedRealtime() + delay;
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, futureInMillis, pendingIntent);
    }


    @SuppressLint("NewApi")
    private Notification getNotification(String content) {
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("library Notification");
        builder.setContentText(content);
        builder.setSmallIcon(R.drawable.side_nav_bar);
        //  builder.setSound(sound);
        // builder.setVibrate(pattern);
        builder.setDefaults(Notification.DEFAULT_LIGHTS);
        builder.setDefaults(Notification.DEFAULT_SOUND);
        return builder.build();
    }
}