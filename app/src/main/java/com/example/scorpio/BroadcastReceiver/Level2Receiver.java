package com.example.scorpio.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Scorpio on 16/3/6.
 */
public class Level2Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message = getResultData();
        System.out.println("市级部门得到升级的消息：" + message);
        setResultData("给农民兄弟发2K蚊");
    }
}
