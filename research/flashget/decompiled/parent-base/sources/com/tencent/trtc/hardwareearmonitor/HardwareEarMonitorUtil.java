package com.tencent.trtc.hardwareearmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class HardwareEarMonitorUtil extends BroadcastReceiver {
    private Context mContext;
    private String mDeviceAddress;
    private String mDeviceName;
    private IntentFilter mFilter;
    private Object mLock;
    private long mNativeHardwareEarMonitorHandle;
    private String mPortName;
    private int mHeadsetState = -1;
    private int mHasMicrophone = -1;

    public HardwareEarMonitorUtil(long j4) {
        this.mNativeHardwareEarMonitorHandle = 0L;
        String s4 = ProtectedSandApp.s("岫\u0001");
        this.mDeviceName = s4;
        this.mPortName = s4;
        this.mDeviceAddress = s4;
        this.mLock = new Object();
        this.mContext = ContextUtils.getApplicationContext();
        this.mNativeHardwareEarMonitorHandle = j4;
        try {
            IntentFilter intentFilter = new IntentFilter(ProtectedSandApp.s("岬\u0001"));
            this.mFilter = intentFilter;
            this.mContext.registerReceiver(this, intentFilter);
        } catch (Throwable unused) {
        }
    }

    public static HardwareEarMonitorUtil create(long j4) {
        return new HardwareEarMonitorUtil(j4);
    }

    private static native void nativeHeadsetDescChanged(long j4, int i4, int i5, String str, String str2, String str3);

    public void destroy() {
        Context context = this.mContext;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        if (this.mFilter != null) {
            this.mFilter = null;
        }
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (ProtectedSandApp.s("岬\u0001").equals(intent.getAction())) {
            synchronized (this.mLock) {
                try {
                    this.mHeadsetState = intent.getIntExtra(ProtectedSandApp.s("岭\u0001"), -1);
                    this.mHasMicrophone = intent.getIntExtra(ProtectedSandApp.s("岮\u0001"), -1);
                    this.mDeviceName = intent.getStringExtra(ProtectedSandApp.s("岯\u0001"));
                    this.mPortName = intent.getStringExtra(ProtectedSandApp.s("岰\u0001"));
                    String stringExtra = intent.getStringExtra(ProtectedSandApp.s("岱\u0001"));
                    this.mDeviceAddress = stringExtra;
                    long j4 = this.mNativeHardwareEarMonitorHandle;
                    int i4 = this.mHeadsetState;
                    int i5 = this.mHasMicrophone;
                    String str = this.mDeviceName;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = this.mPortName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    nativeHeadsetDescChanged(j4, i4, i5, str, str2, stringExtra);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
