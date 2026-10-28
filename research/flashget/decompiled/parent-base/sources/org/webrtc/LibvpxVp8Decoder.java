package org.webrtc;

/* loaded from: classes9.dex */
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    static native long nativeCreateDecoder(long j4);

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j4) {
        return nativeCreateDecoder(j4);
    }
}
