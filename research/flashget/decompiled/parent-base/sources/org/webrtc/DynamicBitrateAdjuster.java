package org.webrtc;

/* loaded from: classes9.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    DynamicBitrateAdjuster() {
    }

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i4) {
        double d5 = this.targetFramerateFps;
        if (d5 == com.google.firebase.remoteconfig.p.f60679p) {
            return;
        }
        int i5 = this.targetBitrateBps;
        double d6 = (i4 - ((i5 / BITS_PER_BYTE) / d5)) + this.deviationBytes;
        this.deviationBytes = d6;
        this.timeSinceLastAdjustmentMs = (1000.0d / d5) + this.timeSinceLastAdjustmentMs;
        double d7 = i5 / BITS_PER_BYTE;
        double d10 = BITRATE_ADJUSTMENT_SEC * d7;
        double min = Math.min(d6, d10);
        this.deviationBytes = min;
        double max = Math.max(min, -d10);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d7) {
            int i6 = this.bitrateAdjustmentScaleExp - ((int) ((max / d7) + 0.5d));
            this.bitrateAdjustmentScaleExp = i6;
            this.bitrateAdjustmentScaleExp = Math.max(i6, -20);
            this.deviationBytes = d7;
        } else {
            double d11 = -d7;
            if (max < d11) {
                int i7 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d7) + 0.5d));
                this.bitrateAdjustmentScaleExp = i7;
                this.bitrateAdjustmentScaleExp = Math.min(i7, 20);
                this.deviationBytes = d11;
            }
        }
        this.timeSinceLastAdjustmentMs = com.google.firebase.remoteconfig.p.f60679p;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i4, double d5) {
        int i5 = this.targetBitrateBps;
        if (i5 > 0 && i4 < i5) {
            this.deviationBytes = (this.deviationBytes * i4) / i5;
        }
        super.setTargets(i4, d5);
    }
}
