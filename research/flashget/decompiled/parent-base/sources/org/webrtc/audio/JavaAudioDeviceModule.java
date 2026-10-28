package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.x0;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.log4j.Logger;
import org.webrtc.JniCommon;
import org.webrtc.Logging;

/* loaded from: classes9.dex */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    private static final String FLASHGET_KIDS_PACKAGE_NAME = "com.flashget.kidscontrol";
    private static final String TAG = "JavaAudioDeviceModule";
    private static final Logger logger = Logger.getLogger("JavaAudioDeviceModule");
    private final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    private final WebRtcAudioTrack audioOutput;
    private final Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int i4, int i5, int i6, byte[] bArr) {
            this.audioFormat = i4;
            this.channelCount = i5;
            this.sampleRate = i6;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    public static class Builder {
        private AudioAttributes audioAttributes;
        private int audioFormat;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private AudioRecordStateCallback audioRecordStateCallback;
        private AudioManager.AudioRecordingCallback audioRecordingCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private AudioTrackStateCallback audioTrackStateCallback;
        private final Context context;
        private boolean enableVolumeLogger;
        private int inputSampleRate;
        private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        private int outputSampleRate;
        private SamplesReadyCallback remoteSamplesReadyCallback;
        private SamplesReadyCallback samplesReadyCallback;
        private ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useLowLatency;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        public JavaAudioDeviceModule createAudioDeviceModule() {
            JavaAudioDeviceModule.logger.debug("createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                JavaAudioDeviceModule.logger.debug("HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    JavaAudioDeviceModule.logger.debug("Overriding default behavior; now using WebRTC NS!");
                }
                JavaAudioDeviceModule.logger.debug("HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                JavaAudioDeviceModule.logger.debug("HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    JavaAudioDeviceModule.logger.debug("Overriding default behavior; now using WebRTC AEC!");
                }
                JavaAudioDeviceModule.logger.debug("HW AEC will not be used.");
            }
            if (this.useLowLatency && Build.VERSION.SDK_INT >= 26) {
                JavaAudioDeviceModule.logger.debug("Low latency mode will be used.");
            }
            if (this.context.getPackageName().equals("com.flashget.kidscontrol")) {
                this.audioSource = 1;
            }
            ScheduledExecutorService scheduledExecutorService = this.scheduler;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = WebRtcAudioRecord.newDefaultScheduler();
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, scheduledExecutorService, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.audioRecordingCallback, this.onAudioFocusChangeListener, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.useLowLatency, this.remoteSamplesReadyCallback), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setAudioFormat(int i4) {
            this.audioFormat = i4;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public Builder setAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
            this.audioRecordingCallback = audioRecordingCallback;
            return this;
        }

        public Builder setAudioSource(int i4) {
            this.audioSource = i4;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public Builder setEnableVolumeLogger(boolean z4) {
            this.enableVolumeLogger = z4;
            return this;
        }

        public Builder setInputSampleRate(int i4) {
            com.flashget.commonx.billing.j.a("Input sample rate overridden to: ", i4, JavaAudioDeviceModule.logger);
            this.inputSampleRate = i4;
            return this;
        }

        public Builder setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            this.onAudioFocusChangeListener = onAudioFocusChangeListener;
            return this;
        }

        public Builder setOutputSampleRate(int i4) {
            com.flashget.commonx.billing.j.a("Output sample rate overridden to: ", i4, JavaAudioDeviceModule.logger);
            this.outputSampleRate = i4;
            return this;
        }

        public Builder setRemoteSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.remoteSamplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setSampleRate(int i4) {
            com.flashget.commonx.billing.j.a("Input/Output sample rate overridden to: ", i4, JavaAudioDeviceModule.logger);
            this.inputSampleRate = i4;
            this.outputSampleRate = i4;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setScheduler(ScheduledExecutorService scheduledExecutorService) {
            this.scheduler = scheduledExecutorService;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z4) {
            if (z4 && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                JavaAudioDeviceModule.logger.error("HW AEC not supported");
                z4 = false;
            }
            this.useHardwareAcousticEchoCanceler = z4;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z4) {
            if (z4 && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                JavaAudioDeviceModule.logger.error("HW NS not supported");
                z4 = false;
            }
            this.useHardwareNoiseSuppressor = z4;
            return this;
        }

        public Builder setUseLowLatency(boolean z4) {
            this.useLowLatency = z4;
            return this;
        }

        public Builder setUseStereoInput(boolean z4) {
            this.useStereoInput = z4;
            return this;
        }

        public Builder setUseStereoOutput(boolean z4) {
            this.useStereoOutput = z4;
            return this;
        }

        private Builder(Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.audioManager = audioManager;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.useLowLatency = false;
            this.enableVolumeLogger = true;
        }
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public static Builder builder(Context context) {
        return new Builder(context);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i4, int i5, boolean z4, boolean z5);

    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j4;
        synchronized (this.nativeLock) {
            try {
                if (this.nativeAudioDeviceModule == 0) {
                    this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                }
                j4 = this.nativeAudioDeviceModule;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j4;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            try {
                long j4 = this.nativeAudioDeviceModule;
                if (j4 != 0) {
                    JniCommon.nativeReleaseRef(j4);
                    this.nativeAudioDeviceModule = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z4) {
        logger.debug("setMicrophoneMute: " + z4);
        WebRtcAudioRecord.setMicrophoneMute(z4);
    }

    @x0(23)
    public void setPreferredInputDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.d("JavaAudioDeviceModule", "setPreferredInputDevice: " + audioDeviceInfo);
        this.audioInput.setPreferredDevice(audioDeviceInfo);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z4) {
        logger.debug("setSpeakerMute: " + z4);
        WebRtcAudioTrack.setSpeakerMute(z4);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setVolume(float f4) {
        logger.debug("setVolume: " + f4);
        WebRtcAudioTrack.setVolume(f4);
    }

    private JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i4, int i5, boolean z4, boolean z5) {
        this.nativeLock = new Object();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i4;
        this.outputSampleRate = i5;
        this.useStereoInput = z4;
        this.useStereoOutput = z5;
    }
}
