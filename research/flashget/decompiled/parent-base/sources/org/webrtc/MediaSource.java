package org.webrtc;

/* loaded from: classes9.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        @CalledByNative("State")
        static State fromNativeIndex(int i4) {
            return values()[i4];
        }
    }

    public MediaSource(final long j4) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.g0
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeReleaseRef(j4);
            }
        });
        this.nativeSource = j4;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource == 0) {
            throw new IllegalStateException("MediaSource has been disposed.");
        }
    }

    private static native State nativeGetState(long j4);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    protected long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
