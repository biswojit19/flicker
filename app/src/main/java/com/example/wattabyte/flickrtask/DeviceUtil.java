package com.example.wattabyte.flickrtask;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by WATTABYTE on 07/04/2016.
 */
public class DeviceUtil {
    public DeviceUtil() {
    }

    public static Point getDeviceDimensions(Context context) {
        Point result = new Point();
        WindowManager windowManager = (WindowManager)context.getSystemService("window");
        Display display = windowManager.getDefaultDisplay();
        if(Build.VERSION.SDK_INT >= 11) {
            try {
                display.getRealSize(result);
                return result;
            } catch (NoSuchMethodError var5) {
                result.x = display.getWidth();
                result.y = display.getHeight();
            }
        } else {
            DisplayMetrics metrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(metrics);
            result.x = metrics.widthPixels;
            result.y = metrics.heightPixels;
        }

        return result;
    }
}

