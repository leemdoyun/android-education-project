package com.example.samplearcamera.map;

import android.graphics.drawable.Drawable;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

public class MyOverlayItem extends OverlayItem {

	Drawable mFocusMarker;
	
	public MyOverlayItem(GeoPoint point, String title, String snippet) {
		super(point, title, snippet);
		// TODO Auto-generated constructor stub
	}
	
	public void setFocusMarker(Drawable drawable) {
		mFocusMarker = drawable;
	}

	@Override
	public Drawable getMarker(int stateBitset) {
		// TODO Auto-generated method stub
		if ((stateBitset & OverlayItem.ITEM_STATE_FOCUSED_MASK) != 0) {
			return mFocusMarker;
		} else {
			return mMarker;
		}
	}
	
	

}
