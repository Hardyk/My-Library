package com.hkv.my_library;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hkv.mylibrary.MathFunctions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Main Activity", "  Substraction of 10 & 5: " + MathFunctions.subStract(10, 5));
        Log.e("Main Activity", "  Addition of 10 & 5: " + MathFunctions.addition(10, 5));
        Log.e("Main Activity", "  Mulipication of 10 & 5: " + MathFunctions.multiply(10, 5));
        Log.e("Main Activity", "  Division of 10 & 5: " + MathFunctions.devide(10, 5));
    }
}
