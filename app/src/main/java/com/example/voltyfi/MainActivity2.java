package com.example.voltyfi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t2;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i= getIntent();
        t2 = (TextView) findViewById(R.id.output);
        t2.setText(i.getStringExtra("messaggio"));
    }
}