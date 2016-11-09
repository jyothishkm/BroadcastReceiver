package com.example.bridgeit.broadcastreceivers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button mBroadcast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBroadcast = (Button)findViewById(R.id.btn_broad);
    }

    public void broadcastIntent(View view) {
        Intent intent = new Intent();
        intent.setAction("com.broadcast.CUSTOM_INTENT");
        sendBroadcast(intent);

    }
}
