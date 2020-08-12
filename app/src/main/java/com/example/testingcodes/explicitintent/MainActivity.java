package com.example.testingcodes.explicitintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testingcodes.R;

public class MainActivity extends AppCompatActivity {
    private EditText mNameEntry;
    private Button mDoSomethingCoolButton;
    private String editTextData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDoSomethingCoolButton = findViewById(R.id.b_do_something_cool);
        mNameEntry = findViewById(R.id.et_text_entry);

        /* Setting an OnClickListener allows us to do something when this button is clicked. */
        mDoSomethingCoolButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editTextData=mNameEntry.getText().toString();

                Intent startChildActivityIntent =new Intent(MainActivity.this, Child.class);
                startChildActivityIntent.putExtra(Intent.EXTRA_TEXT,editTextData);

                startActivity(startChildActivityIntent);
            }
        });

    }

    }

