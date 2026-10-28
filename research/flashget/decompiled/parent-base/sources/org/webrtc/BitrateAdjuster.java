package org.webrtc;

/* loaded from: classes9.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i4);

    void setTargets(int i4, double d5);
}
