package healthzone.com.example.kuldeep.healthzone;

import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;


public class Guideline extends Activity implements View.OnClickListener{
Button b1,b2,b3;
    TextView t1,t2,t3;
    Boolean i=true;
    Boolean j=true;
    Boolean m=true;
    static final String[] text={"Governing bodies should be no bigger than necessary to secure the range of skills they need Smaller governing bodies are likely to be more cohesive and dynamic.A key consideration in the appointment and election of all new governors should\n" +
            "be the skills and experience the governing body needs to be effective. The skills" +
            "they need are a matter for governing bodies to decide having regard to the" +
            "Department’s Competency Framework for governance4.Governing bodies should use a skills audit to identify any specific gaps that need" +
            "to be filled in the skills, knowledge and experience of existing governors. Before being nominated for election or appointment, governing bodies should help" +
            "all prospective governors to understand the role of a governor and the governing" +
            "bodies’ code of conduct. Regulations specify that anyone appointing governors to the governing body must" +
            "only appoint someone they believe has the skills to contribute to the effective" +
            "governance and success of the school. Their decisions should be informed by" +
            "interviews and references and made in light of the skills that governing bodies" +
            "identify that they need"};
    static final String[] text2={"Eat a high protein breakfast Avoid sugary drinks and fruit juice." +
            "Drink water a half hour before meals.Choose weight loss-friendly foods (see list)." +
            "Eat soluble fiber." +
            "Drink coffee or tea." +
            "Eat mostly whole, unprocessed foods." +
            "Eat your food slowly"};
    static final String[] text3={"A sliced Carrot looks like the human eye. According to science, eating carrots greatly enhances blood flow to the eyes. Carrot gets their orange color from a plant chemical called beta-carotene, which reduces the risk of developing cataracts. The chemical also protects against macular degeneration an age-related sight problem that affects one in four individuals over the age of 65. If one tries to pop a pill of beta-carotene it doesn’t have the same effect, says scientists at John Hopkins Hospital in Baltimore, USA" +
            "    A Tomato has four chambers and is red in color, so also the heart is red and has four chambers. Research has confirmed that tomatoes are loaded with lycopine and it is indeed pure heart and blood food."};
    // static String[] text2;
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        t1=(TextView)findViewById(R.id.textView9);
        t2=(TextView)findViewById(R.id.textView8);
        t3=(TextView)findViewById(R.id.textView7);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(j==true) {
                    t2.setVisibility(View.VISIBLE);
                    j=false;
                    Random r = new Random();
                    String random = text2[r.nextInt(1)];
                    tts.speak(random, TextToSpeech.QUEUE_FLUSH, null);
                }
                else
                {
                    t2.setVisibility(View.GONE);
                    j=true;
                }


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m==true) {
                    t3.setVisibility(View.VISIBLE);

                    m=false;
                    Random r = new Random();
                    String random = text3[r.nextInt(1)];
                    tts.speak(random, TextToSpeech.QUEUE_FLUSH, null);
                }
                else
                {
                    t3.setVisibility(View.GONE);
                    m=true;
                }


            }
        });




        b1.setOnClickListener(this);
        tts = new TextToSpeech(Guideline.this,new TextToSpeech.OnInitListener(){
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




    public void onClick(View v) {

        if (i == true) {
            t1.setVisibility(View.VISIBLE);
            i = false;
            Random r = new Random();
            String random = text[r.nextInt(1)];
            tts.speak(random, TextToSpeech.QUEUE_FLUSH, null);
        } else {
            t1.setVisibility(View.GONE);
            i = true;
        }

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dicease, menu);
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
