package healthzone.com.example.kuldeep.healthzone;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.util.Calendar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;


public class ExerciseReminder extends ActionBarActivity {
    TextView t1,t2,t3,t4;
    SharedPreferences sp;
    private int  mHour, mMinute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_reminder);
        t1=(TextView)findViewById(R.id.textView25);
        t2=(TextView)findViewById(R.id.textView27);
        t3=(TextView)findViewById(R.id.textView29);
        t4=(TextView)findViewById(R.id.textView31);


        SharedPreferences sp1=getSharedPreferences("ExerciseBreak", Context.MODE_PRIVATE);
        int hour=sp1.getInt("ex1",0);
        int min=sp1.getInt("ex2",0);

        if(hour==0 && min==0)
        {
            t1.setText("00" + ":" +"00");
        }
        else
        {
            t1.setText(hour + ":" + min);
        }
        SharedPreferences sp2=getSharedPreferences("ExerciseLunch", Context.MODE_PRIVATE);
        int hours=  sp2.getInt("ex3",00);
        int mins=sp2.getInt("ex4",00);
        if(hours==0 && mins==0)
        {
            t2.setText("00" + ":" +"00");
        }
        else
        {
            t2.setText(hours + ":" + mins);
        }
        SharedPreferences sp3=getSharedPreferences("ExerciseSnacks", Context.MODE_PRIVATE);
        int hou3=  sp3.getInt("ex5",00);
        int mi4=sp3.getInt("ex6",00);
        if(hou3==0 && mi4==0)
        {
            t3.setText("00" + ":" +"00");
        }
        else
        {
            t3.setText(hou3 + ":" +mi4);
        }
        SharedPreferences sp4=getSharedPreferences("ExerciseDinner", Context.MODE_PRIVATE);
        int hour45=sp4.getInt("ex7",00);
        int min45=sp4.getInt("ex8",00);
        if(hour45==0 && min45==0)
        {
            t4.setText("00" + ":" +"00");
        }
        else
        {
            t4.setText(hour45 + ":" +min45);
        }




        t1.setOnClickListener(new View.OnClickListener() {
            @TargetApi(24)
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                // Launch Time Picker Dialog
                TimePickerDialog tpd = new TimePickerDialog(ExerciseReminder.this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {
                                SharedPreferences sp=getSharedPreferences("ExerciseBreak", Context.MODE_PRIVATE);
                                SharedPreferences.Editor edit=sp.edit();
                                edit.putInt("ex1", hourOfDay);
                                edit.putInt("ex2", minute);
                                edit.apply();


                                t1.setText(hourOfDay + ":" + minute);
                                setTime(hourOfDay,minute);

                            }
                        }, mHour, mMinute, false);
                tpd.show();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @TargetApi(24)
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                // Launch Time Picker Dialog
                TimePickerDialog tpd = new TimePickerDialog(ExerciseReminder.this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {
                                SharedPreferences sp2=getSharedPreferences("ExerciseLunch", Context.MODE_PRIVATE);
                                SharedPreferences.Editor edit=sp2.edit();
                                edit.putInt("ex3", hourOfDay);
                                edit.putInt("ex4", minute);
                                edit.apply();


                                t2.setText(hourOfDay + ":" + minute);
                                setTime(hourOfDay,minute);
                            }
                        }, mHour, mMinute, false);
                tpd.show();
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @TargetApi(24)
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                // Launch Time Picker Dialog
                TimePickerDialog tpd = new TimePickerDialog(ExerciseReminder.this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {
                                SharedPreferences sp3=getSharedPreferences("ExerciseSnacks", Context.MODE_PRIVATE);
                                SharedPreferences.Editor edit=sp3.edit();
                                edit.putInt("ex5", hourOfDay);
                                edit.putInt("ex6", minute);
                                edit.apply();


                                t3.setText(hourOfDay + ":" + minute);
                                setTime(hourOfDay,minute);
                            }
                        }, mHour, mMinute, false);
                tpd.show();
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @TargetApi(24)
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                // Launch Time Picker Dialog
                TimePickerDialog tpd = new TimePickerDialog(ExerciseReminder.this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {
                                SharedPreferences sp4=getSharedPreferences("ExerciseDinner", Context.MODE_PRIVATE);
                                SharedPreferences.Editor edit=sp4.edit();
                                edit.putInt("ex7", hourOfDay);
                                edit.putInt("ex8", minute);
                                edit.apply();


                                t4.setText(hourOfDay + ":" + minute);
                                setTime(hourOfDay,minute);
                            }
                        }, mHour, mMinute, false);
                tpd.show();
            }
        });

    }

    @TargetApi(24)
    public void setTime(int hourOfDay,int minute)
    {

        Calendar calendar = Calendar.getInstance();
        calendar.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(java.util.Calendar.MINUTE, minute);
        calendar.set(java.util.Calendar.SECOND, 00);
        Intent intent=new Intent(getApplicationContext(),DailyNotification.class);
        PendingIntent pendingIntent= PendingIntent.getBroadcast(
                getApplicationContext(), 100,intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exercise_reminder, menu);
        return true;
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
}
