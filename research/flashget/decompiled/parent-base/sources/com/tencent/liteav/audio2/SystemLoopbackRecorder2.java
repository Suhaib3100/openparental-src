package com.tencent.liteav.audio2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Process;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::audio")
/* loaded from: classes7.dex */
public class SystemLoopbackRecorder2 {
    private static final String TAG = ProtectedSandApp.s("冭\u0001");
    private static final Object mLock = new Object();
    private static MediaProjection mMediaProjection;
    private static volatile long mNativeSystemLoopbackRecorder;

    public SystemLoopbackRecorder2(long j4) {
        mNativeSystemLoopbackRecorder = j4;
    }

    private static native void nativeSetMediaProjectionSession(long j4, MediaProjection mediaProjection);

    public static void notifyMediaProjectionState(MediaProjection mediaProjection) {
        String s4 = ProtectedSandApp.s("冭\u0001");
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("冮\u0001"));
        sb.append(mediaProjection != null);
        Log.i(s4, sb.toString(), new Object[0]);
        synchronized (mLock) {
            mMediaProjection = mediaProjection;
            setMediaProjectionSession();
        }
    }

    public static void setMediaProjectionSession() {
        if (mMediaProjection == null) {
            Log.i(ProtectedSandApp.s("冭\u0001"), ProtectedSandApp.s("冯\u0001"), new Object[0]);
        } else if (mNativeSystemLoopbackRecorder != 0) {
            nativeSetMediaProjectionSession(mNativeSystemLoopbackRecorder, mMediaProjection);
        }
    }

    public MediaProjection getMediaProjection() {
        return mMediaProjection;
    }

    public void releaseNativeSystemLoopbackRecorder() {
        mNativeSystemLoopbackRecorder = 0L;
    }

    static class Recorder {

        /* renamed from: a, reason: collision with root package name */
        private AudioRecord f71744a;

        /* renamed from: b, reason: collision with root package name */
        private AudioManager f71745b;

        public Recorder() {
            Context applicationContext = ContextUtils.getApplicationContext();
            ContextUtils.getApplicationContext();
            this.f71745b = (AudioManager) applicationContext.getSystemService(ProtectedSandApp.s("冤\u0001"));
        }

        private static AudioRecord a(MediaProjection mediaProjection, int i4, int i5, int i6) {
            AudioPlaybackCaptureConfiguration build;
            AudioRecord.Builder audioPlaybackCaptureConfig;
            String s4 = ProtectedSandApp.s("冥\u0001");
            AudioPlaybackCaptureConfiguration.Builder a5 = m.a(mediaProjection);
            a5.addMatchingUsage(1);
            a5.addMatchingUsage(14);
            build = a5.build();
            if (build == null) {
                return null;
            }
            int i7 = i5 == 1 ? 16 : 12;
            AudioFormat build2 = new AudioFormat.Builder().setEncoding(2).setSampleRate(i4).setChannelMask(i7).build();
            int minBufferSize = AudioRecord.getMinBufferSize(i4, i7, 2);
            AudioRecord audioRecord = null;
            for (int i10 = 1; i10 <= 2 && audioRecord == null; i10++) {
                int i11 = minBufferSize * i10;
                if (i11 >= i6 * 4 || i10 >= 2) {
                    try {
                        audioPlaybackCaptureConfig = new AudioRecord.Builder().setAudioFormat(build2).setBufferSizeInBytes(i11).setAudioPlaybackCaptureConfig(build);
                        audioRecord = audioPlaybackCaptureConfig.build();
                    } catch (Throwable th) {
                        Log.w(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冨\u0001"))), new Object[0]);
                        a(audioRecord);
                    }
                    if (audioRecord.getState() != 1) {
                        Log.e(s4, ProtectedSandApp.s("冦\u0001"), new Object[0]);
                        a(audioRecord);
                        audioRecord = null;
                    } else {
                        audioRecord.startRecording();
                        Log.i(s4, ProtectedSandApp.s("冧\u0001"), new Object[0]);
                    }
                }
            }
            return audioRecord;
        }

        public int read(ByteBuffer byteBuffer, int i4) {
            if (this.f71744a == null) {
                return -1;
            }
            byteBuffer.position(0);
            int read = this.f71744a.read(byteBuffer, i4);
            if (read > 0) {
                return read;
            }
            Log.e(ProtectedSandApp.s("冥\u0001"), ProtectedSandApp.s("冫\u0001").concat(String.valueOf(read)), new Object[0]);
            return -1;
        }

        public int startRecording(MediaProjection mediaProjection, int i4, int i5, int i6, int i7) {
            if (i7 == 0) {
                try {
                    AudioManager audioManager = this.f71745b;
                    if (audioManager != null) {
                        audioManager.setAllowedCapturePolicy(3);
                    }
                } catch (Throwable th) {
                    Log.e(ProtectedSandApp.s("冥\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冬\u0001"))), new Object[0]);
                }
            }
            AudioManager audioManager2 = this.f71745b;
            int mode = audioManager2 != null ? audioManager2.getMode() : 0;
            a(0);
            this.f71744a = a(mediaProjection, i4, i5, i6);
            a(mode);
            if (this.f71744a == null) {
                return -1;
            }
            Process.setThreadPriority(-19);
            return 0;
        }

        public void stopRecording() {
            a(this.f71744a);
            this.f71744a = null;
        }

        private static void a(AudioRecord audioRecord) {
            if (audioRecord == null) {
                return;
            }
            try {
                if (audioRecord.getRecordingState() == 3) {
                    audioRecord.stop();
                }
                audioRecord.release();
            } catch (Throwable th) {
                Log.e(ProtectedSandApp.s("冥\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冪\u0001"))), new Object[0]);
            }
        }

        private void a(int i4) {
            try {
                AudioManager audioManager = this.f71745b;
                if (audioManager != null) {
                    audioManager.setMode(i4);
                }
            } catch (Throwable th) {
                Log.e(ProtectedSandApp.s("冥\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冩\u0001"))), new Object[0]);
            }
        }
    }
}
