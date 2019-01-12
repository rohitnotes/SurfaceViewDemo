package com.xpf.surfaceviewdemo;

import android.graphics.Canvas;

/**
 * Created by x-sir on 2019-01-12 :)
 * Function:
 */
public class Constants {

    /**
     * 记录播放位置
     */
    public static int playPosition = -1;

    private static Canvas canvas;

    public static Canvas getCanvas() {
        return canvas;
    }

    public static void setCanvas(Canvas canvas) {
        Constants.canvas = canvas;
    }
}
