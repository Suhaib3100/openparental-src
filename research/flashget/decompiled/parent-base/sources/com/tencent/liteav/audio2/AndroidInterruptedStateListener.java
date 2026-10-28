package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.flashget.kid.common.webrtc.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio2.d;
import com.tencent.liteav.audio2.e;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.Executor;

@JNINamespace("liteav::audio")
/* loaded from: classes7.dex */
public class AndroidInterruptedStateListener implements d.a, e.b {
    private static final int RECORDING_CONFIGS_LIMIT = 10;
    public static final String TAG = ProtectedSandApp.s("兎\u0001");
    private static d mRecordingCallback = new d();
    private final long mNativeRecordingConfigListener;
    private volatile boolean mNeedNotify = false;
    private Object mObject = new Object();
    private e mPhoneStateManager;

    static class RecordingConfig {

        /* renamed from: a, reason: collision with root package name */
        int f71742a = 0;

        /* renamed from: b, reason: collision with root package name */
        boolean f71743b = false;

        public int getSessionId() {
            return this.f71742a;
        }

        public boolean isSilenced() {
            return this.f71743b;
        }
    }

    public AndroidInterruptedStateListener(long j4) {
        this.mNativeRecordingConfigListener = j4;
        Log.d(ProtectedSandApp.s("兎\u0001"), ProtectedSandApp.s("兏\u0001") + hashCode(), new Object[0]);
    }

    static /* synthetic */ void lambda$registerAudioRecordingCallback$0(AndroidInterruptedStateListener androidInterruptedStateListener) {
        if (androidInterruptedStateListener.mPhoneStateManager == null) {
            androidInterruptedStateListener.mPhoneStateManager = new e(androidInterruptedStateListener);
        }
        e eVar = androidInterruptedStateListener.mPhoneStateManager;
        boolean b5 = e.b();
        String s4 = ProtectedSandApp.s("児\u0001");
        if (b5) {
            try {
                TelephonyManager telephonyManager = eVar.f71751a;
                if (telephonyManager != null) {
                    telephonyManager.listen(eVar, 32);
                } else {
                    Log.w(s4, ProtectedSandApp.s("兑\u0001"), new Object[0]);
                }
            } catch (Throwable th) {
                Log.e(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("兒\u0001"))), new Object[0]);
            }
        } else {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31) {
                try {
                    if (eVar.f71753d == null) {
                        eVar.f71753d = Class.forName(ProtectedSandApp.s("兓\u0001"));
                    }
                    if (eVar.f71754e == null) {
                        eVar.f71754e = Proxy.newProxyInstance(eVar.f71753d.getClassLoader(), new Class[]{eVar.f71753d}, new e.a(eVar));
                    }
                    AudioManager.class.getMethod(ProtectedSandApp.s("兔\u0001"), Executor.class, eVar.f71753d).invoke(eVar.f71752b, h.a(eVar), eVar.f71754e);
                } catch (Throwable th2) {
                    Log.e(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th2, new StringBuilder(ProtectedSandApp.s("兕\u0001"))), new Object[0]);
                }
            } else if (i4 >= 26 && e.f71750c != null) {
                Log.i(s4, ProtectedSandApp.s("兖\u0001"), new Object[0]);
                e.f71750c.f71748a = eVar;
            }
        }
        eVar.f71755f.a(f.a(eVar));
    }

    static /* synthetic */ void lambda$unregisterAudioRecordingCallback$1(AndroidInterruptedStateListener androidInterruptedStateListener) {
        e eVar = androidInterruptedStateListener.mPhoneStateManager;
        if (eVar != null) {
            boolean b5 = e.b();
            String s4 = ProtectedSandApp.s("児\u0001");
            if (b5) {
                try {
                    TelephonyManager telephonyManager = eVar.f71751a;
                    if (telephonyManager != null) {
                        telephonyManager.listen(eVar, 0);
                    }
                    eVar.f71756g = 0;
                    return;
                } catch (Throwable th) {
                    Log.e(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("兗\u0001"))), new Object[0]);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 31) {
                e.c();
                return;
            }
            try {
                Class<?> cls = eVar.f71753d;
                if (cls == null || eVar.f71754e == null) {
                    return;
                }
                AudioManager.class.getMethod(ProtectedSandApp.s("兘\u0001"), cls).invoke(eVar.f71752b, eVar.f71754e);
            } catch (Throwable th2) {
                Log.e(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th2, new StringBuilder(ProtectedSandApp.s("兙\u0001"))), new Object[0]);
            }
        }
    }

    private static native void nativeNotifyAudioRecordingConfigChangedFromJava(long j4, RecordingConfig[] recordingConfigArr);

    private static native void nativeNotifyInterruptedByPhoneCallFromJava(long j4);

    private static native void nativeNotifyResumedByPhoneCallFromJava(long j4);

    @Override // com.tencent.liteav.audio2.d.a
    public void OnRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        if (list == null) {
            return;
        }
        int min = Math.min(list.size(), 10);
        RecordingConfig[] recordingConfigArr = new RecordingConfig[min];
        for (int i4 = 0; i4 < min; i4++) {
            recordingConfigArr[i4] = new RecordingConfig();
            AudioRecordingConfiguration audioRecordingConfiguration = list.get(i4);
            recordingConfigArr[i4].f71742a = audioRecordingConfiguration.getClientAudioSessionId();
            if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
                recordingConfigArr[i4].f71743b = false;
            } else if (Build.VERSION.SDK_INT >= 29) {
                recordingConfigArr[i4].f71743b = i0.a(audioRecordingConfiguration);
            }
        }
        synchronized (this.mObject) {
            try {
                if (this.mNeedNotify) {
                    nativeNotifyAudioRecordingConfigChangedFromJava(this.mNativeRecordingConfigListener, recordingConfigArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.audio2.e.b
    public void onInterruptedByPhoneCall() {
        synchronized (this.mObject) {
            try {
                if (this.mNeedNotify) {
                    nativeNotifyInterruptedByPhoneCallFromJava(this.mNativeRecordingConfigListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.audio2.e.b
    public void onResumedByPhoneCall() {
        synchronized (this.mObject) {
            try {
                if (this.mNeedNotify) {
                    nativeNotifyResumedByPhoneCallFromJava(this.mNativeRecordingConfigListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerAudioRecordingCallback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 24) {
            return;
        }
        d dVar = mRecordingCallback;
        if (dVar != null) {
            dVar.f71749a = this;
        }
        ThreadUtils.getUiThreadHandler().post(a.a(this));
        this.mNeedNotify = true;
    }

    public void unregisterAudioRecordingCallback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 24 && mRecordingCallback != null) {
            synchronized (this.mObject) {
                this.mNeedNotify = false;
                mRecordingCallback.f71749a = null;
                ThreadUtils.getUiThreadHandler().post(b.a(this));
            }
        }
    }
}
