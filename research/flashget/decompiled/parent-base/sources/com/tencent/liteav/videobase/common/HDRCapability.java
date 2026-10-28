package com.tencent.liteav.videobase.common;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.Display;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.l;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class HDRCapability {
    private static Boolean sIsHDR10Supported;
    private static final String TAG = ProtectedSandApp.s("哏\u0001");
    private static final l sSequenceTaskRunner = new l();

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIsHDR10Supported() {
        synchronized (HDRCapability.class) {
            try {
                if (sIsHDR10Supported != null) {
                    return;
                }
                try {
                    boolean isDisplaySupportHDR10 = isDisplaySupportHDR10();
                    boolean isDecoderSupportHDR10 = isDecoderSupportHDR10();
                    synchronized (HDRCapability.class) {
                        Boolean valueOf = Boolean.valueOf(isDisplaySupportHDR10 && isDecoderSupportHDR10);
                        sIsHDR10Supported = valueOf;
                        LiteavLog.i(ProtectedSandApp.s("哏\u0001"), ProtectedSandApp.s("哐\u0001"), valueOf);
                    }
                } catch (Throwable th) {
                    LiteavLog.e(ProtectedSandApp.s("哏\u0001"), ProtectedSandApp.s("哑\u0001"), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean hasHDR10ProfileLevel(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == 4096) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDecoderSupportHDR10() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                String s4 = ProtectedSandApp.s("哒\u0001");
                if (str.contains(s4) && hasHDR10ProfileLevel(mediaCodecInfo.getCapabilitiesForType(s4).profileLevels)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isDisplaySupportHDR10() {
        WindowManager windowManager;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService(ProtectedSandApp.s("哓\u0001"))) == null || (hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities()) == null) {
            return false;
        }
        for (int i4 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i4 == 2) {
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean isHDRSupported(int i4) {
        synchronized (HDRCapability.class) {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 24) {
                return false;
            }
            if (i4 != b.f72205b.mValue) {
                return false;
            }
            Boolean bool = sIsHDR10Supported;
            if (bool != null) {
                return bool.booleanValue();
            }
            sSequenceTaskRunner.a(a.a());
            return false;
        }
    }
}
