package com.example.cristian.mytoolbox;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.NotificationCompat;
import android.widget.Toast;

/**
 * Created by Cristian on 13/11/2017.
 */


public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent)
    {
        NotificationManager NM = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        Intent repeating = new Intent(context, Alarma.class);
        repeating.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent PI = PendingIntent.getActivity(context,100,repeating,PendingIntent.FLAG_UPDATE_CURRENT);
        android.support.v4.app.NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
                .setContentIntent(PI)
                .setSmallIcon(R.drawable.ic_alarma)
                .setContentTitle("Alarma")
                .setContentText("La alarma esta activada")
                .setAutoCancel(true);

        NM.notify(100,builder.build());


        Toast.makeText(context, "La alarma se esta ejecutando", Toast.LENGTH_LONG).show();
        Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        if (alarmUri == null)
        {
            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, alarmUri);
        ringtone.play();
    }




}