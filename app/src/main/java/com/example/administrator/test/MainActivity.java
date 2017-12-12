package com.example.administrator.test;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * notification
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private NotificationManager mNm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void showNotification(View view) {
        Notification.Builder builder = new Notification.Builder(this);
        // 标题
        builder.setContentTitle("10086");
        // 内容
        builder.setContentText("警告：您已欠费！");
        // 内容内大图标
        builder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(), R.mipmap.ic_launcher_round));
        // 状态栏展示小图标
        builder.setSmallIcon(R.mipmap.ic_launcher);
        // 创建对象
        Notification notification = builder.build();
        // 开启通知
        mNm.notify(1, notification);
    }

    public void closeNotification(View view) {
        // 关闭此通知
        mNm.cancel(1);
    }

}