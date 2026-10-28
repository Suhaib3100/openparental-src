package com.tencent.liteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class V2TXLivePremierJni {
    private static final String TAG = ProtectedSandApp.s("吉\u0001");
    private static long mNativeV2TXLivePremierJni;
    private static V2TXLivePremier.V2TXLivePremierObserver sObserver;

    static {
        SoLoader.loadAllLibraries();
        mNativeV2TXLivePremierJni = 0L;
    }

    public static int callExperimentalAPI(String str) {
        createNativeV2TXLivePremierIfNeed();
        return nativeCallExperimentalAPI(mNativeV2TXLivePremierJni, str);
    }

    private static void createNativeV2TXLivePremierIfNeed() {
        synchronized (V2TXLivePremierJni.class) {
            try {
                if (mNativeV2TXLivePremierJni == 0) {
                    mNativeV2TXLivePremierJni = nativeCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int enableAudioCaptureObserver(boolean z4, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            LiteavLog.w(ProtectedSandApp.s("吉\u0001"), ProtectedSandApp.s("吊\u0001"));
            return -2;
        }
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableAudioCaptureObserver(mNativeV2TXLivePremierJni, z4, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    public static int enableAudioPlayoutObserver(boolean z4, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            LiteavLog.w(ProtectedSandApp.s("吉\u0001"), ProtectedSandApp.s("吋\u0001"));
            return -2;
        }
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableAudioPlayoutObserver(mNativeV2TXLivePremierJni, z4, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    public static int enableVoiceEarMonitorObserver(boolean z4) {
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableVoiceEarMonitorObserver(mNativeV2TXLivePremierJni, z4);
    }

    public static long getObjectAddress(Object obj) {
        createNativeV2TXLivePremierIfNeed();
        return nativeGetObjectAddress(mNativeV2TXLivePremierJni, obj);
    }

    private static native int nativeCallExperimentalAPI(long j4, String str);

    private static native long nativeCreate();

    private static native int nativeEnableAudioCaptureObserver(long j4, boolean z4, int i4, int i5, int i6, int i7);

    private static native int nativeEnableAudioPlayoutObserver(long j4, boolean z4, int i4, int i5, int i6, int i7);

    private static native int nativeEnableVoiceEarMonitorObserver(long j4, boolean z4);

    private static native long nativeGetObjectAddress(long j4, Object obj);

    private static native void nativeReleaseObjectAddress(long j4, long j5);

    public static void onAudioCaptureData(byte[] bArr, long j4, int i4, int i5) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i4;
        v2TXLiveAudioFrame.channel = i5;
        v2TXLiveAudioFrame.timestamp = j4;
        v2TXLivePremierObserver.onCaptureAudioFrame(v2TXLiveAudioFrame);
    }

    public static void onAudioPlayoutData(byte[] bArr, long j4, int i4, int i5) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i4;
        v2TXLiveAudioFrame.channel = i5;
        v2TXLiveAudioFrame.timestamp = j4;
        v2TXLivePremierObserver.onPlayoutAudioFrame(v2TXLiveAudioFrame);
    }

    public static void onEarMonitoringData(byte[] bArr, int i4, int i5) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i4;
        v2TXLiveAudioFrame.channel = i5;
        v2TXLivePremierObserver.onVoiceEarMonitorAudioFrame(v2TXLiveAudioFrame);
    }

    public static void releaseObjectAddress(long j4) {
        createNativeV2TXLivePremierIfNeed();
        nativeReleaseObjectAddress(mNativeV2TXLivePremierJni, j4);
    }

    public static void setObserver(V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        sObserver = v2TXLivePremierObserver;
    }
}
