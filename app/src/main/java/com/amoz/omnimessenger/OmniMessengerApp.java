package com.amoz.omnimessenger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amoz.omnimessenger.util.Log;

/**
 * App class that starts initialization.
 */
public class OmniMessengerApp extends AppCompatActivity {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Application created");

        // Initialize other required singleton classes here
    }
}
