package healthzone.com.example.kuldeep.healthzone;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class ChartDemoFragment extends Fragment{
    ListView lv;
    ImageView im1,im2,im3,im4,im5;
    TextView tv1,tv2,tv3,tv4,tv5;
    SharedPreferences sp,sp2,sp3;
    int i=1,m=0;
    String val;

    ArrayList<String> arr1,arr2,arr3,arr4;
 //   String[] valll=new String[]{"abc","work","denide","ocian"};
    DatabaseHelper dp;
    public static final String ARG_SECTION_NUMBER = "section_number";
    public ChartDemoFragment()
    {

    }
    public static ChartDemoFragment newInstance(int sectionNumber) {
        ChartDemoFragment fragment = new ChartDemoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
    @TargetApi(23)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState) {
        dp = new DatabaseHelper(getContext());
        sp3 = getActivity().getSharedPreferences("UserData", Context.MODE_PRIVATE);
        val = sp3.getString("Disease", "kd");
             if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                 View rootView = inflater.inflate(R.layout.activity_breakfast, container, false);


                 lv = (ListView) rootView.findViewById(R.id.listViewBreakfast);
                 arr1 = new ArrayList<String>();
                 arr1.add("1 Glass milk ");



                 if (val.equals("kd"))
                 {

                 }

               else   if(val.equals("AIDS"))
                 {

                      arr1.add("apple");
                     arr1.add("Banana");
                     arr1.add("grapefruit");


                 }
                 else if(val.equals("Arthritis"))
                 {
                     arr1.add("guarva");
                     arr1.add("mango");
                     arr1.add("2 Egg");
                 }
                 else if(val.equals("Asthma"))
                 {
                     arr1.add("grapefruit");
                     arr1.add("orange");   arr1.add("guarva");
                     arr1.add("tangerines");
                 }
                 else if(val.equals("Bronchitis"))
                 {
                     arr1.add("pineapple");
                     arr1.add("tangerines");   arr1.add("apple");
                     arr1.add("watermalen");
                 }
                 else if(val.equals("Conjunctivitis"))
                 {
                     arr1.add("apple");
                     arr1.add("pineapple");
                     arr1.add("2 Egg");
                 }
                 else if(val.equals("Dermatitis"))
                 {
                     arr1.add("kiwi");
                     arr1.add("watermalen");   arr1.add("apple");
                 }
                 else if(val.equals("Diabetes"))
                 {
                     arr1.add("kiwi");
                     arr1.add("apple");
                     arr1.add("2 Peice Bread-Butter ");

                 }
                 else if(val.equals("Eczema"))
                 {
                     arr1.add("Banana");
                     arr1.add("lemon");
                     arr1.add("2 Egg");

                 }

                 else if(val.equals("Ear Infections"))
                 {
                     arr1.add("melon");
                     arr1.add("pumpkin");
                     arr1.add("lemon");

                 }


                 else if(val.equals("Kidney Stones"))
                 {
                     arr1.add("Banana");
                     arr1.add("plum");
                     arr1.add("pumpkin");
                     arr1.add("apple");

                 }
                 else if(val.equals("Kidney Stones"))
                 {
                     arr1.add("plum");
                     arr1.add("pumpkin");
                     arr1.add("2 Peice Bread-Butter ");

                 }
                 else if(val.equals("Pain"))
                 {
                     arr1.add("Banana");
                     arr1.add("2 Egg");
                     arr1.add("pumpkin");

                 }

                 else if(val.equals("any body part"))
                 {
                     arr1.add("melon");
                     arr1.add("plum");
                     arr1.add("Banana");

                 }

                 else if(val.equals("Chickenpox"))
                 {
                     arr1.add("pumpkin");
                     arr1.add("Banana");
                     arr1.add("2 Egg");

                 }

                 else if(val.equals("Cholesterol"))
                 {
                     arr1.add("Banana");
                     arr1.add("2 Peice Bread-Butter ");
                 }
                 arr1.add("BananaShake");


                 Cursor crr23=dp.getBreakfast();
                     while (crr23.moveToNext()) {
                       //  arr1.add(crr23.getString(1));

                         //    Toast.makeText(getContext(), crr.getString(1), Toast.LENGTH_SHORT).show();
                     }




                 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_activated_1, arr1);
                 lv.setAdapter(adapter);
                 lv.deferNotifyDataSetChanged();
            return rootView;
        } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2) {
            View rootView = inflater.inflate(R.layout.activity_lunch, container, false);
            lv=(ListView)rootView.findViewById(R.id.lunchListview);
            arr2 = new ArrayList<String>();
            Cursor crr=dp.getLunch();
            while(crr.moveToNext()) {
            //    arr2.add(crr.getString(1));
            //      Toast.makeText(getContext(), crr.getString(1), Toast.LENGTH_SHORT).show();
            }

                 if (val.equals("kd"))
                 {

                 }
                 else   if(val.equals("AIDS"))
                 {
                     arr2.add("Asparagus");
                     arr2.add("beans");
                     arr2.add("broccoli");
                 }
                 else if(val.equals("Arthritis"))
                 {
                     arr2.add("guarva");
                     arr2.add("cabbage");
                     arr2.add("carrots");
                 }
                 else if(val.equals("Asthma"))
                 {
                     arr2.add("grapefruit");
                     arr2.add("Asparagus");   arr1.add("cabbage");
                     arr2.add("broccoli");
                 }
                 else if(val.equals("Bronchitis"))
                 {
                     arr2.add("cailiflower");
                     arr2.add("celey");   arr2.add("corn");
                     arr2.add("cucumber");
                 }
                 else if(val.equals("Conjunctivitis"))
                 {
                     arr2.add("lentis");
                     arr2.add("lettuce");
                     arr2.add("mushroom");
                 }
                 else if(val.equals("Dermatitis"))
                 {
                     arr2.add("spinch");
                     arr2.add("potato");
                     arr2.add("tomato");
                 }
                 else if(val.equals("Diabetes"))
                 {
                     arr2.add("peas");
                     arr2.add("pumpkin");
                     arr2.add("spinch ");

                 }

                 else if(val.equals("Eczema"))
                 {
                     arr2.add("peppers");
                     arr2.add("lemon");
                     arr2.add("potato");

                 }




                 else if(val.equals("Ear Infections"))
                 {
                     arr2.add("melon");
                     arr2.add("pumpkin");
                     arr2.add("lemon");

                 }


                 else if(val.equals("Kidney Stones"))
                 {
                     arr2.add("Banana");
                     arr2.add("plum");
                     arr2.add("Rice");
                     arr2.add("Dal");

                 }

                 else if(val.equals("Pain"))
                 {
                     arr2.add("Rice");
                     arr2.add("Dal");

                     arr2.add("pumpkin");

                 }

                 else if(val.equals("any body part"))
                 {
                     arr2.add("melon");
                     arr2.add("plum");
                     arr2.add("1 Green vegetable ");

                 }

                 else if(val.equals("Chickenpox"))
                 {
                     arr2.add("pumpkin");
                     arr2.add("Potato");

                 }

                 else if(val.equals("Cholesterol"))
                 {

                     arr2.add("Rice");
                     arr2.add("Dal");
                 }
            arr2.add("Salad");
            arr2.add("1 Glass Buttermilk");
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_activated_1, arr2);
            lv.setAdapter(adapter);
                 lv.deferNotifyDataSetChanged();
            return rootView;
        } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 3) {
            View rootView = inflater.inflate(R.layout.activity_snacks, container, false);
            lv=(ListView)rootView.findViewById(R.id.snacksListview);
            arr3 = new ArrayList<String>();


                 if (val.equals("kd"))
                 {

                 }
                 else   if(val.equals("AIDS"))
                 {
                     arr3.add("pomegrant juice");
                     arr3.add("coffee");
                     arr3.add("soy milk");
                 }
                 else if(val.equals("Arthritis"))
                 {
                     arr3.add("tomato juice");
                     arr3.add("black tee");
                     arr3.add("graps juice");
                 }






                 else if(val.equals("Asthma"))
                 {
                     arr3.add("green tee");
                     arr3.add("energy drinks");   arr3.add("graps juice");
                     arr3.add("olive oil");
                 }
                 else if(val.equals("Bronchitis"))
                 {
                     arr3.add("lomon juice");
                     arr3.add("once a day");   arr3.add("lots of water");
                     arr3.add("tea");
                 }
                 else if(val.equals("Conjunctivitis"))
                 {
                     arr3.add("herbal tea");
                     arr3.add("green vegetables soup");
                     arr3.add("water");
                 }
                 else if(val.equals("Dermatitis"))
                 {
                     arr3.add("Ice cream");
                     arr3.add("hot cereal");
                     arr3.add("coffee");
                 }
                 else if(val.equals("Diabetes"))
                 {
                     arr3.add("Coconut Oil");
                     arr3.add("Orange Juice");
                     arr3.add("Coffee");

                 }

                 else if(val.equals("Eczema"))
                 {
                     arr3.add("soda");
                     arr3.add("hard drik");
                     arr3.add("cacola");

                 }




                 else if(val.equals("Ear Infections"))
                 {
                     arr3.add("Watermelon Smoothie");
                     arr3.add("Pineapple Frappe");
                     arr3.add("Iced Peppermint Tea");

                 }


                 else if(val.equals("Kidney Stones"))
                 {
                     arr3.add("coffee");
                     arr3.add("canned soup");
                     arr3.add("curd hams");
                     arr3.add("soda");

                 }

                 else if(val.equals("Pain"))
                 {
                     arr3.add("bottled");
                     arr3.add("Water");

                 }

                 else if(val.equals("any body part"))
                 {
                     arr3.add("Unsweetened teas");
                     arr3.add("Diet soda");
                     arr3.add("tomato juice");

                 }

                 else if(val.equals("Chickenpox"))
                 {
                     arr3.add("Coffee");
                     arr3.add("Other low-calorie drinks");

                 }

                 else if(val.equals("Cholesterol"))
                 {

                     arr3.add("sugar free milk");
                     arr3.add("drink mixes");
                 }

            arr3.add("Apple juice");
            Cursor crr=dp.getSnacks();
            while(crr.moveToNext()) {
             //  arr3.add(crr.getString(1));
               //   Toast.makeText(getContext(), crr.getString(1), Toast.LENGTH_SHORT).show();
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_activated_1, arr3);
            lv.setAdapter(adapter);
                 lv.deferNotifyDataSetChanged();
            return rootView;
        } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 4) {
            View rootView = inflater.inflate(R.layout.activity_dinner, container, false);
            lv=(ListView)rootView.findViewById(R.id.dinnerListview);
            arr4 = new ArrayList<String>();


                 if (val.equals("kd"))
                 {

                 }
                 else   if(val.equals("AIDS"))
                 {
                     arr4.add("guarva");
                     arr4.add("cabbage");
                     arr4.add("carrots");
                 }
                 else if(val.equals("Arthritis"))
                 {
                     arr4.add("Asparagus");
                     arr4.add("beans");
                     arr4.add("broccoli");

                 }
                 else if(val.equals("Asthma"))
                 {
                     arr4.add("grapefruit");
                     arr4.add("Asparagus");
                     arr4.add("cabbage");
                     arr4.add("broccoli");
                 }
                 else if(val.equals("Bronchitis"))
                 {
                     arr4.add("cailiflower");
                     arr4.add("celey");   arr4.add("corn");
                     arr4.add("cucumber");
                 }
                 else if(val.equals("Conjunctivitis"))
                 {
                     arr4.add("lentis");
                     arr4.add("lettuce");
                     arr4.add("mushroom");
                 }
                 else if(val.equals("Dermatitis"))
                 {
                     arr4.add("peppers");
                     arr4.add("lemon");
                     arr4.add("potato");
                 }
                 else if(val.equals("Diabetes"))
                 {
                     arr4.add("peas");
                     arr4.add("pumpkin");
                     arr4.add("spinch ");

                 }

                 else if(val.equals("Eczema"))
                 {


                     arr4.add("spinch");
                     arr4.add("potato");
                     arr4.add("tomato");

                 }




                 else if(val.equals("Ear Infections"))
                 {

                     arr4.add("Banana");
                     arr4.add("plum");
                     arr4.add("Rice");
                     arr4.add("Dal");
                 }


                 else if(val.equals("Kidney Stones"))
                 {
                     arr4.add("melon");
                     arr4.add("pumpkin");
                     arr4.add("lemon");


                 }

                 else if(val.equals("Pain"))
                 {
                     arr4.add("plum");
                     arr4.add("pumpkin");


                 }

                 else if(val.equals("any body part"))
                 {
                     arr4.add("melon");
                     arr4.add("plum");
                     arr4.add("1 Green vegetable ");

                 }

                 else if(val.equals("Chickenpox"))
                 {
                     arr4.add("Rice");
                     arr4.add("Dal");

                 }

                 else if(val.equals("Cholesterol"))
                 {
                     arr4.add("pumpkin");
                     arr4.add("Potato");

                 }

            Cursor crr=dp.getDinner();
            while(crr.moveToNext()) {
             //  arr4.add(crr.getString(1));
               //   Toast.makeText(getContext(), crr.getString(1), Toast.LENGTH_SHORT).show();
            }
            arr4.add("Salad");
            arr4.add("1 Choclate after eat");
            arr4.add("1 glass milk before sleep");
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_activated_1, arr4);
            lv.setAdapter(adapter);
                 lv.deferNotifyDataSetChanged();
                 return rootView;
        } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 5) {
            View rootView = inflater.inflate(R.layout.activity_exercise, container, false);
            im1=(ImageView)rootView.findViewById(R.id.exImage1);
            im2=(ImageView)rootView.findViewById(R.id.exImage2);
            im3=(ImageView)rootView.findViewById(R.id.exImage3);
            im4=(ImageView)rootView.findViewById(R.id.exImage4);
            im5=(ImageView)rootView.findViewById(R.id.exImage5);
            tv1=(TextView)rootView.findViewById(R.id.textView101);
            tv2=(TextView)rootView.findViewById(R.id.textView104);
            tv3=(TextView)rootView.findViewById(R.id.textView107);
            tv4=(TextView)rootView.findViewById(R.id.textView110);
            tv5=(TextView)rootView.findViewById(R.id.textView113);
            sp=getActivity().getSharedPreferences("UserData", Context.MODE_PRIVATE);
            String val= sp.getString("Extra","kd");
            if(val.equals("kd"))
            {
                Toast.makeText(getContext(),"This is not called",Toast.LENGTH_SHORT);
            }
           else if(val.equals("Arm")) {
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
            else if(val.equals("Belly"))
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
            else if(val.equals("Brain")) {
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
            else if(val.equals("Chest"))
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
            else if(val.equals("Hand"))
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
            else if(val.equals("Heart"))
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
            else if(val.equals("Liver"))
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
            else if(val.equals("Lungs"))
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
            else if(val.equals("Neck"))
            {    im1.setImageResource(R.drawable.exercise_leg_neck_smr);
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
            else if(val.equals("Knees"))
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
            else if(val.equals("Leg"))
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
            else if(val.equals("Shoulder"))
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
            else if(val.equals("Thyroid"))
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
            else if(val.equals("Wriest"))
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
            else if(val.equals("None"))
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
            return rootView;
        } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 6) {
            View rootView = inflater.inflate(R.layout.activity_yoga_new, container, false);
            im1=(ImageView)rootView.findViewById(R.id.imageView2);
            im2=(ImageView)rootView.findViewById(R.id.imageView3);
            im3=(ImageView)rootView.findViewById(R.id.imageView4);
            im4=(ImageView)rootView.findViewById(R.id.imageView5);
            im5=(ImageView)rootView.findViewById(R.id.imageView6);
            sp2=getActivity().getSharedPreferences("UserData", Context.MODE_PRIVATE);
            String val= sp2.getString("Extra","kd");
            if(val.equals("kd"))
            {
                Toast.makeText(getContext(),"This is not called",Toast.LENGTH_SHORT);
            }
            else if(val.equals("Arm")) {
                im1.setImageResource(R.drawable.yoga_belly1);
                im2.setImageResource(R.drawable.yoga_belly2);
                im3.setImageResource(R.drawable.yoga_belly3);
                im4.setImageResource(R.drawable.yoga_belly4);
                im5.setImageResource(R.drawable.yoga_belly5);
            }
            else if(val.equals("Belly"))
            {
                im1.setImageResource(R.drawable.yoga_chest1);
                im2.setImageResource(R.drawable.yoga_chest2);
                im3.setImageResource(R.drawable.yoga_chest3);
                im4.setImageResource(R.drawable.yoga_chest4);
                im5.setImageResource(R.drawable.yoga_chest5);
            }
            else if(val.equals("Brain"))
            {
                im1.setImageResource(R.drawable.yoga_hands1);
                im2.setImageResource(R.drawable.yoga_hands2);
                im3.setImageResource(R.drawable.yoga_hands3);
                im4.setImageResource(R.drawable.yoga_hands4);
                im5.setImageResource(R.drawable.yoga_hands5);
            }
            else if(val.equals("Chest"))
            {
                im1.setImageResource(R.drawable.yoga_heart1);
                im2.setImageResource(R.drawable.yoga_heart2);
                im3.setImageResource(R.drawable.yoga_heart3);
                im4.setImageResource(R.drawable.yoga_heart4);
                im5.setImageResource(R.drawable.yoga_heart5);
            }
            else if(val.equals("Hand"))
            {
                im1.setImageResource(R.drawable.yoga_kidney1);
                im2.setImageResource(R.drawable.yoga_kidney2);
                im3.setImageResource(R.drawable.yoga_kidney3);
                im4.setImageResource(R.drawable.yoga_kidney4);
                im5.setImageResource(R.drawable.yoga_kidney5);
            }
            else if(val.equals("Heart"))
            {
                im1.setImageResource(R.drawable.yoga_knees1);
                im2.setImageResource(R.drawable.yoga_knees2);
                im3.setImageResource(R.drawable.yoga_knees3);
                im4.setImageResource(R.drawable.yoga_knees4);
                im5.setImageResource(R.drawable.yoga_knees5);
            }
            else if(val.equals("Liver"))
            {
                im1.setImageResource(R.drawable.yoga_leg1);
                im2.setImageResource(R.drawable.yoga_leg2);
                im3.setImageResource(R.drawable.yoga_leg3);
                im4.setImageResource(R.drawable.yoga_leg4);
                im5.setImageResource(R.drawable.yoga_leg5);
            }
            else if(val.equals("Lungs"))
            {
                im1.setImageResource(R.drawable.yoga_liver1);
                im2.setImageResource(R.drawable.yoga_liver2);
                im3.setImageResource(R.drawable.yoga_liver3);
                im4.setImageResource(R.drawable.yoga_liver4);
                im5.setImageResource(R.drawable.yoga_liver5);
            }
            else if(val.equals("Neck"))
            {
                im1.setImageResource(R.drawable.yoga_lungs1);
                im2.setImageResource(R.drawable.yoga_lungs2);
                im3.setImageResource(R.drawable.yoga_lungs3);
                im4.setImageResource(R.drawable.yoga_lungs4);
                im5.setImageResource(R.drawable.yoga_lungs5);
            }
            else if(val.equals("Knees"))
            {
                im1.setImageResource(R.drawable.yoga_neck1);
                im2.setImageResource(R.drawable.yoga_neck2);
                im3.setImageResource(R.drawable.yoga_neck3);
                im4.setImageResource(R.drawable.yoga_neck4);
                im5.setImageResource(R.drawable.yoga_neck5);
            }
            else if(val.equals("Leg"))
            {
                im1.setImageResource(R.drawable.yoga_shoulder1);
                im2.setImageResource(R.drawable.yoga_shoulder2);
                im3.setImageResource(R.drawable.yoga_shoulder3);
                im4.setImageResource(R.drawable.yoga_shoulder4);
                im5.setImageResource(R.drawable.yoga_shoulder5);
            }
            else if(val.equals("Shoulder"))
            {
                im1.setImageResource(R.drawable.yoga_wriest1);
                im2.setImageResource(R.drawable.yoga_wriest2);
                im3.setImageResource(R.drawable.yoga_wriest3);
                im4.setImageResource(R.drawable.yoga_wriest4);
                im5.setImageResource(R.drawable.yoga_wriest5);
            }
            else if(val.equals("Thyroid"))
            {
                im1.setImageResource(R.drawable.yoga_thyroid1);
                im2.setImageResource(R.drawable.yoga_thyroid2);
                im3.setImageResource(R.drawable.yoga_thyroid3);
                im4.setImageResource(R.drawable.yoga_thyroid4);
                im5.setImageResource(R.drawable.yoga_thyroid5);
            }
            else if(val.equals("Wriest"))
            {
                im1.setImageResource(R.drawable.yoga_neck1);
                im2.setImageResource(R.drawable.yoga_neck2);
                im3.setImageResource(R.drawable.yoga_neck3);
                im4.setImageResource(R.drawable.yoga_neck4);
                im5.setImageResource(R.drawable.yoga_neck5);
            }
            else if(val.equals("None"))
            {
                im1.setImageResource(R.drawable.yoga_leg1);
                im2.setImageResource(R.drawable.yoga_leg2);
                im3.setImageResource(R.drawable.yoga_leg3);
                im4.setImageResource(R.drawable.yoga_leg4);
                im5.setImageResource(R.drawable.yoga_leg5);
            }

            return rootView;
        }
             /*

             else if (getArguments().getInt(ARG_SECTION_NUMBER) == 7) {
            View rootView = inflater.inflate(R.layout.activity_disease_new, container, false);
          l1=(ListView)rootView.findViewById(R.id.ExtraListview);
            l2=(ListView)rootView.findViewById(R.id.BloodPView);
            l3=(ListView)rootView.findViewById(R.id.DibeticeListView);
            l4=(ListView)rootView.findViewById(R.id.HedequeListView);
            t1=(TextView)rootView.findViewById(R.id.ExtraDisease);
            t2=(TextView)rootView.findViewById(R.id.BloodP);
            t3=(TextView)rootView.findViewById(R.id.Dibetice);
            t4=(TextView)rootView.findViewById(R.id.Hedeque);
            sp2=getActivity().getSharedPreferences("UserData", Context.MODE_PRIVATE);
            String val= sp.getString("check1","kd");
            String val2= sp.getString("check2","kd");
            String val3= sp.getString("check3","kd");
            if(val.equals("true"))
            {
                t2.setVisibility(View.VISIBLE);
                l2.setVisibility(View.VISIBLE);
                t2.setText("Blood Pressure");
                arr = new ArrayList<String>();
                arr.add("Alpha Adrenergic Receptor Blockers");
                arr.add("Angiotensin II Receptor Antagonists");
                arr.add("AngiotensinConverting Enzyme ");
                arr.add("Inhibitors");
                arr.add("Hydrochlorothiazide");
                arr.add("Clonidine");
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_activated_1, arr);
                l2.setAdapter(adapter);

            }
            if(val2.equals("true"))
            {
                t3.setText("Diabetes");
                arr = new ArrayList<String>();
                arr.add("Acarbose");
                arr.add("Antidiabetic Agents Sulfonylurea");
                arr.add("Insulin Analogs");
                arr.add("Meglitinides");
                arr.add("Metformin");
                arr.add("Thiazolidinediones");
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_activated_1, arr);
                l3.setAdapter(adapter);
                t3.setVisibility(View.VISIBLE);
                l3.setVisibility(View.VISIBLE);
            }
            if(val3.equals("true"))
            {
                t4.setText("Headache");
                arr = new ArrayList<String>();
                arr.add("Acetaminophen (Fioricet)");
                arr.add("Antidepressants");
                arr.add("Tricyclic");
                arr.add("Antihistamines");
                arr.add("NSAIDs");
                arr.add("Aspirin");
                arr.add("Barbiturates");
                arr.add("Buspirone");
                arr.add("Caffeine");
                arr.add("Ergotamine");

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_activated_1, arr);
                l4.setAdapter(adapter);
                t4.setVisibility(View.VISIBLE);
                l4.setVisibility(View.VISIBLE);
            }

            return rootView;
        }*/


        return null;
    }



}
