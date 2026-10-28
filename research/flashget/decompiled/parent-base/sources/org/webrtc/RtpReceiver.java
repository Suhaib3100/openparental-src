package org.webrtc;

import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public class RtpReceiver {

    @androidx.annotation.q0
    private MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    public interface Observer {
        @CalledByNative("Observer")
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    @CalledByNative
    public RtpReceiver(long j4) {
        this.nativeRtpReceiver = j4;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j4));
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw new IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    private static native String nativeGetId(long j4);

    private static native RtpParameters nativeGetParameters(long j4);

    private static native long nativeGetTrack(long j4);

    private static native void nativeSetFrameDecryptor(long j4, long j5);

    private static native long nativeSetObserver(long j4, Observer observer);

    private static native void nativeUnsetObserver(long j4, long j5);

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        long j4 = this.nativeObserver;
        if (j4 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j4);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    @CalledByNative
    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j4 = this.nativeObserver;
        if (j4 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j4);
            this.nativeObserver = 0L;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0L;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public String id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    @androidx.annotation.q0
    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
