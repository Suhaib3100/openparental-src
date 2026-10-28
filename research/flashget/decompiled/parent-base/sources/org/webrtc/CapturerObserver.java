package org.webrtc;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public interface CapturerObserver {
    void onBitmapCaptured(Bitmap bitmap);

    void onCapturerStarted(boolean z4);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
