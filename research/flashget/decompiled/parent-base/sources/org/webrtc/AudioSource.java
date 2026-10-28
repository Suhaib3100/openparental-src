package org.webrtc;

/* loaded from: classes9.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j4) {
        super(j4);
    }

    long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
