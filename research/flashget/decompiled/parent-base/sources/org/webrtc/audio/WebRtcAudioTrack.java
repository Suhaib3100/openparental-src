package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import androidx.annotation.q0;
import androidx.collection.n1;
import com.flashget.commonx.billing.ui.v;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.webrtc.CalledByNative;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes9.dex */
public class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static volatile boolean speakerMute;

    @q0
    private final AudioAttributes audioAttributes;
    private final AudioManager audioManager;

    @q0
    private JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;

    @q0
    private AudioTrackThread audioThread;

    @q0
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private final Context context;
    private byte[] emptyBytes;

    @q0
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    private long nativeAudioTrack;

    @q0
    private final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final ThreadUtils.ThreadChecker threadChecker;
    private boolean useLowLatency;
    private final VolumeLogger volumeLogger;
    private static final String TAG = "WebRtcAudioTrackExternal";
    private static final Logger logger = Logger.getLogger("WebRtcAudioTrackExternal");
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    public static int mAudioTrackUsage = 1;
    private static volatile float speakerVolume = 1.0f;

    private class AudioTrackThread extends Thread {
        private LowLatencyAudioBufferManager bufferManager;
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.bufferManager = new LowLatencyAudioBufferManager();
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i4) {
            return audioTrack.write(byteBuffer, i4, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            v.a(new StringBuilder("AudioTrackThread"), WebRtcAudioUtils.getThreadInfo(), WebRtcAudioTrack.logger);
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    com.flashget.commonx.billing.j.a("AudioTrack.write played invalid number of bytes: ", writeBytes, WebRtcAudioTrack.logger);
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError(android.support.v4.media.a.a("AudioTrack.write failed: ", writeBytes));
                    }
                }
                if (WebRtcAudioTrack.this.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.this.audioTrack);
                }
                if (WebRtcAudioTrack.this.audioSamplesReadyCallback != null) {
                    WebRtcAudioTrack.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioTrack.this.audioTrack.getAudioFormat(), WebRtcAudioTrack.this.audioTrack.getChannelCount(), WebRtcAudioTrack.this.audioTrack.getSampleRate(), Arrays.copyOfRange(WebRtcAudioTrack.this.byteBuffer.array(), WebRtcAudioTrack.this.byteBuffer.arrayOffset(), WebRtcAudioTrack.this.byteBuffer.arrayOffset() + WebRtcAudioTrack.this.byteBuffer.capacity())));
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            WebRtcAudioTrack.logger.debug("stopThread");
            this.keepAlive = false;
        }
    }

    @CalledByNative
    WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, (AudioAttributes) null, (JavaAudioDeviceModule.AudioTrackErrorCallback) null, (JavaAudioDeviceModule.AudioTrackStateCallback) null, false, true);
    }

    @CalledByNative
    private int GetPlayoutUnderrunCount() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    @TargetApi(29)
    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        int allowedCapturePolicy;
        AudioAttributes.Builder allowedCapturePolicy2;
        allowedCapturePolicy = audioAttributes.getAllowedCapturePolicy();
        allowedCapturePolicy2 = builder.setAllowedCapturePolicy(allowedCapturePolicy);
        return allowedCapturePolicy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i4) {
        return i4 == 1 ? 4 : 12;
    }

    @TargetApi(21)
    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i4, int i5, int i6, @q0 AudioAttributes audioAttributes) {
        logger.debug("createAudioTrackOnLollipopOrHigher");
        logNativeOutputSampleRate(i4);
        return new AudioTrack(getAudioAttributes(audioAttributes), new AudioFormat.Builder().setEncoding(2).setSampleRate(i4).setChannelMask(i5).build(), i6, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i4, int i5, int i6) {
        return new AudioTrack(0, i4, i5, 2, i6, 1);
    }

    @TargetApi(26)
    private static AudioTrack createAudioTrackOnOreoOrHigher(int i4, int i5, int i6, @q0 AudioAttributes audioAttributes) {
        AudioTrack.Builder performanceMode;
        logger.debug("createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i4);
        performanceMode = new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i4).setChannelMask(i5).build()).setBufferSizeInBytes(i6).setPerformanceMode(1);
        return performanceMode.setTransferMode(1).setSessionId(0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i4) {
        Logger logger2 = logger;
        com.flashget.commonx.billing.j.a("doAudioTrackStateCallback: ", i4, logger2);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i4 == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i4 == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                logger2.error("Invalid audio state");
            }
        }
    }

    private static AudioAttributes getAudioAttributes(@q0 AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(mAudioTrackUsage).setContentType(1);
        com.flashget.kid.common.requests.uploadfile.a.a(new StringBuilder("音频轨道策略: "), mAudioTrackUsage, logger);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    @CalledByNative
    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private static int getDefaultUsageAttribute() {
        return 2;
    }

    @CalledByNative
    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    @CalledByNative
    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        logger.debug("getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    @CalledByNative
    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        logger.debug("getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    @CalledByNative
    private int initPlayout(int i4, int i5, double d5) {
        this.threadChecker.checkIsOnValidThread();
        Logger logger2 = logger;
        StringBuilder a5 = n1.a("initPlayout(sampleRate=", i4, ", channels=", i5, ", bufferSizeFactor=");
        a5.append(d5);
        a5.append(")");
        logger2.debug(a5.toString());
        this.byteBuffer = ByteBuffer.allocateDirect((i4 / 100) * i5 * 2);
        logger2.debug("byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i5);
        int minBufferSize = (int) (AudioTrack.getMinBufferSize(i4, channelCountToConfiguration, 2) * d5);
        com.flashget.commonx.billing.j.a("minBufferSizeInBytes: ", minBufferSize, logger2);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d5 > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (!this.useLowLatency || Build.VERSION.SDK_INT < 26) {
                this.audioTrack = createAudioTrackOnLollipopOrHigher(i4, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            } else {
                this.audioTrack = createAudioTrackOnOreoOrHigher(i4, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            }
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            logMainParameters();
            logMainParametersExtended();
            return minBufferSize;
        } catch (IllegalArgumentException e4) {
            reportWebRtcAudioTrackInitError(e4.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        logger.debug("AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
    }

    private void logBufferSizeInFrames() {
        logger.debug("AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
    }

    private void logMainParameters() {
        logger.debug("AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private static void logNativeOutputSampleRate(int i4) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logger logger2 = logger;
        com.flashget.commonx.billing.j.a("nativeOutputSampleRate: ", nativeOutputSampleRate, logger2);
        if (i4 != nativeOutputSampleRate) {
            logger2.warn("Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        logger.debug("underrun count: " + this.audioTrack.getUnderrunCount());
    }

    private static native void nativeCacheDirectBufferAddress(long j4, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeGetPlayoutData(long j4, int i4);

    private void releaseAudioResources() {
        logger.debug("releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        com.flashget.commonx.billing.m.a("Run-time playback error: ", str, logger);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        com.flashget.commonx.billing.m.a("Init playout error: ", str, logger);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        logger.error("Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static void setSpeakerMute(boolean z4) {
        logger.warn("setSpeakerMute(" + z4 + ")");
        speakerMute = z4;
    }

    @CalledByNative
    private boolean setStreamVolume(int i4) {
        this.threadChecker.checkIsOnValidThread();
        Logger logger2 = logger;
        com.flashget.commonx.billing.h.a("setStreamVolume(", i4, ")", logger2);
        if (isVolumeFixed()) {
            logger2.error("The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i4, 0);
        return true;
    }

    public static void setVolume(float f4) {
        logger.warn("setVolume(" + f4 + ")");
        speakerVolume = f4;
    }

    @CalledByNative
    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.start();
        }
        logger.debug("startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() == 3) {
                AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return true;
            }
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
            releaseAudioResources();
            return false;
        } catch (IllegalStateException e4) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e4.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    @CalledByNative
    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.stop();
        }
        Logger logger2 = logger;
        logger2.debug("stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        logger2.debug("Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            logger2.error("Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        }
        logger2.debug("AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            logger2.debug("Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                logger2.debug("AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e4) {
                logger.error("AudioTrack.stop failed: " + e4.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    @CalledByNative
    public void setNativeAudioTrack(long j4) {
        this.nativeAudioTrack = j4;
    }

    WebRtcAudioTrack(Context context, AudioManager audioManager, @q0 AudioAttributes audioAttributes, @q0 JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, @q0 JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z4, boolean z5) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.audioSamplesReadyCallback = null;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = z5 ? new VolumeLogger(audioManager) : null;
        this.useLowLatency = z4;
        v.a(new StringBuilder("ctor"), WebRtcAudioUtils.getThreadInfo(), logger);
    }

    WebRtcAudioTrack(Context context, AudioManager audioManager, @q0 AudioAttributes audioAttributes, @q0 JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, @q0 JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z4, @q0 JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.audioSamplesReadyCallback = null;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.volumeLogger = new VolumeLogger(audioManager);
        this.useLowLatency = z4;
        v.a(new StringBuilder("ctor"), WebRtcAudioUtils.getThreadInfo(), logger);
    }
}
