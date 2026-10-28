package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.collection.q2;
import androidx.compose.ui.layout.a0;
import com.flashget.commonx.billing.ui.v;
import com.flashget.kid.common.components.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.log4j.Logger;
import org.webrtc.CalledByNative;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes9.dex */
public class WebRtcAudioRecord {
    public static final int AUDIO_RECORD_SOURCE_INTERNAL = 2;
    public static final int AUDIO_RECORD_SOURCE_MIC = 1;
    public static final int AUDIO_RECORD_SOURCE_MIC_AND_INTERNAL = 3;
    public static final int AUDIO_RECORD_SOURCE_NONE = 0;
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static boolean isEnableAudio;
    private static volatile boolean microphoneMute;
    private final int audioFormat;
    private final AudioManager audioManager;

    @q0
    private AudioRecord audioRecordMic;

    @q0
    private AudioRecord audioRecordSystem;

    @q0
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;

    @q0
    private AudioRecordThread audioThread;

    @q0
    private ByteBuffer byteBuffer;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;

    @q0
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;

    @q0
    private ScheduledFuture<String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private AudioManager.AudioRecordingCallback mAudioRecordingCallback;
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    private long nativeAudioRecord;

    @q0
    private AudioDeviceInfo preferredDevice;

    @q0
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private static final Logger logger = Logger.getLogger("WebRtcAudioRecordExternal");
    private static final float MIC_GAIN_FACTOR = (float) Math.pow(10.0d, 0.75d);
    private static int mAudioSource = -1;
    private static AudioPlaybackCaptureConfiguration mConfig = null;
    private static int mAudioRecordType = 1;
    private static boolean mDoMicRecord = true;
    private static boolean mDoSystemRecord = false;
    private static final AtomicInteger nextSchedulerId = new AtomicInteger(0);

    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i4;
            ByteBuffer byteBuffer;
            int i5;
            int i6;
            Process.setThreadPriority(-19);
            v.a(new StringBuilder("AudioRecordThread"), WebRtcAudioUtils.getThreadInfo(), WebRtcAudioRecord.logger);
            WebRtcAudioRecord.assertTrue((WebRtcAudioRecord.mDoMicRecord && WebRtcAudioRecord.this.audioRecordMic.getRecordingState() == 3) || (WebRtcAudioRecord.mDoSystemRecord && WebRtcAudioRecord.this.audioRecordSystem.getRecordingState() == 3));
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            while (this.keepAlive) {
                ByteBuffer byteBuffer2 = null;
                if (!WebRtcAudioRecord.mDoMicRecord || WebRtcAudioRecord.this.audioRecordMic == null) {
                    i4 = 0;
                    byteBuffer = null;
                } else {
                    byteBuffer = ByteBuffer.allocateDirect(WebRtcAudioRecord.this.byteBuffer.capacity());
                    i4 = WebRtcAudioRecord.this.audioRecordMic.read(byteBuffer, byteBuffer.capacity());
                    if (WebRtcAudioRecord.microphoneMute) {
                        byteBuffer.clear();
                        byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                }
                if (!WebRtcAudioRecord.mDoSystemRecord || WebRtcAudioRecord.this.audioRecordSystem == null) {
                    i5 = 0;
                } else {
                    byteBuffer2 = ByteBuffer.allocateDirect(WebRtcAudioRecord.this.byteBuffer.capacity());
                    i5 = WebRtcAudioRecord.this.audioRecordSystem.read(byteBuffer2, byteBuffer2.capacity());
                }
                if (i4 == -3 || i5 == -3) {
                    i6 = -3;
                } else {
                    if (!WebRtcAudioRecord.mDoMicRecord || !WebRtcAudioRecord.mDoSystemRecord) {
                        i4 += i5;
                    } else if (i4 != i5) {
                        i4 = -3;
                    }
                    i6 = i4;
                }
                if (i6 == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.mDoMicRecord && WebRtcAudioRecord.mDoSystemRecord) {
                        if (byteBuffer2 != null) {
                            WebRtcAudioRecord.this.byteBuffer.clear();
                            WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.getMixByteBuffer(byteBuffer, byteBuffer2));
                        }
                    } else if (WebRtcAudioRecord.mDoMicRecord) {
                        if (byteBuffer != null) {
                            WebRtcAudioRecord.this.byteBuffer.clear();
                            WebRtcAudioRecord.this.byteBuffer.put(byteBuffer);
                        }
                    } else if (WebRtcAudioRecord.mDoSystemRecord && byteBuffer2 != null) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(byteBuffer2);
                    }
                    if (this.keepAlive) {
                        long j4 = WebRtcAudioRecord.this.audioRecordMic.getTimestamp(audioTimestamp, 0) == 0 ? audioTimestamp.nanoTime : 0L;
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i6, j4);
                    }
                    if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                        byte[] copyOfRange = Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.arrayOffset() + WebRtcAudioRecord.this.byteBuffer.capacity());
                        AudioRecord audioRecord = WebRtcAudioRecord.this.audioRecordMic != null ? WebRtcAudioRecord.this.audioRecordMic : WebRtcAudioRecord.this.audioRecordSystem;
                        WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(audioRecord.getAudioFormat(), audioRecord.getChannelCount(), audioRecord.getSampleRate(), copyOfRange));
                    }
                } else {
                    String a5 = android.support.v4.media.a.a("AudioRecord.read failed: ", i6);
                    WebRtcAudioRecord.logger.error(a5);
                    if (i6 == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(a5);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecordMic != null) {
                    WebRtcAudioRecord.this.audioRecordMic.stop();
                    WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
                }
                if (WebRtcAudioRecord.this.audioRecordSystem != null) {
                    WebRtcAudioRecord.this.audioRecordSystem.stop();
                    WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
                }
            } catch (IllegalStateException e4) {
                WebRtcAudioRecord.logger.error("AudioRecord.stop failed: " + e4.getMessage());
            }
        }

        public void stopThread() {
            WebRtcAudioRecord.logger.debug("stopThread");
            this.keepAlive = false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @org.webrtc.CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    WebRtcAudioRecord(android.content.Context r14, android.media.AudioManager r15) {
        /*
            r13 = this;
            java.util.concurrent.ScheduledExecutorService r2 = newDefaultScheduler()
            int r0 = org.webrtc.audio.WebRtcAudioRecord.mAudioSource
            if (r0 < 0) goto La
        L8:
            r4 = r0
            goto Lc
        La:
            r0 = 7
            goto L8
        Lc:
            boolean r11 = org.webrtc.audio.WebRtcAudioEffects.isAcousticEchoCancelerSupported()
            boolean r12 = org.webrtc.audio.WebRtcAudioEffects.isNoiseSuppressorSupported()
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = r13
            r1 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioRecord.<init>(android.content.Context, android.media.AudioManager):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static String audioStateToString(int i4) {
        return i4 != 0 ? i4 != 1 ? "INVALID" : "STOP" : "START";
    }

    private int channelCountToConfiguration(int i4) {
        return i4 == 1 ? 16 : 12;
    }

    @TargetApi(24)
    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    private static AudioRecord createAudioRecordForSystem(int i4, int i5, int i6, int i7) {
        AudioRecord.Builder audioPlaybackCaptureConfig;
        logger.debug("createAudioRecordForSystem");
        audioPlaybackCaptureConfig = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(i6).setSampleRate(i4).setChannelMask(i5).build()).setBufferSizeInBytes(i7).setAudioPlaybackCaptureConfig(mConfig);
        return audioPlaybackCaptureConfig.build();
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int i4, int i5, int i6, int i7, int i10) {
        logger.debug("createAudioRecordOnLowerThanM");
        return new AudioRecord(i4, i5, i6, i7, i10);
    }

    @TargetApi(23)
    private static AudioRecord createAudioRecordOnMOrHigher(int i4, int i5, int i6, int i7, int i10) {
        logger.debug("createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i4).setAudioFormat(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i5).setChannelMask(i6).build()).setBufferSizeInBytes(i10).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i4) {
        Logger logger2 = logger;
        v.a(new StringBuilder("doAudioRecordStateCallback: "), audioStateToString(i4), logger2);
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i4 == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i4 == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                logger2.error("Invalid audio state");
            }
        }
    }

    @CalledByNative
    private boolean enableBuiltInAEC(boolean z4) {
        logger.debug("enableBuiltInAEC(" + z4 + ")");
        return this.effects.setAEC(z4);
    }

    @CalledByNative
    private boolean enableBuiltInNS(boolean z4) {
        logger.debug("enableBuiltInNS(" + z4 + ")");
        return this.effects.setNS(z4);
    }

    public static int getAudioSource() {
        com.flashget.kid.common.requests.uploadfile.a.a(new StringBuilder("getAudioSource "), mAudioSource, logger);
        return mAudioSource;
    }

    private static int getBytesPerSample(int i4) {
        int i5 = 1;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                i5 = 4;
                if (i4 != 4) {
                    if (i4 != 13) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a("Bad audio format ", i4));
                    }
                }
            }
            return i5;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ByteBuffer getMixByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int capacity = this.byteBuffer.capacity();
        byte[] bArr = new byte[capacity];
        for (int i4 = 0; i4 < capacity; i4 += 2) {
            int min = Math.min(Math.max((int) (Math.min(Math.max(byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getShort() * MIC_GAIN_FACTOR, -32768.0f), 32767.0f) + byteBuffer2.order(r3).getShort()), -32768), a0.f18904a);
            bArr[i4] = (byte) (min & 255);
            bArr[i4 + 1] = (byte) ((min >> 8) & 255);
        }
        return ByteBuffer.wrap(bArr);
    }

    @CalledByNative
    private int initRecording(int i4, int i5) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest build;
        if (!isEnableAudio) {
            logger.debug("should not enable");
            return -1;
        }
        Logger logger2 = logger;
        logger2.debug(q2.a("initRecording(sampleRate=", i4, ", channels=", i5, ")"));
        if (this.audioRecordMic != null && this.audioRecordSystem != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i6 = i4 / 100;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i5 * i6);
        this.byteBuffer = allocateDirect;
        if (!allocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        logger2.debug("byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i5);
        int minBufferSize = AudioRecord.getMinBufferSize(i4, channelCountToConfiguration, this.audioFormat);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError(android.support.v4.media.a.a("AudioRecord.getMinBufferSize failed: ", minBufferSize));
            return -1;
        }
        logger2.debug("AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        com.flashget.commonx.billing.j.a("bufferSizeInBytes: ", max, logger2);
        try {
            logger2.debug("initRecording: type:" + mAudioRecordType);
            boolean z4 = false;
            if (mDoMicRecord) {
                int i7 = Build.VERSION.SDK_INT;
                this.audioRecordMic = createAudioRecordOnMOrHigher(this.audioSource, i4, channelCountToConfiguration, this.audioFormat, max);
                this.audioSourceMatchesRecordingSessionRef.set(null);
                AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                if (audioDeviceInfo != null) {
                    setPreferredDevice(audioDeviceInfo);
                }
                if (i7 >= 29) {
                    this.audioRecordMic.registerAudioRecordingCallback(this.executor, this.mAudioRecordingCallback);
                } else {
                    this.audioManager.registerAudioRecordingCallback(this.mAudioRecordingCallback, new Handler(Looper.getMainLooper()));
                }
                if (i7 >= 26) {
                    AudioAttributes.Builder builder = new AudioAttributes.Builder();
                    builder.setUsage(14).setContentType(1);
                    k.a();
                    AudioFocusRequest.Builder a5 = j.a(3);
                    audioAttributes = a5.setAudioAttributes(builder.build());
                    acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(false);
                    acceptsDelayedFocusGain.setOnAudioFocusChangeListener(this.mOnAudioFocusChangeListener);
                    build = a5.build();
                    this.audioManager.requestAudioFocus(build);
                } else {
                    this.audioManager.requestAudioFocus(this.mOnAudioFocusChangeListener, Integer.MIN_VALUE, 3);
                }
            }
            if (mDoSystemRecord && mConfig != null) {
                this.audioRecordSystem = createAudioRecordForSystem(i4, channelCountToConfiguration, this.audioFormat, max);
            }
            boolean z5 = mDoMicRecord && postInitForAudioRecord(this.audioRecordMic);
            if (mDoSystemRecord && postInitForAudioRecord(this.audioRecordSystem)) {
                z4 = true;
            }
            if (mDoMicRecord && mDoSystemRecord) {
                if (!z5 || !z4) {
                    return -1;
                }
            } else if (!z5 && !z4) {
                return -1;
            }
            return i6;
        } catch (IllegalArgumentException e4) {
            e = e4;
            reportWebRtcAudioRecordInitError(e.getMessage());
            releaseAudioResources();
            return -1;
        } catch (UnsupportedOperationException e5) {
            e = e5;
            reportWebRtcAudioRecordInitError(e.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    public static boolean isAudioEnable() {
        s.a(new StringBuilder("isAudioEnable "), isEnableAudio, logger);
        return isEnableAudio;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) throws Exception {
        if (this.audioRecordMic == audioRecord || this.audioRecordSystem == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        logger.debug("audio record has changed");
        return "Scheduled task is done";
    }

    @TargetApi(24)
    private static boolean logActiveRecordingConfigs(int i4, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        logger.debug("AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            StringBuilder sb = new StringBuilder("  client audio source=");
            sb.append(WebRtcAudioUtils.audioSourceToString(audioRecordingConfiguration.getClientAudioSource()));
            sb.append(", client session id=");
            sb.append(audioRecordingConfiguration.getClientAudioSessionId());
            sb.append(" (");
            sb.append(i4);
            sb.append(")\n  Device AudioFormat: channel count=");
            AudioFormat format = audioRecordingConfiguration.getFormat();
            sb.append(format.getChannelCount());
            sb.append(", channel index mask=");
            sb.append(format.getChannelIndexMask());
            sb.append(", channel mask=");
            sb.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb.append(", encoding=");
            sb.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb.append(", sample rate=");
            sb.append(format.getSampleRate());
            sb.append("\n  Client AudioFormat: channel count=");
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            sb.append(clientFormat.getChannelCount());
            sb.append(", channel index mask=");
            sb.append(clientFormat.getChannelIndexMask());
            sb.append(", channel mask=");
            sb.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb.append(", encoding=");
            sb.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb.append(", sample rate=");
            sb.append(clientFormat.getSampleRate());
            sb.append("\n");
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb.append("  AudioDevice: type=");
                sb.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb.append(", id=");
                sb.append(audioDevice.getId());
            }
            logger.debug(sb.toString());
        }
        return true;
    }

    private void logMainParameters(AudioRecord audioRecord) {
        logger.debug("AudioRecord: session ID: " + audioRecord.getAudioSessionId() + ", channels: " + audioRecord.getChannelCount() + ", sample rate: " + audioRecord.getSampleRate());
    }

    @TargetApi(23)
    private void logMainParametersExtended(AudioRecord audioRecord) {
        logger.debug("AudioRecord: buffer size in frames: " + audioRecord.getBufferSizeInFrames());
    }

    @TargetApi(24)
    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z4) {
        if (audioRecord == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        com.flashget.commonx.billing.j.a("Number of active recording sessions: ", size, logger);
        if (size > 0) {
            logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (z4) {
                this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    private native void nativeCacheDirectBufferAddress(long j4, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j4, int i4, long j5);

    static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", Integer.valueOf(WebRtcAudioRecord.nextSchedulerId.getAndIncrement()), Integer.valueOf(atomicInteger.getAndIncrement())));
                return newThread;
            }
        });
    }

    private boolean postInitForAudioRecord(AudioRecord audioRecord) {
        if (audioRecord == null || audioRecord.getState() != 1) {
            reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
            releaseAudioResources();
            return false;
        }
        if (audioRecord == this.audioRecordMic) {
            this.effects.enable(audioRecord.getAudioSessionId());
        }
        logMainParameters(audioRecord);
        logMainParametersExtended(audioRecord);
        int logRecordingConfigurations = logRecordingConfigurations(audioRecord, false);
        if (logRecordingConfigurations != 0) {
            logger.warn("Potential microphone conflict. Active sessions: " + logRecordingConfigurations);
        }
        return true;
    }

    private void releaseAudioResources() {
        logger.debug("releaseAudioResources");
        AudioRecord audioRecord = this.audioRecordMic;
        if (audioRecord != null) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.mAudioRecordingCallback;
            if (audioRecordingCallback != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    audioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
                } else {
                    this.audioManager.unregisterAudioRecordingCallback(audioRecordingCallback);
                }
            }
            this.audioRecordMic.release();
            this.audioRecordMic = null;
        }
        AudioRecord audioRecord2 = this.audioRecordSystem;
        if (audioRecord2 != null) {
            audioRecord2.release();
            this.audioRecordSystem = null;
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        com.flashget.commonx.billing.m.a("Run-time recording error: ", str, logger);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        com.flashget.commonx.billing.m.a("Init recording error: ", str, logger);
        AudioRecord audioRecord = this.audioRecordMic;
        if (audioRecord == null) {
            audioRecord = this.audioRecordSystem;
        }
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        logRecordingConfigurations(audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        logger.error("Start recording error: " + audioRecordStartErrorCode + ". " + str);
        AudioRecord audioRecord = this.audioRecordMic;
        if (audioRecord == null) {
            audioRecord = this.audioRecordSystem;
        }
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        logRecordingConfigurations(audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(final AudioRecord audioRecord) {
        logger.debug("scheduleLogRecordingConfigurationsTask");
        Callable callable = new Callable() { // from class: org.webrtc.audio.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String lambda$scheduleLogRecordingConfigurationsTask$0;
                lambda$scheduleLogRecordingConfigurationsTask$0 = WebRtcAudioRecord.this.lambda$scheduleLogRecordingConfigurationsTask$0(audioRecord);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
            }
        };
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callable, 100L, TimeUnit.MILLISECONDS);
    }

    public static void setAudioEnable(boolean z4) {
        com.flashget.commonx.billing.s.a("isEnableAudio ", z4, logger);
        isEnableAudio = z4;
    }

    public static void setAudioPlaybackCaptureConfiguration(AudioPlaybackCaptureConfiguration audioPlaybackCaptureConfiguration) {
        logger.debug("setAudioPlaybackCaptureConfiguration");
        mConfig = audioPlaybackCaptureConfiguration;
    }

    public static void setAudioRecordType(int i4) {
        com.flashget.commonx.billing.j.a("setAudioRecordType: type:", i4, logger);
        mAudioRecordType = i4;
        mDoMicRecord = i4 == 1 || i4 == 3;
        mDoSystemRecord = i4 == 2 || i4 == 3;
    }

    public static void setAudioSource(int i4) {
        com.flashget.commonx.billing.j.a("setAudioSource ", i4, logger);
        mAudioSource = i4;
    }

    public static void setMicrophoneMute(boolean z4) {
        logger.warn("setMicrophoneMute(" + z4 + ")");
        microphoneMute = z4;
    }

    @CalledByNative
    private boolean startRecording() {
        logger.debug("startRecording");
        assertTrue((this.audioRecordMic == null && this.audioRecordSystem == null) ? false : true);
        assertTrue(this.audioThread == null);
        try {
            if (mDoMicRecord) {
                this.audioRecordMic.startRecording();
            }
            if (mDoSystemRecord) {
                this.audioRecordSystem.startRecording();
            }
            if (mDoMicRecord && this.audioRecordMic.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecordMic.getRecordingState());
                return false;
            }
            if (mDoSystemRecord && this.audioRecordSystem.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecordSystem.getRecordingState());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            if (mDoMicRecord) {
                scheduleLogRecordingConfigurationsTask(this.audioRecordMic);
            }
            if (mDoSystemRecord) {
                scheduleLogRecordingConfigurationsTask(this.audioRecordSystem);
            }
            return true;
        } catch (IllegalStateException e4) {
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e4.getMessage());
            return false;
        }
    }

    @CalledByNative
    private boolean stopRecording() {
        Logger logger2 = logger;
        logger2.debug("stopRecording");
        assertTrue(this.audioThread != null);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            logger2.error("Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        }
        this.audioThread = null;
        isEnableAudio = false;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    @TargetApi(24)
    private static boolean verifyAudioConfig(int i4, int i5, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i4 && audioRecordingConfiguration.getClientAudioSessionId() == i5 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    logger.debug("verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        logger.error("verifyAudioConfig: FAILED");
        return false;
    }

    @CalledByNative
    boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    @CalledByNative
    boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    @CalledByNative
    boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        logger.warn("Audio configuration has not yet been verified");
        return false;
    }

    @CalledByNative
    boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    @CalledByNative
    public void setNativeAudioRecord(long j4) {
        this.nativeAudioRecord = j4;
    }

    @TargetApi(23)
    @x0(23)
    void setPreferredDevice(@q0 AudioDeviceInfo audioDeviceInfo) {
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder("setPreferredDevice ");
        sb.append(audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null);
        logger2.debug(sb.toString());
        this.preferredDevice = audioDeviceInfo;
        AudioRecord audioRecord = this.audioRecordMic;
        if (audioRecord == null || audioRecord.setPreferredDevice(audioDeviceInfo)) {
            return;
        }
        logger2.debug("setPreferredDevice failed");
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i4, int i5, @q0 JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, @q0 JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, @q0 JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, @q0 AudioManager.AudioRecordingCallback audioRecordingCallback, @q0 AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, boolean z4, boolean z5) {
        this.effects = new WebRtcAudioEffects();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        if (z4 && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        }
        if (z5 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new IllegalArgumentException("HW NS not supported");
        }
        this.context = context;
        this.executor = scheduledExecutorService;
        this.audioManager = audioManager;
        this.audioSource = i4;
        this.audioFormat = i5;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.isAcousticEchoCancelerSupported = z4;
        this.isNoiseSuppressorSupported = z5;
        this.mAudioRecordingCallback = audioRecordingCallback;
        this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
        logger.debug("ctor " + WebRtcAudioUtils.getThreadInfo() + " audioSource " + i4);
    }
}
