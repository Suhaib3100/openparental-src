package org.webrtc;

import android.content.Context;

/* loaded from: classes9.dex */
public class EmptyCapturer implements VideoCapturer {
    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i4, int i5, int i6) {
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.VideoCapturer
    public void pauseCapture(boolean z4) {
    }

    @Override // org.webrtc.VideoCapturer
    public boolean startCapture(int i4, int i5, int i6) {
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
    }
}
