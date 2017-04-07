package org.lunapark.dev.jmonkey3template;

import android.os.Bundle;

import com.jme3.app.AndroidHarness;

public class MainActivity extends AndroidHarness {

    public MainActivity() {
        // Set main project class (fully qualified path)
        appClass = Game.class.getCanonicalName();

        // Change options here

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
