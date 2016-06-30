package com.mac.codingtestarrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Integer> array1 = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8, 9, 12));
        List<Integer> array2 = new ArrayList<Integer>(Arrays.asList(2, 2, 3, 4, 4, 4, 4, 5, 5, 7, 8, 9, 10, 10, 10, 11));

        List<Integer> result = new MergeArrays().merge(array1, array2);


        TextView t = (TextView) findViewById(R.id.text);
        t.setText(result.toString());

    }



}
