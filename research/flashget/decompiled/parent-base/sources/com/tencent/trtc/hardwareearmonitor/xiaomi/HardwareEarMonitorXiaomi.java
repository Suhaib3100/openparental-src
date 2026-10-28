package com.tencent.trtc.hardwareearmonitor.xiaomi;

import android.media.AudioManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class HardwareEarMonitorXiaomi {
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("嶁\u0001"));
    private long mNativeHardwareEarMonitorHandle;

    public HardwareEarMonitorXiaomi(long j4) {
        this.mNativeHardwareEarMonitorHandle = j4;
    }

    public static HardwareEarMonitorXiaomi create(long j4) {
        return new HardwareEarMonitorXiaomi(j4);
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
