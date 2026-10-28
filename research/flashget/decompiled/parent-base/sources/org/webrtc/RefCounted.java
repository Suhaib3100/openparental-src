package org.webrtc;

/* loaded from: classes9.dex */
public interface RefCounted {
    @CalledByNative
    void release();

    @CalledByNative
    void retain();
}
