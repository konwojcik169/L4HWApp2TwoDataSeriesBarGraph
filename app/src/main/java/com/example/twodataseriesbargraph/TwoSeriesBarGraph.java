package com.example.twodataseriesbargraph;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

public class TwoSeriesBarGraph extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_series_bar_graph);

        GraphView graph = findViewById(R.id.graph);

        int iksy[] = {1, 2, 3, 4, 5};
        double data1[] = {2.5, 1, 4, 2.5, 5};
        double data2[] = {5, 2.5, 1, 4, 2.5};

        BarGraphSeries<DataPoint> series = new BarGraphSeries<>();
        BarGraphSeries<DataPoint> series2 = new BarGraphSeries<>();

        for(int i = 0; i<5; i++) {
            series.appendData(new DataPoint(iksy[i],data1[i]), true, 100, true);
            series2.appendData(new DataPoint(iksy[i],data2[i]), true, 100, true);
        }

        graph.addSeries(series);
        graph.addSeries(series2);

        series.setColor(Color.RED);
        series.setSpacing(50);
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.BLACK);
        series.setValuesOnTopSize(30);

        series2.setColor(Color.BLUE);
        series2.setSpacing(50);
        series2.setDrawValuesOnTop(true);
        series2.setValuesOnTopColor(Color.BLACK);
        series2.setValuesOnTopSize(30);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(6);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(6);


    }
}
