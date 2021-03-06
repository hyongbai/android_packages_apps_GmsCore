package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.dynamic.IObjectWrapper;

interface IMapViewDelegate {
	IGoogleMapDelegate getMap();
	void onCreate(in Bundle savedInstanceState);
	void onResume();
    void onPause();
	void onDestroy();
	void onLowMemory();
	void onSaveInstanceState(inout Bundle outState);
	IObjectWrapper getView();
}
