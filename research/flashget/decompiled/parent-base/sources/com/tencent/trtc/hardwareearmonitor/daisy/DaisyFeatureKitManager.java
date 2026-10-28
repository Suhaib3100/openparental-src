package com.tencent.trtc.hardwareearmonitor.daisy;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;

/* loaded from: classes7.dex */
public class DaisyFeatureKitManager {
    private static final int PACKAGE_INFO_FLAG = 0;
    private static DaisyFeatureKitManager sInstance;
    private IDaisyAudioKitCallback mCallBack = null;
    private static final String ENGINE_PACKAGE_NAME = ProtectedSandApp.s("峎\u0001");
    private static final String TAG = ProtectedSandApp.s("峏\u0001");
    private static final Object SET_CALL_BACK_LOCK = new Object();
    private static final Object NEW_FEATUREMANAGER_LOCK = new Object();
    private static final Object BIND_SERVICE_LOCK = new Object();
    private static final Object UNBIND_SERVICE_LOCK = new Object();

    protected static DaisyFeatureKitManager getInstance() {
        DaisyFeatureKitManager daisyFeatureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            try {
                if (sInstance == null) {
                    sInstance = new DaisyFeatureKitManager();
                }
                daisyFeatureKitManager = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return daisyFeatureKitManager;
    }

    public static boolean isAudioKitSupport(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            return packageManager.getPackageInfo(ProtectedSandApp.s("峎\u0001"), 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            LiteavLog.e(ProtectedSandApp.s("峏\u0001"), ProtectedSandApp.s("峐\u0001"));
            return false;
        }
    }

    protected void bindService(Context context, ServiceConnection serviceConnection, String str) {
        synchronized (BIND_SERVICE_LOCK) {
            try {
                if (context == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(ProtectedSandApp.s("峎\u0001"), str);
                try {
                    context.bindService(intent, serviceConnection, 1);
                } catch (SecurityException e4) {
                    LiteavLog.e(ProtectedSandApp.s("峏\u0001"), ProtectedSandApp.s("峑\u0001"), e4.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected <T extends DaisyAudioFeaturesKit> T createFeatureKit(int i4, Context context) {
        if (context == null || i4 != 1) {
            return null;
        }
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = new DaisyAudioKaraokeFeatureKit(context);
        daisyAudioKaraokeFeatureKit.initialize(context);
        return daisyAudioKaraokeFeatureKit;
    }

    protected IDaisyAudioKitCallback getCallBack() {
        return this.mCallBack;
    }

    protected void onCallBack(int i4) {
        synchronized (SET_CALL_BACK_LOCK) {
            try {
                if (getCallBack() != null) {
                    getCallBack().onResult(i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void setCallBack(IDaisyAudioKitCallback iDaisyAudioKitCallback) {
        this.mCallBack = iDaisyAudioKitCallback;
    }

    protected void unbindService(Context context, ServiceConnection serviceConnection) {
        synchronized (UNBIND_SERVICE_LOCK) {
            if (context != null) {
                try {
                    context.unbindService(serviceConnection);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
