package healthzone.com.example.kuldeep.healthzone;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Yoga extends ActionBarActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        btn1=(Button)findViewById(R.id.button17);
        btn2=(Button)findViewById(R.id.button18);
        btn3=(Button)findViewById(R.id.button19);
        btn4=(Button)findViewById(R.id.button20);
        btn5=(Button)findViewById(R.id.button21);
        btn6=(Button)findViewById(R.id.button22);
        btn7=(Button)findViewById(R.id.button23);
        btn8=(Button)findViewById(R.id.button24);
        btn9=(Button)findViewById(R.id.button25);
        btn10=(Button)findViewById(R.id.button26);
        btn11=(Button)findViewById(R.id.button27);
        btn12=(Button)findViewById(R.id.button28);
        btn13=(Button)findViewById(R.id.button29);
        btn14=(Button)findViewById(R.id.button30);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Yoga.this,YogaImage.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn2");
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this,YogaImage.class);
                intent.putExtra("value","btn3");
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn4");
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn5");
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn6");
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn7");
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this,YogaImage.class);
                intent.putExtra("value","btn8");
                startActivity(intent);
            }
        });    btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this,YogaImage.class);
                intent.putExtra("value","btn9");
                startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this,YogaImage.class);
                intent.putExtra("value","btn10");
                startActivity(intent);
            }
        });    btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn11");
                startActivity(intent);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn12");
                startActivity(intent);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn13");
                startActivity(intent);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Yoga.this, YogaImage.class);
                intent.putExtra("value","btn14");
                startActivity(intent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_yoga, menu);
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
