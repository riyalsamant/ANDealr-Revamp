package com.ascentsmartwaves.andealrrevamp.adapters;

/**
 * Created by Riyal on 29/12/2015.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ascentsmartwaves.andealrrevamp.activities.AboutUsFragment;
import com.ascentsmartwaves.andealrrevamp.activities.ContactUsFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
               AboutUsFragment tab1 = new AboutUsFragment();
                return tab1;
            case 1:
                ContactUsFragment tab2 = new ContactUsFragment();
                return tab2;
           case 2:
               AboutUsFragment tab3 = new AboutUsFragment();
               return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}