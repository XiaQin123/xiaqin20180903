package com.bwie.xiaqin.xiaqin20180903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bwie.xiaqin.xiaqin20180903.View.MyTextView;

public class MainActivity extends AppCompatActivity {

    private MyTextView My_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        My_TextView = findViewById(R.id.My_TextView);
    }
}
