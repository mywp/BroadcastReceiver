package com.example.scorpio.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Scorpio on 16/3/6.
 */
public class Level1Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message = getResultData();
        System.out.println("省级部门得到中央的消息：" + message);
        abortBroadcast();
        setResultData("给农民兄弟发5K蚊");
    }
}
