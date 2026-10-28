package org.webrtc;

/* loaded from: classes9.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final IceCandidate local;
    public final String reason;
    public final IceCandidate remote;

    @CalledByNative
    CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i4, String str, int i5) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i4;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i5;
    }
}
