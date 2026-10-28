package com.tencent.trtc.hardwareearmonitor.vivo;

import android.media.AudioManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class HardwareEarMonitorVivo {
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("嶀\u0001"));
    private long mNativeHardwareEarMonitorHandle;

    public HardwareEarMonitorVivo(long j4) {
        this.mNativeHardwareEarMonitorHandle = j4;
    }

    public static HardwareEarMonitorVivo create(long j4) {
        return new HardwareEarMonitorVivo(j4);
    }

    public String getParameters(String str) {
        try {
            return this.mAudioManager.getParameters(str);
        } catch (Throwable unused) {
            return "";
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
}
