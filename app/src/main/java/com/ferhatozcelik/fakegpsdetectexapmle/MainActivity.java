package com.ferhatozcelik.fakegpsdetectexapmle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ferhatozcelik.fakegpsdetect.FakeGpsDetect;

public class MainActivity extends AppCompatActivity {

    TextView status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        status = findViewById(R.id.status);
        FakeGpsDetect fakeGpsDetect = new FakeGpsDetect();
        if(fakeGpsDetect.isFakeGpsAppLaod(MainActivity.this)){
            status.setText("Fake Gps: True");
        }else{
            status.setText("Fake Gps: False");
        }

    }
}