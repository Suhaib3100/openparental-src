package com.tencent.rtmp.video;

/* loaded from: classes7.dex */
public interface VirtualDisplayListener {
    void onCaptureError();

    void onStartFinish(boolean z4, boolean z5);

    void onVirtualDisplayCreate(VirtualDisplayWrapper virtualDisplayWrapper);
}
