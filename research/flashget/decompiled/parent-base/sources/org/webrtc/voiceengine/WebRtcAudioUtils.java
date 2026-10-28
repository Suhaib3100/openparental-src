package org.webrtc.voiceengine;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.flashget.commonx.billing.s;
import com.flashget.commonx.billing.ui.v;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.webrtc.ContextUtils;

/* loaded from: classes9.dex */
public final class WebRtcAudioUtils {
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;
    private static final String TAG = "WebRtcAudioUtils";
    private static final Logger logger = Logger.getLogger("WebRtcAudioUtils");
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];
    private static int defaultSampleRateHz = 16000;

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    private static String deviceTypeToString(int i4) {
        switch (i4) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i4;
        synchronized (WebRtcAudioUtils.class) {
            i4 = defaultSampleRateHz;
        }
        return i4;
    }

    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z4;
        synchronized (WebRtcAudioUtils.class) {
            z4 = isDefaultSampleRateOverridden;
        }
        return z4;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        logger.debug("Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb = new StringBuilder("  ");
            sb.append(deviceTypeToString(audioDeviceInfo.getType()));
            sb.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb.append("channels=");
                sb.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb.append("encodings=");
                sb.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb.append("sample rates=");
                sb.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb.append(", ");
            }
            sb.append("id=");
            sb.append(audioDeviceInfo.getId());
            logger.debug(sb.toString());
        }
    }

    static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        logger.debug("Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logger logger2 = logger;
        logger2.debug("Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        s.a("  fixed volume=", isVolumeFixed, logger2);
        if (isVolumeFixed) {
            return;
        }
        for (int i4 = 0; i4 < 6; i4++) {
            int i5 = iArr[i4];
            StringBuilder sb = new StringBuilder();
            sb.append("  " + streamTypeToString(i5) + ": ");
            sb.append("volume=");
            sb.append(audioManager.getStreamVolume(i5));
            sb.append(", max=");
            sb.append(audioManager.getStreamMaxVolume(i5));
            logIsStreamMute(str, audioManager, i5, sb);
            logger.debug(sb.toString());
        }
    }

    static void logDeviceInfo(String str) {
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder("Android SDK: ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(", Release: ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", Brand: ");
        sb.append(Build.BRAND);
        sb.append(", Device: ");
        sb.append(Build.DEVICE);
        sb.append(", Id: ");
        sb.append(Build.ID);
        sb.append(", Hardware: ");
        sb.append(Build.HARDWARE);
        sb.append(", Manufacturer: ");
        sb.append(Build.MANUFACTURER);
        sb.append(", Model: ");
        sb.append(Build.MODEL);
        sb.append(", Product: ");
        v.a(sb, Build.PRODUCT, logger2);
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i4, StringBuilder sb) {
        sb.append(", muted=");
        sb.append(audioManager.isStreamMute(i4));
    }

    static String modeToString(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static synchronized void setDefaultSampleRateHz(int i4) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i4;
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z4) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z4;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z4) {
        synchronized (WebRtcAudioUtils.class) {
            logger.warn("setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z4) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z4;
        }
    }

    private static String streamTypeToString(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z4;
        synchronized (WebRtcAudioUtils.class) {
            try {
                if (useWebRtcBasedAcousticEchoCanceler) {
                    logger.warn("Overriding default behavior; now using WebRTC AEC!");
                }
                z4 = useWebRtcBasedAcousticEchoCanceler;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z4;
        synchronized (WebRtcAudioUtils.class) {
            try {
                if (useWebRtcBasedNoiseSuppressor) {
                    logger.warn("Overriding default behavior; now using WebRTC NS!");
                }
                z4 = useWebRtcBasedNoiseSuppressor;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
