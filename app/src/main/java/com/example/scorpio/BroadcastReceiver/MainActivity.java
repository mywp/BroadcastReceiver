package com.example.scorpio.BroadcastReceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*发送无序广播*/
    public void send1(View view) {
        Intent intent = new Intent();
        intent.setAction("com.example.scorpio.BroadcastReceiver.songwennuan");
        intent.putExtra("msg", "发1W块");
        //无序广播，不可被拦截，不可终止
        sendBroadcast(intent);
    }

    /*发送有序广播*/
    public void send2(View view) {
        Intent intent = new Intent();
        intent.setAction("com.example.scorpio.BroadcastReceiver.songwennuan");
        //有序广播，可被拦截，不可终止
        sendOrderedBroadcast(intent, null, new FinalReceiver(), null, Toast.LENGTH_SHORT, "给兄弟发1W蚊", null);
    }

}
