package com.luck.picture.lib.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.d0;
import com.flashget.kid.common.ui.notification.a;
import com.flashget.kid.common.ui.notification.c;
import com.flashget.kid.common.ui.notification.g;
import com.flashget.kid.common.ui.notification.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.utils.SdkVersionUtils;

/* loaded from: classes6.dex */
public class ForegroundService extends Service {
    private static final int NOTIFICATION_ID = 1;
    private static final String CHANNEL_NAME = ProtectedSandApp.s("ᛅ\u0001");
    private static final String CHANNEL_ID = ProtectedSandApp.s("ᛆ\u0001").concat(ForegroundService.class.getName());
    private static boolean isForegroundServiceIng = false;

    private Notification createForegroundNotification() {
        int i4 = SdkVersionUtils.isMaxN() ? 4 : 0;
        if (SdkVersionUtils.isO()) {
            h.a();
            NotificationChannel a5 = g.a(CHANNEL_ID, ProtectedSandApp.s("ᛅ\u0001"), i4);
            a5.setLightColor(-16776961);
            a5.canBypassDnd();
            a5.setBypassDnd(true);
            a.a(a5, 0);
            c.a((NotificationManager) getSystemService(ProtectedSandApp.s("ᛇ\u0001")), a5);
        }
        return new d0.n(this, CHANNEL_ID).t0(R.drawable.ps_ic_trans_1px).O(getAppName()).N(getString(SelectorProviders.getInstance().getSelectorConfig().chooseMode == SelectMimeType.ofAudio() ? R.string.ps_use_sound : R.string.ps_use_camera)).i0(true).h();
    }

    private String getAppName() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static void startForegroundService(Context context, boolean z4) {
        try {
            if (!isForegroundServiceIng && z4) {
                Intent intent = new Intent(context, (Class<?>) ForegroundService.class);
                if (SdkVersionUtils.isO()) {
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void stopService(Context context) {
        try {
            if (isForegroundServiceIng) {
                context.stopService(new Intent(context, (Class<?>) ForegroundService.class));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(1, createForegroundNotification());
    }

    @Override // android.app.Service
    public void onDestroy() {
        isForegroundServiceIng = false;
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        isForegroundServiceIng = true;
        return super.onStartCommand(intent, i4, i5);
    }
}
