package com.yousufsohail.appbackgroundforeground;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void gotoSecondActivity(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
