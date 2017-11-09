package healthzone.com.example.kuldeep.healthzone;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;


/**
 * Created by kuldeep on 10/26/2016.
 */
public class ChartFragment extends FragmentPagerAdapter {
    Context context;
    private int pageCount=6;
    public ChartFragment(FragmentManager fm,Context context) {
        super(fm);
        this.context=context;

    }

    @Override
    public Fragment getItem(int position) {

        return ChartDemoFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    public CharSequence getPageTitle(int position)


    {
        switch(position)
        {
            case 0:
                return "Breakfast";
            case 1:
                return "Lunch";
            case 2:
                return "Snacks";
            case 3:
                return "Dinner";
            case 4:
                return "Exercise";
            case 5:
                return "Yoga";

        }
        return  null;
    }
}
