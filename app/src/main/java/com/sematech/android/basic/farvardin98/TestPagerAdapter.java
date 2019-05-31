package com.sematech.android.basic.farvardin98;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TestPagerAdapter extends FragmentPagerAdapter {


    public TestPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TestFragment();
            case 1:
                return new TestFragment();
            case 2:
                return new TestFragment();
            default:
                return new TestFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "First Fragment";
            case 1:
                return "Second Fragment";
            case 2:
                return "Third Fragment";
            default:
                return "Unknown Fragment!";
        }
    }
}
