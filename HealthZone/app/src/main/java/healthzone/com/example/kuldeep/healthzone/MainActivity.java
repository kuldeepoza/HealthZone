package healthzone.com.example.kuldeep.healthzone;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


public class MainActivity extends AppCompatActivity{
    private ActionBarDrawerToggle abd;
    DrawerLayout dl;
    ListView lv;
    ArrayList<String> arr;
    SharedPreferences sp;
   Toolbar tool_tab;
    TabLayout ta;
DatabaseHelper dpp;

    static final String[] text={"Welcome in Healthzone"};
    // static String[] text2;
    TextToSpeech tts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

dpp=new DatabaseHelper(this);
        dpp.insertFruites();
        dpp.insertVeg();
        dpp.insertLiquid();
        dpp.insertDisease();
        setContentView(R.layout.activity_main);
        //   dp.insertVeg();
        //  dp.insertDisease();

        //   dp.insertLiquid();




        sp=getSharedPreferences("HealthLogin", Context.MODE_PRIVATE);
        String val= sp.getString("username","kd");
        if(val.equals("kd"))
        {
            Intent intent1=new Intent(MainActivity.this,FirstAction.class);
            startActivity(intent1);
        }
        tool_tab = (Toolbar) findViewById(R.id.tools);
        setSupportActionBar(tool_tab);

        ViewPager vp = (ViewPager) findViewById(R.id.viewPager);
        vp.setAdapter(new SimpleFragment(getFragmentManager(), this));
        ta = (TabLayout) findViewById(R.id.tab);
        ta.setupWithViewPager(vp);
    }



     /*   dl = (DrawerLayout) findViewById(R.id.drawerLay);
        lv = (ListView) findViewById(R.id.listview);
        lv.setOnItemClickListener(this);
        arr = new ArrayList<String>();
        arr.add(" Home  ");
        arr.add("Chart");
        arr.add("Exercise");
        arr.add("Yoga");
        arr.add("Disease");
        arr.add("Vegetables");
        arr.add("Fruits");
        arr.add("Soup");
        arr.add("Extra");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, arr);
        lv.setAdapter(adapter);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        abd = new ActionBarDrawerToggle(this, dl, R.string.openDr, R.string.closeDr);
        dl.setDrawerListener(abd);*/
     //   ActionBar ab=getActionBar();
      //  ab.setDisplayHomeAsUpEnabled(true);
   //     getSupportActionBar().hide();

      //  loadSelection(0);







   /* private void loadSelection(int i) {
        lv.setItemChecked(i, true);


        switch (i) {
            case 0:


                break;

            case 1:
                OneFragment one = new OneFragment();
                getFragmentManager().beginTransaction().replace(R.id.frame, one).commit();


                break;
            case 2:
                SecondFragment second = new SecondFragment();
                getFragmentManager().beginTransaction().replace(R.id.frame, second).commit();

                break;

            case 3:

                break;
            case 4:

                break;

            case 5:

                break;
            case 6:

                break;

        }
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
        else {
            if (id == android.R.id.home) {
                if (dl.isDrawerOpen(lv)) {
                    dl.closeDrawer(lv);
                }
                else
                {
                    dl.openDrawer(lv);
                }
            }
        }

        return super.onOptionsItemSelected(item);
    }

   protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        abd.syncState();
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        loadSelection(position);

        dl.closeDrawer(lv);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.first) {
            Intent inn=new Intent(MainActivity.this,Login.class);
            startActivity(inn);
            return true;
        }

    return super.onOptionsItemSelected(item);

    }
}