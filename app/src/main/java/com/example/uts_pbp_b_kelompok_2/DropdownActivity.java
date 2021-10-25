package com.example.uts_pbp_b_kelompok_2;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import static com.example.uts_pbp_b_kelompok_2.MyApplication.CHANNEL_1_ID;
import static com.example.uts_pbp_b_kelompok_2.MyApplication.CHANNEL_2_ID;

public class DropdownActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationManager;

    private EditText editTextMessage;
    private Button Submit,ShowLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dropdown_activity);

        notificationManager = NotificationManagerCompat.from(this);
        Submit = (Button)findViewById(R.id.submit);
        ShowLocation= (Button)findViewById(R.id.ShowLocation);


        editTextMessage = findViewById(R.id.edit_text_message);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DropdownActivity.this,ViewActivity.class);
                startActivity(intent1);
            }

        });

        ShowLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DropdownActivity.this,GeolocationActivity.class);
                startActivity(intent2);
            }

        });

    }

    public void sendOnChannel1(View v){

        Intent activityIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,activityIntent, 0);

        Intent broadcastIntent = new Intent(this,NotificationReceiver.class);
        broadcastIntent.putExtra("toastNessage", "Order diterima");
        PendingIntent actionIntent = PendingIntent.getBroadcast(this,0, broadcastIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification notification = new NotificationCompat.Builder(this, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_baseline_looks_one_24)
                .setContentText("Order diterima")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setColor(Color.BLUE)
                .setContentIntent(contentIntent)
                .setAutoCancel(true)
                .setOnlyAlertOnce(true)
                .build();
        notificationManager.notify(1, notification);
    }

}
