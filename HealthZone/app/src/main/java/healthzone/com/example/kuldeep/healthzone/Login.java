package healthzone.com.example.kuldeep.healthzone;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class Login extends Activity implements View.OnClickListener{
EditText edt1,edt2;
    Button btn;

    String f1,f2;
    private DatabaseHelper dp;
    static final String[] text={"Welcome new user in Healthzone"};
    // static String[] text2;
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dp=new DatabaseHelper(this);
        edt1=(EditText)findViewById(R.id.loginEmail);
        edt2=(EditText)findViewById(R.id.loginPassword);

        SharedPreferences sp=getSharedPreferences("HealthLogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=sp.edit();
        edit.putString("username",edt1.getText().toString());
        edit.putString("password",edt2.getText().toString());
        edit.apply();

        btn=(Button)findViewById(R.id.login);
        btn.setOnClickListener(this);
        tts = new TextToSpeech(Login.this,new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int status) {
                if(status!= TextToSpeech.ERROR)
                {
                    tts.setLanguage(Locale.US);

                }
            }
        });
    }
    @Override
    protected void onPause() {

        if(tts!=null)

        {
            tts.stop();
            tts.shutdown();
        }
        super.onPause();
    }



    public void register() {
        f1 = edt1.getText().toString().trim();
        f2 = edt2.getText().toString().trim();

        if (!valid()) {
        } else {

            Cursor crr=dp.getData(f1);

                Boolean check=false;
                while(crr.moveToNext()) {
                    if (crr.getString(1).equals(f1) && crr.getString(2).equals(f2)) {
                        check = true;
                    }
                }
                if(check)
                {
                    Random r = new Random();

                    String random = text[r.nextInt(1)];
                    tts.speak(random, TextToSpeech.QUEUE_FLUSH, null);
                    Uri sound= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                    long[] pattern={500,500,500};
                    Intent intent=new Intent();
                    PendingIntent pIntent=PendingIntent.getActivity(Login.this,0,intent,0);
                    Notification nt=new Notification.Builder(Login.this)
                            .setTicker("Ticker Title")
                            .setContentTitle("HealthZone")
                            .setContentText("Latest information are given you in this app through notification...")
                            .setSmallIcon(R.drawable.newlogo)
                            .setVibrate(pattern)
                            .setSound(sound)
                            .setContentIntent(pIntent).getNotification();
                    nt.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager nf=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                    nf.notify(0,nt);
                        Intent intt=new Intent(Login.this,MainActivity.class);
                       startActivity(intt);
                }
                else
                {
                    Toast.makeText(this,"Not Match",Toast.LENGTH_SHORT).show();
                }




        }
    }
    public boolean valid()
    {
        boolean value=true;

        if(f1.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(f1).matches())
        {
            edt1.setError("Please Enter Valid email");
            value=false;
        }
        else if(f2.isEmpty())
        {
            edt2.setError("Please Enter password");
            value=false;
        }

        return value;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
register();
    }
}
