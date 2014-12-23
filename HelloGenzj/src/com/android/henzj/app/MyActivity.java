package com.android.henzj.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.Random;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Random random = new Random();
        int digit = random.nextInt(1000000);
        if (v.getId() == R.id.button) {
            ((TextView)findViewById(R.id.textView)).setText(Integer.toString(digit));
        }
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.main);
        findViewById(R.id.button).setOnClickListener(this);
    }
}
