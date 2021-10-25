package com.example.uts_pbp_b_kelompok_2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent)
    {
        String message = intent.getStringExtra("ToastMessage");
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}