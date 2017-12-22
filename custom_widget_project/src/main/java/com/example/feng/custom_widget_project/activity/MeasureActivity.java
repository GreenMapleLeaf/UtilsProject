package com.example.feng.custom_widget_project.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.feng.base.BaseActivity;
import com.example.feng.custom_widget_project.R;

/**
 * Created by Feng on 2017/12/4.
 */

public class MeasureActivity extends BaseActivity {
    private View v_1_1;
    private View v_1_2;
    private View v_1_3;
    private View v_2_1;
    private View v_2_2;
    private View v_2_3;
    private View v_3_1;
    private View v_3_2;
    private View v_3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);
        v_1_1 =   findViewById(R.id.v_1_1);
        v_1_2 =   findViewById(R.id.v_1_2);
        v_1_3 =   findViewById(R.id.v_1_3);
        v_2_1 =   findViewById(R.id.v_2_1);
        v_2_2 =   findViewById(R.id.v_2_2);
//        StatusBarCompat.
        v_2_3 =   findViewById(R.id.v_2_3);
        v_3_1 =   findViewById(R.id.v_3_1);
        v_3_2 =   findViewById(R.id.v_3_2);
        v_3_3 =   findViewById(R.id.v_3_3);
        findViewById(R.id.debug).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int v_1_1_measure_height = v_1_1.getMeasuredHeight();
                int v_1_1_height = v_1_1.getHeight();
                int v_1_2_measure_height = v_1_2.getMeasuredHeight();
                int v_1_2_height = v_1_2.getHeight();
                int v_1_3_measure_height = v_1_3.getMeasuredHeight();
                int v_1_3_height = v_1_3.getHeight();
                int v_2_1_measure_height = v_2_1.getMeasuredHeight();
                int v_2_1_height = v_2_1.getHeight();
                int v_2_2_measure_height = v_2_2.getMeasuredHeight();
                int v_2_2_height = v_2_2.getHeight();
                int v_2_3_measure_height = v_2_3.getMeasuredHeight();
                int v_2_3_height = v_2_3.getHeight();
                int v_3_1_measure_height = v_3_1.getMeasuredHeight();
                int v_3_1_height = v_3_1.getHeight();
                int v_3_2_measure_height = v_3_2.getMeasuredHeight();
                int v_3_2_height = v_3_2.getHeight();
                int v_3_3_measure_height = v_3_3.getMeasuredHeight();
                int v_3_3_height = v_3_3.getHeight();


//                int v_1_1_measure_height = v_1_1.getMeasuredHeight();
//                int v_1_1_height = v_1_1.getHeight();
//                int v_1_2_measure_height = v_1_2.getMeasuredHeight();
//                int v_1_2_height = v_1_2.getHeight();
//                int v_1_3_measure_height = v_1_3.getMeasuredHeight();
//                int v_1_3_height = v_1_3.getHeight();
                Log.i("measure", "----->");
            }
        });
    }
}
