package healthzone.com.example.kuldeep.healthzone;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class HealthCareImages extends ActionBarActivity {
    ImageView im1,im2,im3,im4,im5;
TextView tv1,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care_images);
        im1=(ImageView)findViewById(R.id.exImage1);
        im2=(ImageView)findViewById(R.id.exImage2);
        im3=(ImageView)findViewById(R.id.exImage3);
        im4=(ImageView)findViewById(R.id.exImage4);
        im5=(ImageView)findViewById(R.id.exImage5);
        tv1=(TextView)findViewById(R.id.textView101);
        tv2=(TextView)findViewById(R.id.textView104);
        tv3=(TextView)findViewById(R.id.textView107);
        tv4=(TextView)findViewById(R.id.textView110);
        tv5=(TextView)findViewById(R.id.textView113);
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            String result=extras.getString("value");
            if(result.equals("btn2"))
            {
                im1.setImageResource(R.drawable.exercise_bicep_alt);
                im2.setImageResource(R.drawable.exercise_bicep_barbcurls);
                im3.setImageResource(R.drawable.exercise_bicep_barbell_curl);
                im4.setImageResource(R.drawable.exercise_bicep_cable);
                im5.setImageResource(R.drawable.exercise_bicep_brachialis);
                tv1.setText("alternate_hammer_curl");
                tv2.setText("barbcurls_lying");
                tv3.setText("exercise_bicep_barbell_curl");
                tv4.setText("exercise_bicep_cable");
                tv5.setText("exercise_bicep_brachialis_smr");
            }
            else if(result.equals("btn3"))
            {
                im1.setImageResource(R.drawable.exercise_calf_ankle_circles);
                im2.setImageResource(R.drawable.exercise_calf_anterior);
                im3.setImageResource(R.drawable.exercise_calf_balance);
                im4.setImageResource(R.drawable.exercise_calf_calf_raise);
                im5.setImageResource(R.drawable.exercise_calf_donkey);
                tv1.setText("calf_ankle_circles");
                tv2.setText("anterior_tibialis_smr");
                tv3.setText("balance_board");
                tv4.setText("calf_raise_on_dumbbell");
                tv5.setText("donkey_calf_raises");
            }
            else if(result.equals("btn4"))
            {
                im1.setImageResource(R.drawable.exercise_chest_alternating);
                im2.setImageResource(R.drawable.exercise_chest_bar_push_up);
                im3.setImageResource(R.drawable.exercise_chest_bar_throw);
                im4.setImageResource(R.drawable.exercise_chest_barbell);
                im5.setImageResource(R.drawable.exercise_chest_burpee_to_me);
                tv1.setText("lternating_floor_press");
                tv2.setText("bar_push_up_smith_machine");
                tv3.setText("bar_throw_and_press");
                tv4.setText("barbell_bench_pres_wide_grip");
                tv5.setText("burpee_to_medicine_ball");
            }
            else if(result.equals("btn5"))
            {
                im1.setImageResource(R.drawable.exercise_forearm__farmer_walk);
                im2.setImageResource(R.drawable.exercise_forearm_bottoms_up);
                im3.setImageResource(R.drawable.exercise_forearm);
                im4.setImageResource(R.drawable.exercise_forearm_palms_down);
                im5.setImageResource(R.drawable.exercise_forearm_rickshaw_carry);
                tv1.setText("farmer_walk");
                tv2.setText("bottoms_up_clean");
                tv3.setText("dumbbell_lying_pronation");
                tv4.setText("palms_down_wrist_curl");
                tv5.setText("rickshaw_carry");


            }
            else if(result.equals("btn6"))
            {
                im1.setImageResource(R.drawable.exercise_middle);
                im2.setImageResource(R.drawable.exercise_middleback);
                im3.setImageResource(R.drawable.exercise_middleback_bent);
                im4.setImageResource(R.drawable.exercise_middleback_barbell);
                im5.setImageResource(R.drawable.exercise_middleback_leverage);
                tv1.setText("alternating_kettlebell_row");
                tv2.setText("barbell_deadlift_bent_row");
                tv3.setText("bent_over_barbell_row");
                tv4.setText("bodyweight_mid_row");
                tv5.setText("leverage_high_row");


            }
            else if(result.equals("btn7"))
            {
                im1.setImageResource(R.drawable.exercise_leg_neck_smr);
                im2.setImageResource(R.drawable.exercise_leg_deadlift);
                im3.setImageResource(R.drawable.exercise_leg_lying_face);
                im4.setImageResource(R.drawable.exercise_leg_neck_bridge_prone);
                im5.setImageResource(R.drawable.exercise_leg_side_neck_stretch);
                tv1.setText("neck_smr");
                tv2.setText("deadlift");
                tv3.setText("lying_face_down_plate");
                tv4.setText("neck_bridge_prone");
                tv5.setText("side_neck_stretch");
            }


            else if(result.equals("btn8"))
            {
                im1.setImageResource(R.drawable.exercise_shoulder_alter);
                im2.setImageResource(R.drawable.exercise_shoulder_alterna);
                im3.setImageResource(R.drawable.exercise_shoulder_alternating);
                im4.setImageResource(R.drawable.exercise_shoulder_axle_clean);
                im5.setImageResource(R.drawable.exercise_shoulder_battling);
                tv1.setText("lternating_cable_shoulder");
                tv2.setText("alternating_deltoi_raise");
                tv3.setText("alternating_kettlebell_press");
                tv4.setText("axle_clean_and_press");
                tv5.setText("battling_ropes");
            }
            else if(result.equals("btn9"))
            {

                im1.setImageResource(R.drawable.exercise_trap_barbell_shrug);
                im2.setImageResource(R.drawable.exercise_trap_cable_shrugs);
                im3.setImageResource(R.drawable.exercise_trap_dumbbell_shrug);
                im4.setImageResource(R.drawable.exercise_trap_kettlebell);
                im5.setImageResource(R.drawable.exercise_trap_smith);
                tv1.setText("barbell_shrug");
                tv2.setText("cable_shrugs");
                tv3.setText("dumbbell_shrug");
                tv4.setText("kettlebell_sumo_high_pull");
                tv5.setText("smith_machine_upright_row");



            }
            else if(result.equals("btn10"))
            {


                im1.setImageResource(R.drawable.exercise_tricep_bench_dips);
                im2.setImageResource(R.drawable.exercise_tricep_body_triceps);
                im3.setImageResource(R.drawable.exercise_tricep_bench_press);
                im4.setImageResource(R.drawable.exercise_tricep_chai);
                im5.setImageResource(R.drawable.exercise_tricep_tricep);
                tv1.setText("bench_dips");
                tv2.setText("body_triceps_press_using");
                tv3.setText("bench_press_powerlifting");
                tv4.setText("chain_handle_extension");
                tv5.setText("tricep_tricep");

            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_health_care_images, menu);
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
