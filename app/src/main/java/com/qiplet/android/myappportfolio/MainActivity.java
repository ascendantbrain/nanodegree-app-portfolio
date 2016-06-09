package com.qiplet.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final static String TAG = MainActivity.class.getSimpleName();
    private final static boolean DEBUG = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);

        if (button1 != null) button1.setOnClickListener(this);
        if (button2 != null) button2.setOnClickListener(this);
        if (button3 != null) button3.setOnClickListener(this);
        if (button4 != null) button4.setOnClickListener(this);
        if (button5 != null) button5.setOnClickListener(this);
        if (button6 != null) button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String buttonText = (view instanceof Button) ? (String)((Button) view).getText() : "";
        String toastMsg = String.format(getString(R.string.main_button_toast),buttonText);
        Toast.makeText(MainActivity.this,toastMsg,Toast.LENGTH_SHORT).show();
    }
}
