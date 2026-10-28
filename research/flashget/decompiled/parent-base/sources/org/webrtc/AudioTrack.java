package org.webrtc;

/* loaded from: classes9.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j4) {
        super(j4);
    }

    private static native void nativeSetVolume(long j4, double d5);

    long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d5) {
        nativeSetVolume(getNativeAudioTrack(), d5);
    }
}
