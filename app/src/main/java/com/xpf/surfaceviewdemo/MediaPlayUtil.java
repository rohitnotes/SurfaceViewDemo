
package com.xpf.surfaceviewdemo;

import android.media.MediaPlayer;

/**
 * Created by x-sir on 2019-01-12 :)
 * Function:
 */
public class MediaPlayUtil {

    /**
     * 播放器
     */
    private static MediaPlayer mediaPlayer;
    /**
     * 静态的播放路径
     */
    private static String pathString;


    public static void getInitanse(String path) {
        if (null == mediaPlayer) {
            synchronized (MediaPlayUtil.class) {
                if (null == mediaPlayer) {

                }
            }
        } else {

        }
    }
}
