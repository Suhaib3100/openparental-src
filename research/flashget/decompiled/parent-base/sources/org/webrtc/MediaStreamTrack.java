package org.webrtc;

/* loaded from: classes9.dex */
public class MediaStreamTrack {
    private long nativeTrack;
    public static final String VIDEO_TRACK_KIND = "video";
    public static final String AUDIO_TRACK_KIND = "audio";

    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int nativeIndex;

        MediaType(int i4) {
            this.nativeIndex = i4;
        }

        @CalledByNative("MediaType")
        static MediaType fromNativeIndex(int i4) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i4) {
                    return mediaType;
                }
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown native media type: ", i4));
        }

        @CalledByNative("MediaType")
        int getNative() {
            return this.nativeIndex;
        }
    }

    public enum State {
        LIVE,
        ENDED;

        @CalledByNative("State")
        static State fromNativeIndex(int i4) {
            return values()[i4];
        }
    }

    public MediaStreamTrack(long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("nativeTrack may not be null");
        }
        this.nativeTrack = j4;
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    @androidx.annotation.q0
    static MediaStreamTrack createMediaStreamTrack(long j4) {
        if (j4 == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j4);
        if (nativeGetKind.equals("audio")) {
            return new AudioTrack(j4);
        }
        if (nativeGetKind.equals("video")) {
            return new VideoTrack(j4);
        }
        return null;
    }

    private static native boolean nativeGetEnabled(long j4);

    private static native String nativeGetId(long j4);

    private static native String nativeGetKind(long j4);

    private static native State nativeGetState(long j4);

    private static native boolean nativeSetEnabled(long j4, boolean z4);

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0L;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public String id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z4) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z4);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
