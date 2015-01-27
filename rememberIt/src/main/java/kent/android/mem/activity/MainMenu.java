package kent.android.mem.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import kent.android.mem.R;

/**
 * @author: Kent
 * Created on 2015-01-26.
 */
public class MainMenu extends Activity {
     private static String TAG = "mem";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after
     * previously being shut down then this Bundle contains the data it most
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
    }


    public void showHowToScreen(View view) {
        Intent i = new Intent(getApplicationContext(), HowToActivity.class);
        startActivity(i);
    }
}
