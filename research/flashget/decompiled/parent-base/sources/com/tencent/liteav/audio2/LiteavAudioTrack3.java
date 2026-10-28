package com.tencent.liteav.audio2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Process;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;

@JNINamespace("liteav::audio")
/* loaded from: classes7.dex */
public class LiteavAudioTrack3 {
    private static final int DEFAULT_LATENCY_MS = 160;
    private static final int HARDWARE_LATENCY_MS = 20;
    private static final long LATENCY_THRESHOLD_MS = 1000;
    private static final long NANOS_PER_MS = 1000000;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final String TAG = ProtectedSandApp.s("冓\u0001");
    private AudioTrack mAudioTrack;
    private byte[] mPlayBuffer;
    private int mSampleRate = 0;
    private int mBufferSize = 0;
    private int mSystemOSVersion = 0;
    private int mWriteFrameIndex = 0;
    private int mBytesPerFrame = 0;

    private AudioTrack createStartedAudioTrack(int i4, int i5, int i6, int i7) {
        AudioTrack audioTrack;
        String s4 = ProtectedSandApp.s("冓\u0001");
        try {
            audioTrack = new AudioTrack(i7, i4, i5, 2, i6, 1);
        } catch (Throwable unused) {
            audioTrack = null;
        }
        try {
            if (audioTrack.getState() != 1) {
                throw new RuntimeException(ProtectedSandApp.s("冕\u0001"));
            }
            this.mWriteFrameIndex = 0;
            audioTrack.play();
            Log.i(s4, ProtectedSandApp.s("冔\u0001"), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), streamTypeToString(i7));
            return audioTrack;
        } catch (Throwable unused2) {
            Log.w(s4, ProtectedSandApp.s("冖\u0001"), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), streamTypeToString(i7));
            destroyAudioTrack(audioTrack);
            return null;
        }
    }

    private void destroyAudioTrack(AudioTrack audioTrack) {
        if (audioTrack == null) {
            return;
        }
        try {
            if (audioTrack.getPlayState() == 3) {
                audioTrack.stop();
                audioTrack.flush();
            }
            audioTrack.release();
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("冓\u0001"), ProtectedSandApp.s("冗\u0001"), th);
        }
    }

    private int getLatencyByTimestamp() {
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (!this.mAudioTrack.getTimestamp(audioTimestamp)) {
            Log.w(ProtectedSandApp.s("冓\u0001"), ProtectedSandApp.s("冘\u0001"), new Object[0]);
            return 160;
        }
        int lengthBytesToNano = ((int) (((audioTimestamp.nanoTime + lengthBytesToNano(this.mWriteFrameIndex - audioTimestamp.framePosition)) - System.nanoTime()) / 1000000)) + 20;
        if (lengthBytesToNano <= 0 || lengthBytesToNano >= 1000) {
            return 160;
        }
        return lengthBytesToNano;
    }

    private long lengthBytesToNano(long j4) {
        return (j4 * NANOS_PER_SECOND) / this.mSampleRate;
    }

    private static String streamTypeToString(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? ProtectedSandApp.s("写\u0001") : ProtectedSandApp.s("冚\u0001") : ProtectedSandApp.s("军\u0001") : ProtectedSandApp.s("农\u0001") : ProtectedSandApp.s("冝\u0001") : ProtectedSandApp.s("冞\u0001") : ProtectedSandApp.s("冟\u0001");
    }

    public int getBufferSize() {
        return this.mBufferSize;
    }

    public int getPlayoutLatencyMs() {
        if (this.mAudioTrack == null || this.mSystemOSVersion < 23) {
            return 160;
        }
        try {
            return getLatencyByTimestamp();
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("冓\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冠\u0001"))), new Object[0]);
            return 160;
        }
    }

    public int getUnderrunCount() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null) {
            return 0;
        }
        try {
            if (this.mSystemOSVersion >= 24) {
                return audioTrack.getUnderrunCount();
            }
            return 0;
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("冓\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冡\u0001"))), new Object[0]);
            return 0;
        }
    }

    public int startPlayout(int i4, int i5, int i6, int i7) {
        this.mBytesPerFrame = i6 * 2;
        this.mSampleRate = i5;
        int i10 = i6 == 1 ? 4 : 12;
        int minBufferSize = AudioTrack.getMinBufferSize(i5, i10, 2);
        if (minBufferSize <= 0) {
            Log.e(ProtectedSandApp.s("冓\u0001"), ProtectedSandApp.s("冢\u0001").concat(String.valueOf(minBufferSize)), new Object[0]);
            return -2;
        }
        int[] iArr = {i4, 0, 3, 1};
        for (int i11 = 0; i11 < 4 && this.mAudioTrack == null; i11++) {
            int i12 = iArr[i11];
            for (int i13 = 1; i13 <= 2 && this.mAudioTrack == null; i13++) {
                int i14 = minBufferSize * i13;
                this.mBufferSize = i14;
                if (i14 >= i7 * 4 || i13 >= 2) {
                    this.mAudioTrack = createStartedAudioTrack(i5, i10, i14, i12);
                }
            }
        }
        if (this.mAudioTrack == null) {
            return -1;
        }
        this.mSystemOSVersion = LiteavSystemInfo.getSystemOSVersionInt();
        Process.setThreadPriority(-19);
        return 0;
    }

    public void stopPlayout() {
        destroyAudioTrack(this.mAudioTrack);
        this.mAudioTrack = null;
    }

    public int write(ByteBuffer byteBuffer, int i4, int i5, boolean z4) {
        int write;
        if (this.mAudioTrack == null) {
            return -1;
        }
        byteBuffer.position(i4);
        if (this.mSystemOSVersion >= 21) {
            write = this.mAudioTrack.write(byteBuffer, i5, z4 ? 1 : 0);
        } else {
            byte[] bArr = this.mPlayBuffer;
            if (bArr == null || bArr.length < i5) {
                this.mPlayBuffer = new byte[i5];
            }
            byteBuffer.get(this.mPlayBuffer, 0, i5);
            write = this.mAudioTrack.write(this.mPlayBuffer, 0, i5);
        }
        if (write < 0) {
            Log.e(ProtectedSandApp.s("冓\u0001"), ProtectedSandApp.s("冣\u0001").concat(String.valueOf(write)), new Object[0]);
            return -1;
        }
        this.mWriteFrameIndex = (write / this.mBytesPerFrame) + this.mWriteFrameIndex;
        return write;
    }
}
