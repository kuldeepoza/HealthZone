package healthzone.com.example.kuldeep.healthzone;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Signup extends Activity {
    EditText edt1,edt2,edt3;
    Button btn;
    String f1,f2,f3;
private DatabaseHelper dp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        dp=new DatabaseHelper(this);
        edt1=(EditText)findViewById(R.id.signUpEmail);
        edt2=(EditText)findViewById(R.id.signUpPassword);
        edt3=(EditText)findViewById(R.id.signUpPhone);
        btn=(Button)findViewById(R.id.signup);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    public void register() {
        f1 = edt1.getText().toString().trim();
        f2 = edt2.getText().toString().trim();
        f3 = edt3.getText().toString().trim();

        if (!valid()) {
          //    Toast.makeText(this,"There are some Problem",Toast.LENGTH_SHORT).show();
        } else {
          Boolean result=  dp.insertData(f1,f3,f2);

            if(result)
            {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("sms:8401156681"));
                smsIntent.putExtra("sms_body", "Hello kuldeep");
                startActivity(smsIntent);
           //     Toast.makeText(this,"Insert Success",Toast.LENGTH_SHORT).show();
                Intent intt=new Intent(Signup.this,Login.class);
                startActivity(intt);
            }
            else
            {
                Toast.makeText(this,"Not Success",Toast.LENGTH_SHORT).show();
            }


        }
    }

 /*   public void sendSMS()
    {

        Intent smsIntent=new Intent(Intent.ACTION_VIEW);
        smsIntent.setData(Uri.parse("smsTo:"));
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("address",new String("8401156681"));
        smsIntent.putExtra("sms-body","Test");
        startActivity(smsIntent);
        finish();
        Log.i("Finishhhhhhh","");


    }*/

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
        else if(f3.isEmpty() || f3.length()>11)
        {
            edt3.setError("Please Enter Number and less then 10");
            value=false;
        }

        return value;
    }


}
