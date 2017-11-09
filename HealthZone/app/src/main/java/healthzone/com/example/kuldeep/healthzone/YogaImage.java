package healthzone.com.example.kuldeep.healthzone;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class YogaImage extends ActionBarActivity {
    ImageView im1,im2,im3,im4,im5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_image);
        im1=(ImageView)findViewById(R.id.imageView2);
        im2=(ImageView)findViewById(R.id.imageView3);
        im3=(ImageView)findViewById(R.id.imageView4);
        im4=(ImageView)findViewById(R.id.imageView5);
        im5=(ImageView)findViewById(R.id.imageView6);
        Bundle extras=getIntent().getExtras();
        if(extras!=null) {
            String result = extras.getString("value");
            if (result.equals("btn2")) {
                im1.setImageResource(R.drawable.yoga_belly1);
                im2.setImageResource(R.drawable.yoga_belly2);
                im3.setImageResource(R.drawable.yoga_belly3);
                im4.setImageResource(R.drawable.yoga_belly4);
                im5.setImageResource(R.drawable.yoga_belly5);
            }
            else if(result.equals("btn3")) {
                im1.setImageResource(R.drawable.yoga_chest1);
                im2.setImageResource(R.drawable.yoga_chest2);
                im3.setImageResource(R.drawable.yoga_chest3);
                im4.setImageResource(R.drawable.yoga_chest4);
                im5.setImageResource(R.drawable.yoga_chest5);
            }
            else if(result.equals("btn4")) {
                im1.setImageResource(R.drawable.yoga_hands1);
                im2.setImageResource(R.drawable.yoga_hands2);
                im3.setImageResource(R.drawable.yoga_hands3);
                im4.setImageResource(R.drawable.yoga_hands4);
                im5.setImageResource(R.drawable.yoga_hands5);
            }
            else if(result.equals("btn5")) {
                im1.setImageResource(R.drawable.yoga_heart1);
                im2.setImageResource(R.drawable.yoga_heart2);
                im3.setImageResource(R.drawable.yoga_heart3);
                im4.setImageResource(R.drawable.yoga_heart4);
                im5.setImageResource(R.drawable.yoga_heart5);
            }
            else if(result.equals("btn6")) {
                im1.setImageResource(R.drawable.yoga_kidney1);
                im2.setImageResource(R.drawable.yoga_kidney2);
                im3.setImageResource(R.drawable.yoga_kidney3);
                im4.setImageResource(R.drawable.yoga_kidney4);
                im5.setImageResource(R.drawable.yoga_kidney5);
            }
            else if(result.equals("btn7")) {
                im1.setImageResource(R.drawable.yoga_knees1);
                im2.setImageResource(R.drawable.yoga_knees2);
                im3.setImageResource(R.drawable.yoga_knees3);
                im4.setImageResource(R.drawable.yoga_knees4);
                im5.setImageResource(R.drawable.yoga_knees5);
            }
            else if(result.equals("btn8")) {
                im1.setImageResource(R.drawable.yoga_leg1);
                im2.setImageResource(R.drawable.yoga_leg2);
                im3.setImageResource(R.drawable.yoga_leg3);
                im4.setImageResource(R.drawable.yoga_leg4);
                im5.setImageResource(R.drawable.yoga_leg5);
            }
            else if(result.equals("btn9")) {
                im1.setImageResource(R.drawable.yoga_liver1);
                im2.setImageResource(R.drawable.yoga_liver2);
                im3.setImageResource(R.drawable.yoga_liver3);
                im4.setImageResource(R.drawable.yoga_liver4);
                im5.setImageResource(R.drawable.yoga_liver5);
            }
            else if(result.equals("btn10")) {
                im1.setImageResource(R.drawable.yoga_lungs1);
                im2.setImageResource(R.drawable.yoga_lungs2);
                im3.setImageResource(R.drawable.yoga_lungs3);
                im4.setImageResource(R.drawable.yoga_lungs4);
                im5.setImageResource(R.drawable.yoga_lungs5);
            }
            else if(result.equals("btn11")) {
                im1.setImageResource(R.drawable.yoga_neck1);
                im2.setImageResource(R.drawable.yoga_neck2);
                im3.setImageResource(R.drawable.yoga_neck3);
                im4.setImageResource(R.drawable.yoga_neck4);
                im5.setImageResource(R.drawable.yoga_neck5);
            }
            else if(result.equals("btn12")) {
                im1.setImageResource(R.drawable.yoga_shoulder1);
                im2.setImageResource(R.drawable.yoga_shoulder2);
                im3.setImageResource(R.drawable.yoga_shoulder3);
                im4.setImageResource(R.drawable.yoga_shoulder4);
                im5.setImageResource(R.drawable.yoga_shoulder5);
            }
            else if(result.equals("btn13")) {
                im1.setImageResource(R.drawable.yoga_wriest1);
                im2.setImageResource(R.drawable.yoga_wriest2);
                im3.setImageResource(R.drawable.yoga_wriest3);
                im4.setImageResource(R.drawable.yoga_wriest4);
                im5.setImageResource(R.drawable.yoga_wriest5);
            }
            else if(result.equals("btn14")) {
                im1.setImageResource(R.drawable.yoga_thyroid1);
                im2.setImageResource(R.drawable.yoga_thyroid2);
                im3.setImageResource(R.drawable.yoga_thyroid3);
                im4.setImageResource(R.drawable.yoga_thyroid4);
                im5.setImageResource(R.drawable.yoga_thyroid5);
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_yoga_image, menu);
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
