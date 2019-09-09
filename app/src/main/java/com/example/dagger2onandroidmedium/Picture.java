package com.example.dagger2onandroidmedium;


import android.util.Log;

import javax.inject.Inject;

public class Picture {

    private static final String TAG = "Picture";

    private Brush brush;
    private CanvasPaper paper;
    private Paint paint;

    @Inject
    public Picture(Brush brush, CanvasPaper paper, Paint paint) {
        this.brush = brush;
        this.paper = paper;
        this.paint = paint; 
    }

    public void paint(){
        Log.d(TAG, "painted ");
    }

}