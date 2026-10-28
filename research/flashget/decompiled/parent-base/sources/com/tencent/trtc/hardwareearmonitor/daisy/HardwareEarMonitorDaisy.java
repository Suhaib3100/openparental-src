package com.tencent.trtc.hardwareearmonitor.daisy;

import android.content.Context;
import android.media.AudioManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.l;
import com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit;
import com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit;
import java.util.List;

@JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class HardwareEarMonitorDaisy implements IDaisyAudioKitCallback {
    private static final String TAG = ProtectedSandApp.s("峓\u0001");
    private DaisyAudioKit mDaisyAudioKit;
    private DaisyAudioKaraokeFeatureKit mDaisyKaraokeKit;
    private long mNativeHardwareEarMonitorHandle;
    private Object mLock = new Object();
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("峒\u0001"));
    private Context mContext = ContextUtils.getApplicationContext();
    private l mTaskRunner = new l();

    public HardwareEarMonitorDaisy(long j4) {
        this.mNativeHardwareEarMonitorHandle = j4;
        DaisyAudioKit daisyAudioKit = new DaisyAudioKit(ContextUtils.getApplicationContext(), this);
        this.mDaisyAudioKit = daisyAudioKit;
        daisyAudioKit.initialize();
    }

    public static HardwareEarMonitorDaisy create(long j4) {
        return new HardwareEarMonitorDaisy(j4);
    }

    public static boolean isAudioKitSupport() {
        return DaisyFeatureKitManager.isAudioKitSupport(ContextUtils.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandleResult(long j4, int i4);

    private int setEqualizer(int i4) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i4);
    }

    private int setVolume(int i4) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i4);
    }

    public void createKaraokeService() {
        this.mDaisyKaraokeKit = (DaisyAudioKaraokeFeatureKit) this.mDaisyAudioKit.createFeature(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        DaisyAudioKit daisyAudioKit = this.mDaisyAudioKit;
        if (daisyAudioKit != null) {
            daisyAudioKit.destroy();
            this.mDaisyAudioKit = null;
        }
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit != null) {
            daisyAudioKaraokeFeatureKit.destroy();
            this.mDaisyKaraokeKit = null;
        }
    }

    public int enableKaraoke(boolean z4) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.enableKaraokeFeature(z4);
    }

    public int getKaraokeLatency() {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return -1;
        }
        try {
            return daisyAudioKaraokeFeatureKit.getKaraokeLatency();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public int[] getKaraokeSupportedServices() {
        List<Integer> supportedFeatures = this.mDaisyAudioKit.getSupportedFeatures();
        if (supportedFeatures == null) {
            return null;
        }
        int[] iArr = new int[supportedFeatures.size()];
        for (int i4 = 0; i4 < supportedFeatures.size(); i4++) {
            iArr[i4] = supportedFeatures.get(i4).intValue();
        }
        return iArr;
    }

    public boolean isHardwareEarMonitorSupported() {
        DaisyAudioKit daisyAudioKit = this.mDaisyAudioKit;
        if (daisyAudioKit == null) {
            return false;
        }
        return daisyAudioKit.isFeatureSupported(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    public boolean isKaraokeServiceSupport() {
        return this.mDaisyAudioKit.isFeatureSupported(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback
    public void onResult(final int i4) {
        this.mTaskRunner.a(new Runnable() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.HardwareEarMonitorDaisy.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (HardwareEarMonitorDaisy.this.mLock) {
                    HardwareEarMonitorDaisy.nativeHandleResult(HardwareEarMonitorDaisy.this.mNativeHardwareEarMonitorHandle, i4);
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

    public int setReverberation(int i4) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i4);
    }
}
