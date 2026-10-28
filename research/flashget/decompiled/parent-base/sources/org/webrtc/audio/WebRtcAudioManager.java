package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import com.tencent.ugc.TXRecordCommon;
import org.apache.log4j.Logger;
import org.webrtc.CalledByNative;

/* loaded from: classes9.dex */
class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioManagerExternal";
    private static final Logger logger = Logger.getLogger("WebRtcAudioManagerExternal");

    WebRtcAudioManager() {
    }

    @CalledByNative
    static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    @CalledByNative
    static int getInputBufferSize(Context context, AudioManager audioManager, int i4, int i5) {
        return isLowLatencyInputSupported(context) ? getLowLatencyFramesPerBuffer(audioManager) : getMinInputFrameSize(i4, i5);
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i4, int i5) {
        return AudioRecord.getMinBufferSize(i4, i5 == 1 ? 16 : 12, 2) / (i5 * 2);
    }

    private static int getMinOutputFrameSize(int i4, int i5) {
        return AudioTrack.getMinBufferSize(i4, i5 == 1 ? 4 : 12, 2) / (i5 * 2);
    }

    @CalledByNative
    static int getOutputBufferSize(Context context, AudioManager audioManager, int i4, int i5) {
        return isLowLatencyOutputSupported(context) ? getLowLatencyFramesPerBuffer(audioManager) : getMinOutputFrameSize(i4, i5);
    }

    @CalledByNative
    static int getSampleRate(AudioManager audioManager) {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            logger.debug("Running emulator, overriding sample rate to 8 kHz.");
            return TXRecordCommon.AUDIO_SAMPLERATE_8000;
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel(audioManager);
        com.flashget.commonx.billing.h.a("Sample rate is set to ", sampleRateForApiLevel, " Hz", logger);
        return sampleRateForApiLevel;
    }

    private static int getSampleRateForApiLevel(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return 16000;
        }
        return Integer.parseInt(property);
    }

    private static boolean isLowLatencyInputSupported(Context context) {
        return isLowLatencyOutputSupported(context);
    }

    private static boolean isLowLatencyOutputSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
