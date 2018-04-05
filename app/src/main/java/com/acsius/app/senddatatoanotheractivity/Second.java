package com.acsius.app.senddatatoanotheractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = (TextView)findViewById(R.id.text_id);
        String getdata=getIntent().getStringExtra("Senddata");
        textView.setText(getdata);
    }
}
