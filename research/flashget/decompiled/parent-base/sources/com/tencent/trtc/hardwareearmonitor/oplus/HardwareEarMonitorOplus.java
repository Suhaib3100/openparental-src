package com.tencent.trtc.hardwareearmonitor.oplus;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import androidx.constraintlayout.core.parser.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.l;
import com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface;

@JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class HardwareEarMonitorOplus {
    private static final int AUTHENTICATE_FAIL = 1002;
    private static final int KARAOKE_MESSAGE_CODE = 3000;
    private static final int KARAOKE_SUCCESS = 1000;
    private static final int ON_BIND_EXCEPTION = 1012;
    private static final int OPEN_CAPABILITY_THIRD_PROVIDER_NOT_FOUND = 1013;
    private OplusKaraokeServiceAidlInterface mKaraokeServiceInterface;
    private long mNativeHardwareEarMonitorHandle;
    private Intent mServiceIntent;
    private static final String TAG = ProtectedSandApp.s("嵩\u0001");
    private static final String AUTH_URI = ProtectedSandApp.s("嵪\u0001");
    private Object mLock = new Object();
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("嵨\u0001"));
    private Context mContext = ContextUtils.getApplicationContext();
    private KaraokeServiceConnection mConnection = new KaraokeServiceConnection();
    private l mTaskRunner = new l();

    public class KaraokeServiceConnection implements ServiceConnection {
        private String mDescName;

        public KaraokeServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            OplusKaraokeServiceAidlInterface.Stub.setDESCRIPTOR(this.mDescName);
            HardwareEarMonitorOplus.this.mKaraokeServiceInterface = OplusKaraokeServiceAidlInterface.Stub.asInterface(iBinder);
            OplusKaraokeServiceAidlInterface oplusKaraokeServiceAidlInterface = HardwareEarMonitorOplus.this.mKaraokeServiceInterface;
            String s4 = ProtectedSandApp.s("嵤\u0001");
            if (oplusKaraokeServiceAidlInterface != null) {
                LiteavLog.i(s4, ProtectedSandApp.s("嵥\u0001"));
                HardwareEarMonitorOplus.this.notifyResult(1000);
            } else {
                LiteavLog.i(s4, ProtectedSandApp.s("嵦\u0001"));
                HardwareEarMonitorOplus.this.notifyResult(1012);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HardwareEarMonitorOplus.this.mKaraokeServiceInterface = null;
            LiteavLog.i(ProtectedSandApp.s("嵤\u0001"), ProtectedSandApp.s("嵧\u0001"));
            HardwareEarMonitorOplus.this.notifyResult(1012);
        }

        void setDescName(String str) {
            this.mDescName = str;
        }
    }

    public HardwareEarMonitorOplus(long j4) {
        this.mNativeHardwareEarMonitorHandle = j4;
    }

    public static HardwareEarMonitorOplus create(long j4) {
        return new HardwareEarMonitorOplus(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandleResult(long j4, int i4);

    public void authCheck(String str) {
        Bundle bundle;
        String s4 = ProtectedSandApp.s("嵩\u0001");
        Uri parse = Uri.parse(ProtectedSandApp.s("嵪\u0001"));
        Messenger messenger = new Messenger(new Handler(this.mContext.getMainLooper()) { // from class: com.tencent.trtc.hardwareearmonitor.oplus.HardwareEarMonitorOplus.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                try {
                    super.handleMessage(message);
                    HardwareEarMonitorOplus.this.notifyResult(message.getData().getInt(ProtectedSandApp.s("嵡\u0001")));
                } catch (Throwable th) {
                    LiteavLog.i(ProtectedSandApp.s("嵣\u0001"), ProtectedSandApp.s("嵢\u0001") + th.getMessage());
                    HardwareEarMonitorOplus.this.notifyResult(1002);
                }
            }
        });
        Bundle bundle2 = new Bundle();
        bundle2.putBinder(ProtectedSandApp.s("嵫\u0001"), messenger.getBinder());
        try {
            bundle = this.mContext.getContentResolver().call(parse, ProtectedSandApp.s("嵬\u0001"), str, bundle2);
        } catch (Throwable th) {
            LiteavLog.e(s4, ProtectedSandApp.s("嵭\u0001") + th.getMessage());
            notifyResult(1013);
            bundle = null;
        }
        if (bundle == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("嵮\u0001"));
            notifyResult(1013);
        }
    }

    public void bindKaraokeService(String str, String str2, String str3) {
        this.mServiceIntent = new Intent();
        StringBuilder a5 = b.a(ProtectedSandApp.s("嵯\u0001"), str, ProtectedSandApp.s("嵰\u0001"), str2, ProtectedSandApp.s("嵱\u0001"));
        a5.append(Build.VERSION.SDK_INT);
        a5.append(ProtectedSandApp.s("嵲\u0001"));
        a5.append(getOplusOSVersionInt());
        String sb = a5.toString();
        String s4 = ProtectedSandApp.s("嵩\u0001");
        LiteavLog.i(s4, sb);
        this.mServiceIntent.setPackage(str);
        this.mServiceIntent.setAction(str2);
        this.mConnection.setDescName(str3);
        try {
            this.mContext.bindService(this.mServiceIntent, this.mConnection, 1);
        } catch (Throwable th) {
            LiteavLog.i(s4, ProtectedSandApp.s("嵳\u0001") + th.getMessage());
            notifyResult(1012);
        }
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        try {
            this.mContext.unbindService(this.mConnection);
        } catch (Throwable th) {
            LiteavLog.i(ProtectedSandApp.s("嵩\u0001"), ProtectedSandApp.s("嵴\u0001") + th.getMessage());
        }
        this.mConnection = null;
        this.mKaraokeServiceInterface = null;
    }

    public String getManifestMeta(String str) {
        try {
            return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128).metaData.getString(str);
        } catch (Throwable th) {
            LiteavLog.i(ProtectedSandApp.s("嵩\u0001"), ProtectedSandApp.s("嵵\u0001") + th.getMessage());
            return "";
        }
    }

    public int getOplusOSVersionInt() {
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("嵶\u0001"));
            return ((Integer) cls.getDeclaredMethod(ProtectedSandApp.s("嵷\u0001"), null).invoke(cls, null)).intValue();
        } catch (Throwable th) {
            LiteavLog.i(ProtectedSandApp.s("嵩\u0001"), ProtectedSandApp.s("嵸\u0001") + th.getMessage());
            return 0;
        }
    }

    public int getUidFromPackage() {
        try {
            return this.mContext.getPackageManager().getPackageUid(this.mContext.getPackageName(), 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void notifyResult(final int i4) {
        this.mTaskRunner.a(new Runnable() { // from class: com.tencent.trtc.hardwareearmonitor.oplus.HardwareEarMonitorOplus.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (HardwareEarMonitorOplus.this.mLock) {
                    HardwareEarMonitorOplus.nativeHandleResult(HardwareEarMonitorOplus.this.mNativeHardwareEarMonitorHandle, i4);
                }
            }
        });
    }

    public void setActiveClient(String str) {
        OplusKaraokeServiceAidlInterface oplusKaraokeServiceAidlInterface = this.mKaraokeServiceInterface;
        if (oplusKaraokeServiceAidlInterface != null) {
            try {
                oplusKaraokeServiceAidlInterface.setActiveClient(str);
            } catch (Throwable th) {
                LiteavLog.i(ProtectedSandApp.s("嵩\u0001"), ProtectedSandApp.s("嵹\u0001") + th.getMessage());
            }
        }
    }

    public boolean setAudioParams(String str) {
        try {
            this.mAudioManager.setParameters(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean systemFeatureSupported(String str) {
        try {
            return this.mContext.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
