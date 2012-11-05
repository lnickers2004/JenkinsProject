package com.cardinal.jenkinsproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.cardinal.jenkinsproject.utils.AppHelper;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        AppHelper thisHelper = new AppHelper();
        int value = thisHelper.getValue();
        
        int expectedValue = 1;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
