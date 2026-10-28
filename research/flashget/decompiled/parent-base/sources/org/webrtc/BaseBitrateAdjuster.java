package org.webrtc;

/* loaded from: classes9.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    BaseBitrateAdjuster() {
    }

    @Override // org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i4) {
    }

    @Override // org.webrtc.BitrateAdjuster
    public void setTargets(int i4, double d5) {
        this.targetBitrateBps = i4;
        this.targetFramerateFps = d5;
    }
}
