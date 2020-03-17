package com.example.first;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.e("Nhan","Service da duoc khoi tao ");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.e("Nhan","Service da duoc huy");
    }
}
