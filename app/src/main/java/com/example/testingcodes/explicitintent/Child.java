package com.example.testingcodes.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.testingcodes.R;

public class Child extends AppCompatActivity {
    private TextView mDisplayText;
    private static final String mTAG = Child.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_child);

        mDisplayText = findViewById(R.id.tv_display);

        Intent getMainActivityIntent=getIntent();
        Log.d(mTAG , "GetMainActivityIntent is "+ getMainActivityIntent.toString());

        if(getMainActivityIntent.hasExtra(Intent.EXTRA_TEXT)) {
            String dataFromMainActivity = getMainActivityIntent.getStringExtra(Intent.EXTRA_TEXT);
            Log.d(mTAG, "DataFromMainActivity is " + dataFromMainActivity);
            mDisplayText.setText(dataFromMainActivity);
        }
    }

    }

