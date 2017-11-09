package healthzone.com.example.kuldeep.healthzone;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;



/**
 * Created by kuldeep on 11/18/2016.
 */
public class DailyNotification extends BroadcastReceiver {

    @Override
    public void onReceive(Context paramContext, Intent paramIntent) {
        Uri sound= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        long[] pattern={500,500,500};
        NotificationManager notificationManager = (NotificationManager) paramContext.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent rep = new Intent(paramContext, MainActivity.class);
        rep.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(
                paramContext, 100, rep,
                PendingIntent.FLAG_UPDATE_CURRENT);
        Notification.Builder nt = new Notification.Builder(paramContext)
                .setContentIntent(pendingIntent)
                .setTicker("Ticker Title")
                .setContentTitle("HealthZone")
                .setContentText("Eat Your breakfast..")
                .setVibrate(pattern)
                .setSound(sound)
                .setSmallIcon(R.drawable.newlogo)
                .setAutoCancel(true);
        notificationManager.notify(100, nt.build());
    }
}
