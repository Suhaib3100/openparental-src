package com.tencent.rtmp.video;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Binder;
import android.os.IBinder;
import com.flashget.kid.common.ui.notification.c;
import com.flashget.kid.common.ui.notification.g;
import com.flashget.kid.common.ui.notification.j;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class ScreenCaptureService extends Service {
    private static final int NOTIFICATION_ID = 13957237;
    private static final String CHANNEL_ID = ProtectedSandApp.s("尭\u0001");
    private static final String TAG = ProtectedSandApp.s("尰\u0001");

    private Notification createNotification() {
        int systemOSVersion = BaseBridge.getSystemOSVersion();
        String s4 = ProtectedSandApp.s("尭\u0001");
        if (systemOSVersion >= 26) {
            c.a((NotificationManager) getSystemService(ProtectedSandApp.s("尮\u0001")), g.a(s4, ProtectedSandApp.s("尯\u0001"), 2));
        }
        Notification.Builder defaults = new Notification.Builder(this).setDefaults(1);
        if (BaseBridge.getSystemOSVersion() >= 26) {
            j.a(defaults, s4);
        }
        return defaults.build();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        BaseBridge.printLog(ProtectedSandApp.s("尰\u0001"), ProtectedSandApp.s("就\u0001"));
        return new Binder();
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        MediaProjection mediaProjection;
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("尲\u0001"), -1);
        Intent intent2 = (Intent) intent.getParcelableExtra(ProtectedSandApp.s("尳\u0001"));
        String str = ProtectedSandApp.s("尴\u0001") + intExtra + ProtectedSandApp.s("尵\u0001") + intent2;
        String s4 = ProtectedSandApp.s("尰\u0001");
        BaseBridge.printLog(s4, str);
        if (intent2 == null) {
            stopSelf();
            return 2;
        }
        try {
            if (BaseBridge.getSystemOSVersion() >= 29) {
                startForeground(NOTIFICATION_ID, createNotification(), 32);
            } else if (BaseBridge.getSystemOSVersion() >= 26) {
                startForeground(NOTIFICATION_ID, createNotification());
            }
        } catch (Throwable th) {
            BaseBridge.printLog(s4, ProtectedSandApp.s("尶\u0001").concat(String.valueOf(th)));
        }
        if (BaseBridge.getSystemOSVersion() >= 21) {
            Context appContext = BaseBridge.getAppContext();
            String s5 = ProtectedSandApp.s("尷\u0001");
            try {
                mediaProjection = (appContext != null ? (MediaProjectionManager) BaseBridge.getAppContext().getSystemService(s5) : (MediaProjectionManager) getSystemService(s5)).getMediaProjection(intExtra, intent2);
            } catch (Throwable th2) {
                BaseBridge.printLog(s4, ProtectedSandApp.s("尸\u0001").concat(String.valueOf(th2)));
                mediaProjection = null;
            }
            VirtualDisplayManagerProxy.getInstance().signalSessionRequestFinish(mediaProjection);
        }
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        BaseBridge.printLog(ProtectedSandApp.s("尰\u0001"), ProtectedSandApp.s("尹\u0001"));
        return super.onUnbind(intent);
    }
}
