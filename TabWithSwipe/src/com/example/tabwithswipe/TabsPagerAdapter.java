package com.example.tabwithswipe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter{
	public TabsPagerAdapter(FragmentManager fm){
		super(fm);
	}
	public Fragment getItem(int index){
		switch (index){
		case 0:
		return new TopRatedFragment();
		case 1:
			return new GamesFragment();
		case 2:
			return new MoviesFragment();
			
		}
		return null;
	}
	public int getCount(){
		return 3;
		
	}

}
