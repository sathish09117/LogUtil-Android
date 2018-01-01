package lib.smdeveloper.logutil;

import android.util.Log;

/**
 * Created by sathish kumar on 01-01-2018.
 */

public class LogDebug {
    private static final String TAG = "SUPER_AWESOME_APP";
    public static void d(String message)
    {
        Log.d(TAG, message);
    }
}
