package com.tencent.liteav.audio2;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.os.Process;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;

@JNINamespace("liteav::audio")
/* loaded from: classes7.dex */
class LiteavAudioRecord3 {
    private static final int DEFAULT_LATENCY_MS = 30;
    private static final int HARDWARE_LATENCY_MS = 20;
    private static final long LATENCY_THRESHOLD_MS = 1000;
    private static final long NANOS_PER_MS = 1000000;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final String TAG = ProtectedSandApp.s("兹\u0001");
    private AudioRecord mAudioRecord;
    private int mSampleRate = 0;
    private int mBufferSize = 0;
    private int mReadFrameIndex = 0;
    private int mBytesPerFrame = 0;
    private int mSystemOSVersion = 0;

    private static String audioSourceToString(int i4) {
        switch (i4) {
            case 0:
                return ProtectedSandApp.s("典\u0001");
            case 1:
                return ProtectedSandApp.s("具\u0001");
            case 2:
                return ProtectedSandApp.s("其\u0001");
            case 3:
                return ProtectedSandApp.s("兵\u0001");
            case 4:
                return ProtectedSandApp.s("兴\u0001");
            case 5:
                return ProtectedSandApp.s("关\u0001");
            case 6:
                return ProtectedSandApp.s("兲\u0001");
            case 7:
                return ProtectedSandApp.s("共\u0001");
            case 8:
            default:
                return ProtectedSandApp.s("兮\u0001");
            case 9:
                return ProtectedSandApp.s("兰\u0001");
            case 10:
                return ProtectedSandApp.s("兯\u0001");
        }
    }

    private AudioRecord createStartedAudioRecord(int i4, int i5, int i6, int i7) {
        AudioRecord audioRecord;
        String s4 = ProtectedSandApp.s("兹\u0001");
        try {
            audioRecord = new AudioRecord(i4, i5, i6, 2, i7);
        } catch (Throwable unused) {
            audioRecord = null;
        }
        try {
            if (audioRecord.getState() != 1) {
                throw new RuntimeException(ProtectedSandApp.s("养\u0001"));
            }
            this.mReadFrameIndex = 0;
            audioRecord.startRecording();
            Log.i(s4, ProtectedSandApp.s("兺\u0001"), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), audioSourceToString(i4));
            return audioRecord;
        } catch (Throwable unused2) {
            Log.w(s4, ProtectedSandApp.s("兼\u0001"), audioSourceToString(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
            destroyAudioRecord(audioRecord);
            return null;
        }
    }

    private static void destroyAudioRecord(AudioRecord audioRecord) {
        if (audioRecord == null) {
            return;
        }
        try {
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("兹\u0001"), ProtectedSandApp.s("兽\u0001"), th);
        }
    }

    private int getLatencyByTimestamp() {
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (this.mAudioRecord.getTimestamp(audioTimestamp, 0) != 0) {
            Log.w(ProtectedSandApp.s("兹\u0001"), ProtectedSandApp.s("兾\u0001"), new Object[0]);
            return 30;
        }
        int nanoTime = (int) ((System.nanoTime() - (audioTimestamp.nanoTime + lengthBytesToNano(this.mReadFrameIndex - audioTimestamp.framePosition))) / 1000000);
        int i4 = nanoTime + 20;
        if (nanoTime <= 0 || nanoTime > 1000) {
            return 30;
        }
        return i4;
    }

    private long lengthBytesToNano(long j4) {
        return (j4 * NANOS_PER_SECOND) / this.mSampleRate;
    }

    public int getRecordLatencyMs() {
        if (this.mAudioRecord == null || this.mSystemOSVersion < 24) {
            return 30;
        }
        try {
            return getLatencyByTimestamp();
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("兹\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("兿\u0001"))), new Object[0]);
            return 30;
        }
    }

    public int getSessionId() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    public int read(ByteBuffer byteBuffer, int i4) {
        if (this.mAudioRecord == null) {
            return -1;
        }
        byteBuffer.position(0);
        int read = this.mAudioRecord.read(byteBuffer, i4);
        if (read < 0) {
            Log.e(ProtectedSandApp.s("兹\u0001"), ProtectedSandApp.s("冀\u0001"), Integer.valueOf(read));
            return -1;
        }
        this.mReadFrameIndex = (read / this.mBytesPerFrame) + this.mReadFrameIndex;
        return read;
    }

    public int startRecording(int i4, int i5, int i6, int i7) {
        this.mBytesPerFrame = i6 * 2;
        this.mSampleRate = i5;
        int i10 = i6 == 1 ? 16 : 12;
        int minBufferSize = AudioRecord.getMinBufferSize(i5, i10, 2);
        if (minBufferSize <= 0) {
            Log.e(ProtectedSandApp.s("兹\u0001"), ProtectedSandApp.s("冁\u0001").concat(String.valueOf(minBufferSize)), new Object[0]);
        }
        int i11 = i6 * i5;
        if (minBufferSize < i11) {
            minBufferSize = i11;
        }
        int[] iArr = {i4, 1, 5, 0};
        for (int i12 = 0; i12 < 4 && this.mAudioRecord == null; i12++) {
            int i13 = iArr[i12];
            for (int i14 = 1; i14 <= 2 && this.mAudioRecord == null; i14++) {
                int i15 = minBufferSize * i14;
                this.mBufferSize = i15;
                if (i15 >= i7 * 4 || i14 >= 2) {
                    this.mAudioRecord = createStartedAudioRecord(i13, i5, i10, i15);
                }
            }
        }
        if (this.mAudioRecord == null) {
            return -1;
        }
        this.mSystemOSVersion = LiteavSystemInfo.getSystemOSVersionInt();
        Process.setThreadPriority(-19);
        return 0;
    }

    public void stopRecording() {
        destroyAudioRecord(this.mAudioRecord);
        this.mAudioRecord = null;
    }
}
