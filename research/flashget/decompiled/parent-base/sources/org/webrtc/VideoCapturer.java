package org.webrtc;

import android.content.Context;

/* loaded from: classes9.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i4, int i5, int i6);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void pauseCapture(boolean z4);

    boolean startCapture(int i4, int i5, int i6);

    void stopCapture() throws InterruptedException;
}
