package kent.android.mem.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import kent.android.mem.R;

/**
 * @author: Kent
 * Created on 2015-01-27.
 */
public class HowToActivity  extends Activity{
    private static String TAG = "HowTo";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
    }
}
