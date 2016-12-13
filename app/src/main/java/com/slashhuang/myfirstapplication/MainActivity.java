package com.slashhuang.myfirstapplication;

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
    public void openRN(View view) {
        Intent intent = new Intent(this, RnDemoActivity.class);
        startActivity(intent);
    }
    public void openRNTest(View view) {
        Intent intent = new Intent(this, RnTest.class);
        startActivity(intent);
    }
}
