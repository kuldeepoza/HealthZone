package healthzone.com.example.kuldeep.healthzone;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class UserDetail extends ActionBarActivity {
    TextView tv;
Button btn;
    EditText edt1,edt2,edt3;
    Spinner s1,s2,s3,s4,s5,s6,s7;
    String f1,f2,f3;
    CheckBox cb1,cb2,cb3;
    SharedPreferences sp;
    private DatabaseHelper dp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        dp=new DatabaseHelper(this);
        tv = (TextView) findViewById(R.id.textView6);
        btn = (Button) findViewById(R.id.userDetailId);
        edt1 = (EditText) findViewById(R.id.editText);
        edt2 = (EditText) findViewById(R.id.editText2);
        edt3 = (EditText) findViewById(R.id.editText3);
        s1=(Spinner)findViewById(R.id.spinner1);
        s2=(Spinner)findViewById(R.id.spinner2);
        s3=(Spinner)findViewById(R.id.spinner3);
        s4=(Spinner)findViewById(R.id.spinner4);
        s6=(Spinner)findViewById(R.id.spinner6);
        s7=(Spinner)findViewById(R.id.spinner7);
        cb1=(CheckBox)findViewById(R.id.checkBox);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);

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

        SharedPreferences sp=getSharedPreferences("UserData", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=sp.edit();
        edit.putString("name",f1);
        edit.putString("age",f2);
        edit.putString("weight",f3);
        edit.putString("Disease",s1.getSelectedItem().toString().trim());
        edit.putString("Height",s2.getSelectedItem().toString().trim());
        edit.putString("Choice",s3.getSelectedItem().toString().trim());
        edit.putString("Extra",s4.getSelectedItem().toString().trim());
        edit.putString("incDecWe",s6.getSelectedItem().toString().trim());
        edit.putString("incDecWe",s7.getSelectedItem().toString().trim());

        if(cb1.isChecked())
        {
            edit.putString("check1","true");
        }
        else {
            edit.putString("check1","false");
        }
        if(cb2.isChecked())
        {
            edit.putString("check2","true");
        }
        else
        {
            edit.putString("check2","false");
        }
        if(cb3.isChecked())
        {
            edit.putString("check3","true");
        }
        else
        {
            edit.putString("check3","false");
        }
        edit.apply();


        if (!valid()) {
            //    Toast.makeText(this,"There are some Problem",Toast.LENGTH_SHORT).show();
        } else {
            Boolean result =  dp.insertUserDetail(f1,f2,f3,s1.getSelectedItem().toString().trim(),
                    s2.getSelectedItem().toString().trim(),s3.getSelectedItem().toString().trim(),
                    s4.getSelectedItem().toString().trim(),
                    s6.getSelectedItem().toString().trim(),s7.getSelectedItem().toString().trim());

            if(result)
            {



                startActivity(new Intent(UserDetail.this, Chart.class));
            }
            else
            {
                Toast.makeText(this, "Not Success", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(UserDetail.this, Chart.class));
            }


        }
    }
    public boolean valid()
    {
        boolean value=true;

        if(f1.isEmpty() || f1.length()>30)
        {
            edt1.setError("Please Enter Name");
            value=false;
        }
        else if(f2.isEmpty() || f2.length()>2)
        {
            edt2.setError("Please Enter Age");
            value=false;
        }
        else if(f3.isEmpty() || f3.length()>2 )
        {
            edt3.setError("Please Enter Weight");
            value=false;
        }

        return value;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_detail, menu);
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
