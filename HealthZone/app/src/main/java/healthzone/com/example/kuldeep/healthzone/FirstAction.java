package healthzone.com.example.kuldeep.healthzone;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

/**
 * Created by kuldeep on 11/9/2016.
 */
public class FirstAction  extends Activity implements View.OnClickListener {
Button btn;
    static final String[] text={"Welcome new user in Healthzone"};
   // static String[] text2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_action);
        btn= (Button) findViewById(R.id.startButton);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {


               Intent intent2=new Intent(FirstAction.this,RegisterChoice.class);
             startActivity(intent2);
    }
}

