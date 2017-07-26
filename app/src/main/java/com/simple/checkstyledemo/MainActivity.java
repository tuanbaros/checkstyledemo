package com.simple.checkstyledemo;

import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;

@Keep
public class MainActivity extends AppCompatActivity {

    private int s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 3;
        test(i);
    }

    private void test(int a) {
        if (a > 3){
            return;
        }
        s = a;
    }
}
