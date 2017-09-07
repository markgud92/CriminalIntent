package com.example.markg.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by markg on 28/08/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
