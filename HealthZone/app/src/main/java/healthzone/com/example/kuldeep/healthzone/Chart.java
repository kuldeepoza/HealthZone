package healthzone.com.example.kuldeep.healthzone;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.Calendar;


public class Chart extends ActionBarActivity {
    TabLayout ta;
    Button bb;
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int cur=day;
        bb=(Button)findViewById(R.id.button9);
        if (day==cur+i)
        {
            bb.setText("Day "+i);
            i++;
        }
        ViewPager vp = (ViewPager) findViewById(R.id.viewPager2);
        vp.setAdapter(new ChartFragment(getFragmentManager(), this));
        ta = (TabLayout) findViewById(R.id.tab2);
        ta.setupWithViewPager(vp);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chart, menu);
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
