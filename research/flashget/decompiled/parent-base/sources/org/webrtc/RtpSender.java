package org.webrtc;

import java.util.List;

/* loaded from: classes9.dex */
public class RtpSender {

    @androidx.annotation.q0
    private MediaStreamTrack cachedTrack;

    @androidx.annotation.q0
    private final DtmfSender dtmfSender;
    private long nativeRtpSender;
    private boolean ownsTrack = true;

    @CalledByNative
    public RtpSender(long j4) {
        this.nativeRtpSender = j4;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j4));
        long nativeGetDtmfSender = nativeGetDtmfSender(j4);
        this.dtmfSender = nativeGetDtmfSender != 0 ? new DtmfSender(nativeGetDtmfSender) : null;
    }

    private void checkRtpSenderExists() {
        if (this.nativeRtpSender == 0) {
            throw new IllegalStateException("RtpSender has been disposed.");
        }
    }

    private static native long nativeGetDtmfSender(long j4);

    private static native String nativeGetId(long j4);

    private static native RtpParameters nativeGetParameters(long j4);

    private static native List<String> nativeGetStreams(long j4);

    private static native long nativeGetTrack(long j4);

    private static native void nativeSetFrameEncryptor(long j4, long j5);

    private static native boolean nativeSetParameters(long j4, RtpParameters rtpParameters);

    private static native void nativeSetStreams(long j4, List<String> list);

    private static native boolean nativeSetTrack(long j4, long j5);

    public void dispose() {
        checkRtpSenderExists();
        DtmfSender dtmfSender = this.dtmfSender;
        if (dtmfSender != null) {
            dtmfSender.dispose();
        }
        MediaStreamTrack mediaStreamTrack = this.cachedTrack;
        if (mediaStreamTrack != null && this.ownsTrack) {
            mediaStreamTrack.dispose();
        }
        JniCommon.nativeReleaseRef(this.nativeRtpSender);
        this.nativeRtpSender = 0L;
    }

    @androidx.annotation.q0
    public DtmfSender dtmf() {
        return this.dtmfSender;
    }

    long getNativeRtpSender() {
        checkRtpSenderExists();
        return this.nativeRtpSender;
    }

    public RtpParameters getParameters() {
        checkRtpSenderExists();
        return nativeGetParameters(this.nativeRtpSender);
    }

    public List<String> getStreams() {
        checkRtpSenderExists();
        return nativeGetStreams(this.nativeRtpSender);
    }

    public String id() {
        checkRtpSenderExists();
        return nativeGetId(this.nativeRtpSender);
    }

    public void setFrameEncryptor(FrameEncryptor frameEncryptor) {
        checkRtpSenderExists();
        nativeSetFrameEncryptor(this.nativeRtpSender, frameEncryptor.getNativeFrameEncryptor());
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        checkRtpSenderExists();
        return nativeSetParameters(this.nativeRtpSender, rtpParameters);
    }

    public void setStreams(List<String> list) {
        checkRtpSenderExists();
        nativeSetStreams(this.nativeRtpSender, list);
    }

    public boolean setTrack(@androidx.annotation.q0 MediaStreamTrack mediaStreamTrack, boolean z4) {
        checkRtpSenderExists();
        if (!nativeSetTrack(this.nativeRtpSender, mediaStreamTrack == null ? 0L : mediaStreamTrack.getNativeMediaStreamTrack())) {
            return false;
        }
        MediaStreamTrack mediaStreamTrack2 = this.cachedTrack;
        if (mediaStreamTrack2 != null && this.ownsTrack) {
            mediaStreamTrack2.dispose();
        }
        this.cachedTrack = mediaStreamTrack;
        this.ownsTrack = z4;
        return true;
    }

    @androidx.annotation.q0
    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
