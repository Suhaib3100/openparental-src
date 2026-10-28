package com.tencent.liteav.trtc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.trtc.TRTCCloudDef;

@JNINamespace("liteav::trtc")
/* loaded from: classes7.dex */
public class AudioVodTrackJni {
    private long mNativeAudioVodTrackJni;

    static class AudioFrame {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCAudioFrame f72060a;

        public AudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
            this.f72060a = tRTCAudioFrame;
        }

        public int getChannel() {
            return this.f72060a.channel;
        }

        public byte[] getData() {
            return this.f72060a.data;
        }

        public int getSampleRate() {
            return this.f72060a.sampleRate;
        }

        public long getTimestamp() {
            return this.f72060a.timestamp;
        }
    }

    public AudioVodTrackJni() {
        this.mNativeAudioVodTrackJni = 0L;
        this.mNativeAudioVodTrackJni = nativeCreateAudioVodTrackJni(this);
    }

    private static native void nativeClean(long j4);

    private static native long nativeCreateAudioVodTrackJni(AudioVodTrackJni audioVodTrackJni);

    private static native void nativeEnablePlayout(long j4, boolean z4);

    private static native void nativePause(long j4);

    private static native void nativeResume(long j4);

    private static native void nativeSeek(long j4);

    private static native void nativeSetPlayoutVolume(long j4, int i4);

    private static native int nativeWriteData(long j4, AudioFrame audioFrame);

    public synchronized void clean() {
        long j4 = this.mNativeAudioVodTrackJni;
        if (j4 != 0) {
            nativeClean(j4);
        }
    }

    public synchronized void enablePlayout(boolean z4) {
        long j4 = this.mNativeAudioVodTrackJni;
        if (j4 != 0) {
            nativeEnablePlayout(j4, z4);
        }
    }

    public synchronized void pause() {
        long j4 = this.mNativeAudioVodTrackJni;
        if (j4 != 0) {
            nativePause(j4);
        }
    }

    public synchronized void resume() {
        long j4 = this.mNativeAudioVodTrackJni;
        if (j4 != 0) {
            nativeResume(j4);
        }
    }

    public synchronized void seek() {
        long j4 = this.mNativeAudioVodTrackJni;
        if (j4 != 0) {
            nativeSeek(j4);
        }
    }

    public synchronized void setPlayoutVolume(int i4) {
        long j4 = this.mNativeAudioVodTrackJni;
        if (j4 != 0) {
            nativeSetPlayoutVolume(j4, i4);
        }
    }

    public synchronized int writeData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        long j4 = this.mNativeAudioVodTrackJni;
        if (j4 == 0) {
            return -1;
        }
        return nativeWriteData(j4, new AudioFrame(tRTCAudioFrame));
    }
}
