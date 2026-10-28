package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class HonorFeatureKitManager {
    private static final int PACKAGE_INFO_FLAG = 0;
    private static final int SUB_VERSION_MASK = 1000;
    public static long mMinVersion;
    private static HonorFeatureKitManager sInstance;
    private IHonorAudioServiceCallback mCallBack = null;
    private static final String ENGINE_PACKAGE_NAME = ProtectedSandApp.s("嵄\u0001");
    private static final String TAG = ProtectedSandApp.s("嵅\u0001");
    private static final Object SET_CALL_BACK_LOCK = new Object();
    private static final Object NEW_FEATUREMANAGER_LOCK = new Object();
    private static final Object BIND_SERVICE_LOCK = new Object();
    private static final Object UNBIND_SERVICE_LOCK = new Object();

    private HonorFeatureKitManager() {
    }

    public static HonorFeatureKitManager getInstance() {
        HonorFeatureKitManager honorFeatureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            try {
                if (sInstance == null) {
                    sInstance = new HonorFeatureKitManager();
                }
                honorFeatureKitManager = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return honorFeatureKitManager;
    }

    public static boolean isAudioKitSupport(Context context) {
        String s4 = ProtectedSandApp.s("嵅\u0001");
        if (context == null) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("嵆\u0001"));
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager == null) {
                HonorLogUtils.error(s4, ProtectedSandApp.s("嵉\u0001"));
                return false;
            }
            int i4 = packageManager.getPackageInfo(ProtectedSandApp.s("嵄\u0001"), 0).versionCode / 1000;
            long j4 = i4;
            if (j4 > 1000001) {
                j4 = 1000001;
            }
            mMinVersion = j4;
            HonorLogUtils.info(s4, ProtectedSandApp.s("嵇\u0001") + i4 + ProtectedSandApp.s("嵈\u0001"));
            return true;
        } catch (Throwable unused) {
            HonorLogUtils.error(s4, ProtectedSandApp.s("嵊\u0001"));
            return false;
        }
    }

    public void bindService(Context context, ServiceConnection serviceConnection, String str) {
        synchronized (BIND_SERVICE_LOCK) {
            try {
                if (context == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(ProtectedSandApp.s("嵄\u0001"), str);
                try {
                    HonorLogUtils.info(ProtectedSandApp.s("嵅\u0001"), ProtectedSandApp.s("嵋\u0001"));
                    context.bindService(intent, serviceConnection, 1);
                } catch (Throwable th) {
                    HonorLogUtils.error(ProtectedSandApp.s("嵅\u0001"), ProtectedSandApp.s("嵌\u0001") + th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public <T extends HonorAudioFeaturesKit> T createFeatureKit(int i4, Context context) {
        String concat = ProtectedSandApp.s("嵍\u0001").concat(String.valueOf(i4));
        String s4 = ProtectedSandApp.s("嵅\u0001");
        HonorLogUtils.info(s4, concat);
        if (context == null) {
            return null;
        }
        if (i4 == 1) {
            HonorEarReturnClient honorEarReturnClient = new HonorEarReturnClient(context);
            honorEarReturnClient.initialize(context);
            return honorEarReturnClient;
        }
        if (i4 != 2) {
            if (i4 == 3) {
                HonorAudioPlayClient honorAudioPlayClient = new HonorAudioPlayClient(context);
                honorAudioPlayClient.initialize(context);
                return honorAudioPlayClient;
            }
            if (i4 != 4) {
                HonorLogUtils.info(s4, ProtectedSandApp.s("嵎\u0001"));
                return null;
            }
        }
        HonorAdvancedRecordClient honorAdvancedRecordClient = new HonorAdvancedRecordClient(context);
        honorAdvancedRecordClient.initialize(context);
        return honorAdvancedRecordClient;
    }

    protected IHonorAudioServiceCallback getCallBack() {
        return this.mCallBack;
    }

    public void onCallBack(int i4) {
        HonorLogUtils.info(ProtectedSandApp.s("嵅\u0001"), ProtectedSandApp.s("嵏\u0001").concat(String.valueOf(i4)));
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

    public void setCallBack(IHonorAudioServiceCallback iHonorAudioServiceCallback) {
        this.mCallBack = iHonorAudioServiceCallback;
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        HonorLogUtils.info(ProtectedSandApp.s("嵅\u0001"), ProtectedSandApp.s("嵐\u0001"));
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
