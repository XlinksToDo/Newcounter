package com.example.one.newcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    TextView carb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        carb = (TextView) findViewById(R.id.aa);
        carb.setText(String.valueOf(count));
    }
    public void next (View v){
        count--;
        carb.setText(String.valueOf(count));
    }
    public void nwe (View v){
        count++;
        carb.setText(String.valueOf(count));
    }
    public void finish (View v){
        finish();
    }
}
