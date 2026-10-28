package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.Context;
import android.media.AudioManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.l;
import com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient;
import com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient;
import java.util.List;

@JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class HardwareEarMonitorHonor implements IHonorAudioServiceCallback {
    private static final String TAG = ProtectedSandApp.s("峙\u0001");
    private HonorAudioClient mHnAudioClient;
    private HonorEarReturnClient mHnEarReturnClient;
    private long mNativeHardwareEarMonitorHandle;
    private Object mLock = new Object();
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("峘\u0001"));
    private Context mContext = ContextUtils.getApplicationContext();
    private l mTaskRunner = new l();

    public HardwareEarMonitorHonor(long j4) {
        this.mNativeHardwareEarMonitorHandle = j4;
        HonorAudioClient honorAudioClient = new HonorAudioClient(this.mContext, this);
        this.mHnAudioClient = honorAudioClient;
        honorAudioClient.initialize();
    }

    public static HardwareEarMonitorHonor create(long j4) {
        return new HardwareEarMonitorHonor(j4);
    }

    public static boolean isAudioKitSupport() {
        return HonorAudioClient.isDeviceSupported(ContextUtils.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandleResult(long j4, int i4);

    public void createKaraokeService() {
        this.mHnEarReturnClient = (HonorEarReturnClient) this.mHnAudioClient.createService(HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        HonorAudioClient honorAudioClient = this.mHnAudioClient;
        if (honorAudioClient != null) {
            honorAudioClient.destroy();
            this.mHnAudioClient = null;
        }
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient != null) {
            honorEarReturnClient.destroy();
            this.mHnEarReturnClient = null;
        }
    }

    public int enableKaraoke(boolean z4) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.enableEarReturn(z4);
    }

    public int getKaraokeLatency() {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return -1;
        }
        try {
            return honorEarReturnClient.getEarReturnLatency();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public int[] getKaraokeSupportedServices() {
        List<Integer> supportedServices = this.mHnAudioClient.getSupportedServices();
        if (supportedServices == null) {
            return null;
        }
        int[] iArr = new int[supportedServices.size()];
        for (int i4 = 0; i4 < supportedServices.size(); i4++) {
            iArr[i4] = supportedServices.get(i4).intValue();
        }
        return iArr;
    }

    public boolean isHardwareEarMonitorSupported() {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return false;
        }
        return honorEarReturnClient.isServiceSupported();
    }

    public boolean isKaraokeServiceSupport() {
        return this.mHnAudioClient.isServiceSupported(HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback
    public void onResult(final int i4) {
        this.mTaskRunner.a(new Runnable() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HardwareEarMonitorHonor.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (HardwareEarMonitorHonor.this.mLock) {
                    HardwareEarMonitorHonor.nativeHandleResult(HardwareEarMonitorHonor.this.mNativeHardwareEarMonitorHandle, i4);
                }
            }
        });
    }

    public boolean setAudioParams(String str) {
        try {
            this.mAudioManager.setParameters(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public int setEqualizer(int i4) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i4);
    }

    public int setReverberation(int i4) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i4);
    }

    public int setVolume(int i4) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i4);
    }
}
