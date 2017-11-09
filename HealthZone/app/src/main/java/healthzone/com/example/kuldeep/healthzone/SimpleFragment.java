package healthzone.com.example.kuldeep.healthzone;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;


/**
 * Created by kuldeep on 10/26/2016.
 */
public class SimpleFragment extends FragmentPagerAdapter {
    Context context;
    private int pageCount=3;
    public SimpleFragment(FragmentManager fm,Context context) {
        super(fm);
        this.context=context;

    }

    @Override
    public Fragment getItem(int position) {

        return FragmentDemo.newInstance(position+1);
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
                return "Chart";
            case 1:
                return "Care";
            case 2:
                return "Reminder";
        }
        return  null;
    }
}
