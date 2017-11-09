package healthzone.com.example.kuldeep.healthzone;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HealthCare extends ActionBarActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
    HealthCareImages cmg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care);
        btn1=(Button)findViewById(R.id.abs);
        btn2=(Button)findViewById(R.id.bicep);
        btn3=(Button)findViewById(R.id.calf);
        btn4=(Button)findViewById(R.id.chests);
        btn5=(Button)findViewById(R.id.foreham);
        btn6=(Button)findViewById(R.id.middleBack);
        btn7=(Button)findViewById(R.id.legs);
        btn8=(Button)findViewById(R.id.neck);
        btn9=(Button)findViewById(R.id.quadricep);
        btn10=(Button)findViewById(R.id.Shoulder);
        btn11=(Button)findViewById(R.id.trap);
        btn12=(Button)findViewById(R.id.tricep);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HealthCare.this,HealthCareImages.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn2");
                startActivity(intent);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn3");
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn4");
                startActivity(intent);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn5");
                startActivity(intent);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn6");
                startActivity(intent);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn7");
                startActivity(intent);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn8");
                startActivity(intent);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn9");
                startActivity(intent);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn10");
                startActivity(intent);

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn11");
                startActivity(intent);

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HealthCare.this, HealthCareImages.class);
                intent.putExtra("value","btn12");
                startActivity(intent);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_health_care, menu);
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
