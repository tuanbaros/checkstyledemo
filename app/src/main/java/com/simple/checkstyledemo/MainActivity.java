package com.simple.checkstyledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.Application;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 3;
        test(i);
    }

    private void test(int a) {
        if (a > 3) return;
        System.out.println(a);
    }
}
