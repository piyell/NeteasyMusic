package com.zsorg.neteasecloudmusic.presenters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.telephony.SmsMessage;
import android.view.View;

import com.zsorg.neteasecloudmusic.CONST;
import com.zsorg.neteasecloudmusic.R;
import com.zsorg.neteasecloudmusic.SubMusicFragment;

import java.util.ArrayList;

import butterknife.BindArray;
import butterknife.BindString;
import butterknife.ButterKnife;

/**
 * Created by piyel_000 on 2017/1/3.
 */

public class MusicPagerAdapter extends FragmentPagerAdapter {
    private final ArrayList<SubMusicFragment> mList;
    @BindArray(R.array.music)
    String[] mTabName;
    private int[] mFragmentType = {CONST.TYPE_SINGLE, CONST.TYPE_SINGER, CONST.TYPE_ALBUM, CONST.TYPE_FOLDER};

    public MusicPagerAdapter(View view, FragmentManager fm) {
        super(fm);
        ButterKnife.bind(this, view);

        mList = new ArrayList<>();
        for (int position=0;position<mFragmentType.length;position++) {
            mList.add(SubMusicFragment.newInstance(mFragmentType[position]));
        }

    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mTabName.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabName[position];
    }
}
