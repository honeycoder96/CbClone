package me.honeysharma.cbclone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class SectionsPagerAdapter extends FragmentPagerAdapter{


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0:
                Fragment1 requestsFragment = new Fragment1();
                return requestsFragment;

            case 1:
                Fragment2 chatsFragment = new Fragment2();
                return  chatsFragment;

            case 2:
                Fragment3 friendsFragment = new Fragment3();
                return friendsFragment;
            case 3:
                Fragment4 fragment4=new Fragment4();
                return fragment4;

            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position){

        switch (position) {
            case 0:
                return "INFO";

            case 1:
                return "LIVE";

            case 2:
                return "SCORECARD";

            case 3:
                return "HIGHLIGHT";

            default:
                return null;
        }

    }

}
