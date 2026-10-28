package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int width;

    public NV21Buffer(byte[] bArr, int i4, int i5, @androidx.annotation.q0 Runnable runnable) {
        this.data = bArr;
        this.width = i4;
        this.height = i5;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i4, int i5, int i6, int i7, int i10, int i11, byte[] bArr, int i12, int i13, ByteBuffer byteBuffer, int i14, ByteBuffer byteBuffer2, int i15, ByteBuffer byteBuffer3, int i16);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i4, int i5, int i6, int i7, int i10, int i11) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i10, i11);
        nativeCropAndScale(i4, i5, i6, i7, i10, i11, this.data, this.width, this.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i4 = this.width;
        int i5 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i4, i5, i4, i5);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420WithoutRetain() {
        int i4 = this.width;
        int i5 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i4, i5, i4, i5);
    }
}
