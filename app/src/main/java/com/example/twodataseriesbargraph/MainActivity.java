package com.example.twodataseriesbargraph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawchart(View v) {
        if (v.getId() == R.id.button) {
            Intent intent = new Intent(this, TwoSeriesBarGraph.class);
            startActivity(intent);
        }
    }
}
