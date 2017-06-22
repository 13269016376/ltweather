package com.example.zyd.hongjian.utils;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by zhuyadong on 17/3/31.
 */

public class AddFragmentUtils {
    public static void addFragment(FragmentManager manager, Fragment fragment, int res) {
      FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(res, fragment);
        transaction.commit();


    }
}
