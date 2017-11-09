package healthzone.com.example.kuldeep.healthzone;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;


/**
 * Created by kuldeep on 10/26/2016.
 */
public class FragmentDemo extends Fragment  {
Button btn;

DatabaseHelper dpp;

    public static final String ARG_SECTION_NUMBER = "section_number";
public FragmentDemo()
{

}

    public static FragmentDemo newInstance(int sectionNumber) {
        FragmentDemo fragment = new FragmentDemo();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState) {
        if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
            View rootView = inflater.inflate(R.layout.activity_chart_days, container, false);
            btn=(Button)rootView.findViewById(R.id.chartOther);
             btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   Intent intent=new Intent(getContext(),UserDetail.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
        else if(getArguments().getInt(ARG_SECTION_NUMBER) == 2)
        {
            ImageView iv1,iv2,iv3;
            View rootVie = inflater.inflate(R.layout.activity_care_menu, container, false);
            iv1=(ImageView)rootVie.findViewById(R.id.imageView8);
            iv2=(ImageView)rootVie.findViewById(R.id.imageView9);
            iv3=(ImageView)rootVie.findViewById(R.id.imageView10);
            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),HealthCare.class));
                }
            });
            iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),Yoga.class));
                }
            });
            iv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(),Guideline.class));
                }
            });


            return rootVie;
        }
        else {
            View rootView = inflater.inflate(R.layout.fragmentdemo, container, false);
            Switch sw=(Switch)rootView.findViewById(R.id.switch1);
            Switch sw2=(Switch)rootView.findViewById(R.id.switch2);
            Switch sw3=(Switch)rootView.findViewById(R.id.switch3);
            sw.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    startActivity(new Intent(getContext(),EatingReminder.class));
                    return false;
                }
            });
            sw2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    startActivity(new Intent(getContext(),WalkingReminder.class));
                    return false;
                }
            });
            sw3.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    startActivity(new Intent(getContext(),ExerciseReminder.class));
                    return false;
                }
            });
            return rootView;
        }



    }



}
