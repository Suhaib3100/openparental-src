package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class JniCommon {
    static {
        try {
            System.loadLibrary("jingle_peerconnection_so");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static native void nativeAddRef(long j4);

    public static native ByteBuffer nativeAllocateByteBuffer(int i4);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j4);
}
